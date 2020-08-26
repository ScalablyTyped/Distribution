package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesUsed extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object BytesUsed {
  @scala.inline
  def apply(): BytesUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesUsed]
  }
  @scala.inline
  implicit class BytesUsedOps[Self <: BytesUsed] (val x: Self) extends AnyVal {
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
    def setBytesUsed(value: String): Self = this.set("bytesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesUsed: Self = this.set("bytesUsed", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

