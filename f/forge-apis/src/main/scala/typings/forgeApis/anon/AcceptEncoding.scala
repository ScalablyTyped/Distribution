package typings.forgeApis.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptEncoding extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.native
  var ifModifiedSince: js.UndefOr[Date] = js.native
}

object AcceptEncoding {
  @scala.inline
  def apply(): AcceptEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptEncoding]
  }
  @scala.inline
  implicit class AcceptEncodingOps[Self <: AcceptEncoding] (val x: Self) extends AnyVal {
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
    def setAcceptEncoding(value: String): Self = this.set("acceptEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptEncoding: Self = this.set("acceptEncoding", js.undefined)
    @scala.inline
    def setIfModifiedSince(value: Date): Self = this.set("ifModifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("ifModifiedSince", js.undefined)
  }
  
}

