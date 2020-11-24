package typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod

import typings.forkTsCheckerWebpackPlugin.anon.Vue
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
import typings.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import typings.forkTsCheckerWebpackPlugin.typeScriptDiagnosticsOptionsMod.TypeScriptDiagnosticsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptReporterConfiguration extends js.Object {
  
  var build: Boolean = js.native
  
  var configFile: String = js.native
  
  var configOverwrite: TypeScriptConfigurationOverwrite = js.native
  
  var context: String = js.native
  
  var diagnosticOptions: TypeScriptDiagnosticsOptions = js.native
  
  var enabled: Boolean = js.native
  
  var extensions: Vue = js.native
  
  var memoryLimit: Double = js.native
  
  var mode: readonly | `write-tsbuildinfo` | `write-references` = js.native
  
  var profile: Boolean = js.native
  
  var typescriptPath: String = js.native
}
object TypeScriptReporterConfiguration {
  
  @scala.inline
  def apply(
    build: Boolean,
    configFile: String,
    configOverwrite: TypeScriptConfigurationOverwrite,
    context: String,
    diagnosticOptions: TypeScriptDiagnosticsOptions,
    enabled: Boolean,
    extensions: Vue,
    memoryLimit: Double,
    mode: readonly | `write-tsbuildinfo` | `write-references`,
    profile: Boolean,
    typescriptPath: String
  ): TypeScriptReporterConfiguration = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], configOverwrite = configOverwrite.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], diagnosticOptions = diagnosticOptions.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], typescriptPath = typescriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptReporterConfiguration]
  }
  
  @scala.inline
  implicit class TypeScriptReporterConfigurationOps[Self <: TypeScriptReporterConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: Boolean): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigOverwrite(value: TypeScriptConfigurationOverwrite): Self = this.set("configOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticOptions(value: TypeScriptDiagnosticsOptions): Self = this.set("diagnosticOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: Vue): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: readonly | `write-tsbuildinfo` | `write-references`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypescriptPath(value: String): Self = this.set("typescriptPath", value.asInstanceOf[js.Any])
  }
}
