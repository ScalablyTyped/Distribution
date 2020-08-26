package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthCredentialOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var rawNonce: js.UndefOr[String] = js.native
}

object OAuthCredentialOptions {
  @scala.inline
  def apply(): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
  @scala.inline
  implicit class OAuthCredentialOptionsOps[Self <: OAuthCredentialOptions] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setRawNonce(value: String): Self = this.set("rawNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawNonce: Self = this.set("rawNonce", js.undefined)
  }
  
}

