package typings.expoDevServer

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHermesBundlerMod {
  
  @JSImport("@expo/dev-server/build/HermesBundler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildHermesBundleAsync(projectRoot: String, code: String, map: String): js.Promise[HermesBundleOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHermesBundleAsync")(projectRoot.asInstanceOf[js.Any], code.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HermesBundleOutput]]
  inline def buildHermesBundleAsync(projectRoot: String, code: String, map: String, optimize: Boolean): js.Promise[HermesBundleOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHermesBundleAsync")(projectRoot.asInstanceOf[js.Any], code.asInstanceOf[js.Any], map.asInstanceOf[js.Any], optimize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HermesBundleOutput]]
  
  inline def createHermesSourcemapAsync(projectRoot: String, sourcemap: String, hermesMapFile: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHermesSourcemapAsync")(projectRoot.asInstanceOf[js.Any], sourcemap.asInstanceOf[js.Any], hermesMapFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getHermesBytecodeBundleVersionAsync(file: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHermesBytecodeBundleVersionAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def isEnableHermesManaged(
    expoConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoConfig */ Any,
    platform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Platform */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnableHermesManaged")(expoConfig.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isHermesBytecodeBundleAsync(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHermesBytecodeBundleAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def maybeInconsistentEngineAndroidAsync(projectRoot: String, isHermesManaged: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeInconsistentEngineAndroidAsync")(projectRoot.asInstanceOf[js.Any], isHermesManaged.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def maybeInconsistentEngineIosAsync(projectRoot: String, isHermesManaged: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeInconsistentEngineIosAsync")(projectRoot.asInstanceOf[js.Any], isHermesManaged.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def maybeThrowFromInconsistentEngineAsync(projectRoot: String, configFilePath: String, platform: String, isHermesManaged: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeThrowFromInconsistentEngineAsync")(projectRoot.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], isHermesManaged.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def parseGradleProperties(content: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradleProperties")(content.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  trait HermesBundleOutput extends StObject {
    
    var hbc: js.typedarray.Uint8Array
    
    var sourcemap: String
  }
  object HermesBundleOutput {
    
    inline def apply(hbc: js.typedarray.Uint8Array, sourcemap: String): HermesBundleOutput = {
      val __obj = js.Dynamic.literal(hbc = hbc.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[HermesBundleOutput]
    }
    
    extension [Self <: HermesBundleOutput](x: Self) {
      
      inline def setHbc(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hbc", value.asInstanceOf[js.Any])
      
      inline def setSourcemap(value: String): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
}
