package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.PartialTypeScriptDiagnost
import typings.forkTsCheckerWebpackPlugin.anon.`0`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-dts`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
import typings.forkTsCheckerWebpackPlugin.libTypescriptTypeScriptConfigOverwriteMod.TypeScriptConfigOverwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypeScriptWorkerOptionsMod {
  
  trait TypeScriptWorkerOptions extends StObject {
    
    var build: js.UndefOr[Boolean] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var configOverwrite: js.UndefOr[TypeScriptConfigOverwrite] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var diagnosticOptions: js.UndefOr[PartialTypeScriptDiagnost] = js.undefined
    
    var extensions: js.UndefOr[`0`] = js.undefined
    
    var memoryLimit: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[readonly | `write-tsbuildinfo` | `write-dts` | `write-references`] = js.undefined
    
    var profile: js.UndefOr[Boolean] = js.undefined
    
    var typescriptPath: js.UndefOr[String] = js.undefined
  }
  object TypeScriptWorkerOptions {
    
    inline def apply(): TypeScriptWorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptWorkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeScriptWorkerOptions] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setConfigOverwrite(value: TypeScriptConfigOverwrite): Self = StObject.set(x, "configOverwrite", value.asInstanceOf[js.Any])
      
      inline def setConfigOverwriteUndefined: Self = StObject.set(x, "configOverwrite", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDiagnosticOptions(value: PartialTypeScriptDiagnost): Self = StObject.set(x, "diagnosticOptions", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticOptionsUndefined: Self = StObject.set(x, "diagnosticOptions", js.undefined)
      
      inline def setExtensions(value: `0`): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
      
      inline def setMode(value: readonly | `write-tsbuildinfo` | `write-dts` | `write-references`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTypescriptPath(value: String): Self = StObject.set(x, "typescriptPath", value.asInstanceOf[js.Any])
      
      inline def setTypescriptPathUndefined: Self = StObject.set(x, "typescriptPath", js.undefined)
    }
  }
}
