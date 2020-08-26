package typings.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod

import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsLintReporterOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var files: String | js.Array[String] = js.native
  var memoryLimit: js.UndefOr[Double] = js.native
  var options: js.UndefOr[CLIEngineOptions] = js.native
}

object EsLintReporterOptions {
  @scala.inline
  def apply(files: String | js.Array[String]): EsLintReporterOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsLintReporterOptions]
  }
  @scala.inline
  implicit class EsLintReporterOptionsOps[Self <: EsLintReporterOptions] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryLimit: Self = this.set("memoryLimit", js.undefined)
    @scala.inline
    def setOptions(value: CLIEngineOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

