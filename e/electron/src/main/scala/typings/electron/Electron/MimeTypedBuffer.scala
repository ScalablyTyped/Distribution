package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimeTypedBuffer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/mime-typed-buffer
  /**
    * The actual Buffer content.
    */
  var data: Buffer = js.native
  /**
    * The mimeType of the Buffer that you are sending.
    */
  var mimeType: String = js.native
}

object MimeTypedBuffer {
  @scala.inline
  def apply(data: Buffer, mimeType: String): MimeTypedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeTypedBuffer]
  }
  @scala.inline
  implicit class MimeTypedBufferOps[Self <: MimeTypedBuffer] (val x: Self) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
  
}

