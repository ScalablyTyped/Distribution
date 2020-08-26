package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransportOptions extends TransportOptions {
  var file: String = js.native
}

object FileTransportOptions {
  @scala.inline
  def apply(file: String): FileTransportOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransportOptions]
  }
  @scala.inline
  implicit class FileTransportOptionsOps[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
  }
  
}

