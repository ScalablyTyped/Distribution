package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteCount extends js.Object {
  var byteCount: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ByteCount {
  @scala.inline
  def apply(): ByteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteCount]
  }
  @scala.inline
  implicit class ByteCountOps[Self <: ByteCount] (val x: Self) extends AnyVal {
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
    def setByteCount(value: String): Self = this.set("byteCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteCount: Self = this.set("byteCount", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

