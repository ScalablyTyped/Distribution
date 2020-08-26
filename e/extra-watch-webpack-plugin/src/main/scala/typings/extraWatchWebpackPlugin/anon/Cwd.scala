package typings.extraWatchWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cwd extends js.Object {
  var cwd: String = js.native
  var dirs: js.Array[String] = js.native
  var files: js.Array[String] = js.native
}

object Cwd {
  @scala.inline
  def apply(cwd: String, dirs: js.Array[String], files: js.Array[String]): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
  @scala.inline
  implicit class CwdOps[Self <: Cwd] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirsVarargs(value: String*): Self = this.set("dirs", js.Array(value :_*))
    @scala.inline
    def setDirs(value: js.Array[String]): Self = this.set("dirs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

