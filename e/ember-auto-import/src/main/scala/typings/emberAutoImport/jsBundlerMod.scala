package typings.emberAutoImport

import typings.babelCore.mod.TransformOptions
import typings.emberAutoImport.anon.FnCall
import typings.emberAutoImport.emberAutoImportStrings.development
import typings.emberAutoImport.emberAutoImportStrings.production
import typings.emberAutoImport.emberAutoImportStrings.test
import typings.emberAutoImport.jsBundleConfigMod.BundleName
import typings.emberAutoImport.jsBundleConfigMod.default
import typings.std.Map
import typings.std.Set
import typings.webpack.mod.CallbackWebpack
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.MultiCompilerOptions
import typings.webpack.mod.MultiStats
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsBundlerMod {
  
  @JSImport("ember-auto-import/js/bundler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debugBundler(bundler: Bundler, label: String): Bundler = (^.asInstanceOf[js.Dynamic].applyDynamic("debugBundler")(bundler.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Bundler]
  
  trait BuildResult extends StObject {
    
    var entrypoints: Map[BundleName | String, js.Array[String]]
    
    def externalDepsFor(request: String): js.Array[String]
    
    var lazyAssets: js.Array[String]
  }
  object BuildResult {
    
    inline def apply(
      entrypoints: Map[BundleName | String, js.Array[String]],
      externalDepsFor: String => js.Array[String],
      lazyAssets: js.Array[String]
    ): BuildResult = {
      val __obj = js.Dynamic.literal(entrypoints = entrypoints.asInstanceOf[js.Any], externalDepsFor = js.Any.fromFunction1(externalDepsFor), lazyAssets = lazyAssets.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildResult] (val x: Self) extends AnyVal {
      
      inline def setEntrypoints(value: Map[BundleName | String, js.Array[String]]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setExternalDepsFor(value: String => js.Array[String]): Self = StObject.set(x, "externalDepsFor", js.Any.fromFunction1(value))
      
      inline def setLazyAssets(value: js.Array[String]): Self = StObject.set(x, "lazyAssets", value.asInstanceOf[js.Any])
      
      inline def setLazyAssetsVarargs(value: String*): Self = StObject.set(x, "lazyAssets", js.Array(value*))
    }
  }
  
  @js.native
  trait Bundler
    extends typings.broccoliPlugin.mod.^ {
    
    var buildResult: BuildResult = js.native
  }
  
  trait BundlerOptions extends StObject {
    
    var appRoot: String
    
    var babelConfig: TransformOptions
    
    var browserslist: String
    
    var bundles: default
    
    def consoleWrite(msg: String): Unit
    
    var environment: development | test | production
    
    var hasFastboot: Boolean
    
    var packages: Set[typings.emberAutoImport.jsPackageMod.default]
    
    var publicAssetURL: js.UndefOr[String] = js.undefined
    
    var rootPackage: typings.emberAutoImport.jsPackageMod.default
    
    var splitter: typings.emberAutoImport.jsSplitterMod.default
    
    var v2Addons: Map[String, String]
    
    def webpack(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler
    def webpack(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler
    def webpack(options: Configuration): Compiler
    def webpack(options: Configuration, callback: CallbackWebpack[Stats]): Compiler
    @JSName("webpack")
    var webpack_Original: FnCall
  }
  object BundlerOptions {
    
    inline def apply(
      appRoot: String,
      babelConfig: TransformOptions,
      browserslist: String,
      bundles: default,
      consoleWrite: String => Unit,
      environment: development | test | production,
      hasFastboot: Boolean,
      packages: Set[typings.emberAutoImport.jsPackageMod.default],
      rootPackage: typings.emberAutoImport.jsPackageMod.default,
      splitter: typings.emberAutoImport.jsSplitterMod.default,
      v2Addons: Map[String, String],
      webpack: FnCall
    ): BundlerOptions = {
      val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any], babelConfig = babelConfig.asInstanceOf[js.Any], browserslist = browserslist.asInstanceOf[js.Any], bundles = bundles.asInstanceOf[js.Any], consoleWrite = js.Any.fromFunction1(consoleWrite), environment = environment.asInstanceOf[js.Any], hasFastboot = hasFastboot.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], rootPackage = rootPackage.asInstanceOf[js.Any], splitter = splitter.asInstanceOf[js.Any], v2Addons = v2Addons.asInstanceOf[js.Any], webpack = webpack.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundlerOptions] (val x: Self) extends AnyVal {
      
      inline def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      inline def setBabelConfig(value: TransformOptions): Self = StObject.set(x, "babelConfig", value.asInstanceOf[js.Any])
      
      inline def setBrowserslist(value: String): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
      
      inline def setBundles(value: default): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setConsoleWrite(value: String => Unit): Self = StObject.set(x, "consoleWrite", js.Any.fromFunction1(value))
      
      inline def setEnvironment(value: development | test | production): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setHasFastboot(value: Boolean): Self = StObject.set(x, "hasFastboot", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: Set[typings.emberAutoImport.jsPackageMod.default]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPublicAssetURL(value: String): Self = StObject.set(x, "publicAssetURL", value.asInstanceOf[js.Any])
      
      inline def setPublicAssetURLUndefined: Self = StObject.set(x, "publicAssetURL", js.undefined)
      
      inline def setRootPackage(value: typings.emberAutoImport.jsPackageMod.default): Self = StObject.set(x, "rootPackage", value.asInstanceOf[js.Any])
      
      inline def setSplitter(value: typings.emberAutoImport.jsSplitterMod.default): Self = StObject.set(x, "splitter", value.asInstanceOf[js.Any])
      
      inline def setV2Addons(value: Map[String, String]): Self = StObject.set(x, "v2Addons", value.asInstanceOf[js.Any])
      
      inline def setWebpack(value: FnCall): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
    }
  }
}
