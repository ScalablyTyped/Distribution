package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignBlobRequest extends js.Object {
  /** The bytes to sign. */
  var bytesToSign: js.UndefOr[String] = js.native
}

object SignBlobRequest {
  @scala.inline
  def apply(): SignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignBlobRequest]
  }
  @scala.inline
  implicit class SignBlobRequestOps[Self <: SignBlobRequest] (val x: Self) extends AnyVal {
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
    def setBytesToSign(value: String): Self = this.set("bytesToSign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesToSign: Self = this.set("bytesToSign", js.undefined)
  }
  
}

