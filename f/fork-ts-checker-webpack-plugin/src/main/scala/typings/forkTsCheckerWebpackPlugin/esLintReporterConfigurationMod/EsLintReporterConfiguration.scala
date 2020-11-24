package typings.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod

import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsLintReporterConfiguration extends js.Object {
  
  var enabled: Boolean = js.native
  
  var files: js.Array[String] = js.native
  
  var memoryLimit: Double = js.native
  
  var options: CLIEngineOptions = js.native
}
object EsLintReporterConfiguration {
  
  @scala.inline
  def apply(enabled: Boolean, files: js.Array[String], memoryLimit: Double, options: CLIEngineOptions): EsLintReporterConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsLintReporterConfiguration]
  }
  
  @scala.inline
  implicit class EsLintReporterConfigurationOps[Self <: EsLintReporterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CLIEngineOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
