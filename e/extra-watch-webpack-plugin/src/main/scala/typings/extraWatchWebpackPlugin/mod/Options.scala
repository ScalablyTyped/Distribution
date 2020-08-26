package typings.extraWatchWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * attach extra dirs to webpack's watch system
    * @default []
    */
  var dirs: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * (absolute path or glob pattern), attach extra files to webpack's watch system
    * @default []
    */
  var files: js.UndefOr[String | js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDirsVarargs(value: String*): Self = this.set("dirs", js.Array(value :_*))
    @scala.inline
    def setDirs(value: String | js.Array[String]): Self = this.set("dirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirs: Self = this.set("dirs", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

