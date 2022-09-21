package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Vue
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-dts`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
import typings.forkTsCheckerWebpackPlugin.typeScriptConfigOverwriteMod.TypeScriptConfigOverwrite
import typings.forkTsCheckerWebpackPlugin.typeScriptDiagnosticsOptionsMod.TypeScriptDiagnosticsOptions
import typings.forkTsCheckerWebpackPlugin.typeScriptWorkerOptionsMod.TypeScriptWorkerOptions
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptWorkerConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/type-script-worker-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeScriptWorkerConfig(compiler: Compiler): TypeScriptWorkerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptWorkerConfig")(compiler.asInstanceOf[js.Any]).asInstanceOf[TypeScriptWorkerConfig]
  inline def createTypeScriptWorkerConfig(compiler: Compiler, options: TypeScriptWorkerOptions): TypeScriptWorkerConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptWorkerConfig")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TypeScriptWorkerConfig]
  
  trait TypeScriptWorkerConfig extends StObject {
    
    var build: Boolean
    
    var configFile: String
    
    var configOverwrite: TypeScriptConfigOverwrite
    
    var context: String
    
    var diagnosticOptions: TypeScriptDiagnosticsOptions
    
    var enabled: Boolean
    
    var extensions: Vue
    
    var memoryLimit: Double
    
    var mode: readonly | `write-dts` | `write-tsbuildinfo` | `write-references`
    
    var profile: Boolean
    
    var typescriptPath: String
  }
  object TypeScriptWorkerConfig {
    
    inline def apply(
      build: Boolean,
      configFile: String,
      configOverwrite: TypeScriptConfigOverwrite,
      context: String,
      diagnosticOptions: TypeScriptDiagnosticsOptions,
      enabled: Boolean,
      extensions: Vue,
      memoryLimit: Double,
      mode: readonly | `write-dts` | `write-tsbuildinfo` | `write-references`,
      profile: Boolean,
      typescriptPath: String
    ): TypeScriptWorkerConfig = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], configOverwrite = configOverwrite.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], diagnosticOptions = diagnosticOptions.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], typescriptPath = typescriptPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptWorkerConfig]
    }
    
    extension [Self <: TypeScriptWorkerConfig](x: Self) {
      
      inline def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigOverwrite(value: TypeScriptConfigOverwrite): Self = StObject.set(x, "configOverwrite", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticOptions(value: TypeScriptDiagnosticsOptions): Self = StObject.set(x, "diagnosticOptions", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: Vue): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      inline def setMode(value: readonly | `write-dts` | `write-tsbuildinfo` | `write-references`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setTypescriptPath(value: String): Self = StObject.set(x, "typescriptPath", value.asInstanceOf[js.Any])
    }
  }
}
