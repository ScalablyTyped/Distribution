package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyIdTokenOptions extends js.Object {
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  var idToken: String = js.native
  var maxExpiry: js.UndefOr[Double] = js.native
}

object VerifyIdTokenOptions {
  @scala.inline
  def apply(idToken: String): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
  @scala.inline
  implicit class VerifyIdTokenOptionsOps[Self <: VerifyIdTokenOptions] (val x: Self) extends AnyVal {
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
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setMaxExpiry(value: Double): Self = this.set("maxExpiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxExpiry: Self = this.set("maxExpiry", js.undefined)
  }
  
}

