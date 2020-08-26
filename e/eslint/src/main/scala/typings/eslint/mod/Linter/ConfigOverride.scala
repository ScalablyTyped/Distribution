package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOverride extends BaseConfig {
  var excludedFiles: js.UndefOr[String | js.Array[String]] = js.native
  var files: String | js.Array[String] = js.native
}

object ConfigOverride {
  @scala.inline
  def apply(files: String | js.Array[String]): ConfigOverride = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOverride]
  }
  @scala.inline
  implicit class ConfigOverrideOps[Self <: ConfigOverride] (val x: Self) extends AnyVal {
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
    def setExcludedFilesVarargs(value: String*): Self = this.set("excludedFiles", js.Array(value :_*))
    @scala.inline
    def setExcludedFiles(value: String | js.Array[String]): Self = this.set("excludedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedFiles: Self = this.set("excludedFiles", js.undefined)
  }
  
}

