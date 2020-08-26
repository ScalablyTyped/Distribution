package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignJwtResponse extends js.Object {
  /** The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[String] = js.native
  /** The signed JWT. */
  var signedJwt: js.UndefOr[String] = js.native
}

object SignJwtResponse {
  @scala.inline
  def apply(): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtResponse]
  }
  @scala.inline
  implicit class SignJwtResponseOps[Self <: SignJwtResponse] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setSignedJwt(value: String): Self = this.set("signedJwt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignedJwt: Self = this.set("signedJwt", js.undefined)
  }
  
}

