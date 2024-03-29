package typings.expoDevServer

import typings.connect.mod.HandleFunction
import typings.connect.mod.Server
import typings.expoDevServer.anon.AttachToServer
import typings.expoDevServer.anon.InspectorProxy
import typings.expoDevServer.anon.Logger
import typings.expoDevServer.anon.Middleware
import typings.expoDevServer.buildJsInspectorMod.MetroInspectorProxyApp
import typings.expoDevServer.buildLogReporterMod.default
import typings.expoDevServer.expoDevServerStrings.android
import typings.expoDevServer.expoDevServerStrings.ios
import typings.expoDevServer.expoDevServerStrings.web
import typings.metro.assetMod.AssetData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMetroDevServerMod {
  
  @JSImport("@expo/dev-server/build/MetroDevServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/dev-server/build/MetroDevServer", "LogReporter")
  @js.native
  open class LogReporter protected () extends default {
    def this(logger: typings.expoBunyan.mod.^) = this()
    def this(logger: typings.expoBunyan.mod.^, reportEvent: js.Function1[/* event */ Any, Unit]) = this()
  }
  
  inline def attachInspectorProxy(projectRoot: String, param1: Middleware): InspectorProxy = (^.asInstanceOf[js.Dynamic].applyDynamic("attachInspectorProxy")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InspectorProxy]
  
  inline def bundleAsync(
    projectRoot: String,
    expoConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoConfig */ Any,
    options: MetroDevServerOptions,
    bundles: js.Array[BundleOptions]
  ): js.Promise[js.Array[BundleOutput]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleAsync")(projectRoot.asInstanceOf[js.Any], expoConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[BundleOutput]]]
  
  inline def closeJsInspector(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeJsInspector")().asInstanceOf[js.Promise[Unit]]
  
  inline def createDevServerMiddleware(projectRoot: String, param1: Logger): AttachToServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createDevServerMiddleware")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[AttachToServer]
  
  inline def openJsInspector(app: MetroInspectorProxyApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openJsInspector")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def prependMiddleware(app: Server, middleware: HandleFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prependMiddleware")(app.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def queryAllInspectorAppsAsync(metroServerOrigin: String): js.Promise[js.Array[MetroInspectorProxyApp]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllInspectorAppsAsync")(metroServerOrigin.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MetroInspectorProxyApp]]]
  
  inline def queryInspectorAppAsync(metroServerOrigin: String, appId: String): js.Promise[MetroInspectorProxyApp | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryInspectorAppAsync")(metroServerOrigin.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroInspectorProxyApp | Null]]
  
  inline def replaceMiddlewareWith(app: Server, sourceMiddleware: HandleFunction, targetMiddleware: HandleFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMiddlewareWith")(app.asInstanceOf[js.Any], sourceMiddleware.asInstanceOf[js.Any], targetMiddleware.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def runMetroDevServerAsync(projectRoot: String, options: MetroDevServerOptions): js.Promise[typings.expoDevServer.anon.MessageSocket] = (^.asInstanceOf[js.Dynamic].applyDynamic("runMetroDevServerAsync")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.expoDevServer.anon.MessageSocket]]
  
  trait BundleAssetWithFileHashes
    extends StObject
       with AssetData {
    
    var fileHashes: js.Array[String]
  }
  object BundleAssetWithFileHashes {
    
    inline def apply(
      __packager_asset: Boolean,
      fileHashes: js.Array[String],
      fileSystemLocation: String,
      files: js.Array[String],
      hash: String,
      httpServerLocation: String,
      name: String,
      scales: js.Array[Double],
      `type`: String
    ): BundleAssetWithFileHashes = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileHashes = fileHashes.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleAssetWithFileHashes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleAssetWithFileHashes] (val x: Self) extends AnyVal {
      
      inline def setFileHashes(value: js.Array[String]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
      
      inline def setFileHashesVarargs(value: String*): Self = StObject.set(x, "fileHashes", js.Array(value*))
    }
  }
  
  trait BundleOptions extends StObject {
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var entryPoint: String
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var platform: android | ios | web
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
  }
  object BundleOptions {
    
    inline def apply(entryPoint: String, platform: android | ios | web): BundleOptions = {
      val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleOptions] (val x: Self) extends AnyVal {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setPlatform(value: android | ios | web): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
    }
  }
  
  trait BundleOutput extends StObject {
    
    var assets: js.Array[BundleAssetWithFileHashes]
    
    var code: String
    
    var hermesBytecodeBundle: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var hermesSourcemap: js.UndefOr[String] = js.undefined
    
    var map: String
  }
  object BundleOutput {
    
    inline def apply(assets: js.Array[BundleAssetWithFileHashes], code: String, map: String): BundleOutput = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleOutput] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: js.Array[BundleAssetWithFileHashes]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: BundleAssetWithFileHashes*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHermesBytecodeBundle(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hermesBytecodeBundle", value.asInstanceOf[js.Any])
      
      inline def setHermesBytecodeBundleUndefined: Self = StObject.set(x, "hermesBytecodeBundle", js.undefined)
      
      inline def setHermesSourcemap(value: String): Self = StObject.set(x, "hermesSourcemap", value.asInstanceOf[js.Any])
      
      inline def setHermesSourcemapUndefined: Self = StObject.set(x, "hermesSourcemap", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageSocket extends StObject {
    
    def broadcast(method: String): Unit = js.native
    def broadcast(method: String, params: Record[String, Any]): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadOptions * / any */ trait MetroDevServerOptions extends StObject {
    
    var logger: typings.expoBunyan.mod.^
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var unversioned: js.UndefOr[Boolean] = js.undefined
  }
  object MetroDevServerOptions {
    
    inline def apply(logger: typings.expoBunyan.mod.^): MetroDevServerOptions = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetroDevServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetroDevServerOptions] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: typings.expoBunyan.mod.^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setUnversioned(value: Boolean): Self = StObject.set(x, "unversioned", value.asInstanceOf[js.Any])
      
      inline def setUnversionedUndefined: Self = StObject.set(x, "unversioned", js.undefined)
    }
  }
}
