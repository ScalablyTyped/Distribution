package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUrl extends js.Object {
  var fileUrl: String = js.native
}

object FileUrl {
  @scala.inline
  def apply(fileUrl: String): FileUrl = {
    val __obj = js.Dynamic.literal(fileUrl = fileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUrl]
  }
  @scala.inline
  implicit class FileUrlOps[Self <: FileUrl] (val x: Self) extends AnyVal {
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
    def setFileUrl(value: String): Self = this.set("fileUrl", value.asInstanceOf[js.Any])
  }
  
}

