package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignJwtRequest extends js.Object {
  /** The JWT payload to sign, a JSON JWT Claim set. */
  var payload: js.UndefOr[String] = js.native
}

object SignJwtRequest {
  @scala.inline
  def apply(): SignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtRequest]
  }
  @scala.inline
  implicit class SignJwtRequestOps[Self <: SignJwtRequest] (val x: Self) extends AnyVal {
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

