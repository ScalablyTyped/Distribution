package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyCustomTokenResponse extends js.Object {
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.native
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[Boolean] = js.native
  /** The fixed string "identitytoolkit#VerifyCustomTokenResponse". */
  var kind: js.UndefOr[String] = js.native
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.native
}

object VerifyCustomTokenResponse {
  @scala.inline
  def apply(): VerifyCustomTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyCustomTokenResponse]
  }
  @scala.inline
  implicit class VerifyCustomTokenResponseOps[Self <: VerifyCustomTokenResponse] (val x: Self) extends AnyVal {
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
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setIsNewUser(value: Boolean): Self = this.set("isNewUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNewUser: Self = this.set("isNewUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
  
}

