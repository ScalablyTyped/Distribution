package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailLinkSigninResponse extends js.Object {
  /** The user's email. */
  var email: js.UndefOr[String] = js.native
  /** Expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.native
  /** The STS id token to login the newly signed in user. */
  var idToken: js.UndefOr[String] = js.native
  /** Whether the user is new. */
  var isNewUser: js.UndefOr[Boolean] = js.native
  /** The fixed string "identitytoolkit#EmailLinkSigninResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The RP local ID of the user. */
  var localId: js.UndefOr[String] = js.native
  /** The refresh token for the signed in user. */
  var refreshToken: js.UndefOr[String] = js.native
}

object EmailLinkSigninResponse {
  @scala.inline
  def apply(): EmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailLinkSigninResponse]
  }
  @scala.inline
  implicit class EmailLinkSigninResponseOps[Self <: EmailLinkSigninResponse] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
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
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
  
}

