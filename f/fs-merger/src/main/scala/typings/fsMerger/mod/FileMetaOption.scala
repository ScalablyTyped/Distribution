package typings.fsMerger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMetaOption extends js.Object {
  var basePath: String = js.native
}

object FileMetaOption {
  @scala.inline
  def apply(basePath: String): FileMetaOption = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMetaOption]
  }
  @scala.inline
  implicit class FileMetaOptionOps[Self <: FileMetaOption] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
  }
  
}

