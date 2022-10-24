package typings.expoMetroConfig

import typings.expoMetroConfig.expoMetroConfigStrings.exotic
import typings.metro.libReportingMod.Reporter
import typings.metroConfig.configTypesMod.ConfigT
import typings.metroConfig.configTypesMod.InputConfigT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoMetroConfigMod {
  
  @JSImport("@expo/metro-config/build/ExpoMetroConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/metro-config/build/ExpoMetroConfig", "EXPO_DEBUG")
  @js.native
  val EXPO_DEBUG: Boolean = js.native
  
  @JSImport("@expo/metro-config/build/ExpoMetroConfig", "INTERNAL_CALLSITES_REGEX")
  @js.native
  val INTERNAL_CALLSITES_REGEX: js.RegExp = js.native
  
  inline def getDefaultConfig(projectRoot: String): InputConfigT = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[InputConfigT]
  inline def getDefaultConfig(projectRoot: String, options: DefaultConfigOptions): InputConfigT = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InputConfigT]
  
  inline def loadAsync(projectRoot: String): js.Promise[ConfigT] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigT]]
  inline def loadAsync(projectRoot: String, param1: LoadOptions): js.Promise[ConfigT] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigT]]
  
  trait DefaultConfigOptions extends StObject {
    
    var mode: js.UndefOr[exotic] = js.undefined
    
    var target: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectTarget */ Any
      ] = js.undefined
  }
  object DefaultConfigOptions {
    
    inline def apply(): DefaultConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultConfigOptions]
    }
    
    extension [Self <: DefaultConfigOptions](x: Self) {
      
      inline def setMode(value: exotic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTarget(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectTarget */ Any
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait LoadOptions extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var maxWorkers: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var reporter: js.UndefOr[Reporter] = js.undefined
    
    var resetCache: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectTarget */ Any
      ] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setTarget(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectTarget */ Any
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
