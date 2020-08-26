package typings.fsExtra.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResult extends js.Object {
  var buffer: Buffer = js.native
  var bytesWritten: Double = js.native
}

object WriteResult {
  @scala.inline
  def apply(buffer: Buffer, bytesWritten: Double): WriteResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  @scala.inline
  implicit class WriteResultOps[Self <: WriteResult] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
  
}

