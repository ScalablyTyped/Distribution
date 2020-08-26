package typings.googleAuthLibrary.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * A token that can be sent to a Google API.
    */
  var access_token: js.UndefOr[String | Null] = js.native
  /**
    * The time in ms at which this token is thought to expire.
    */
  var expiry_date: js.UndefOr[Double | Null] = js.native
  /**
    * A JWT that contains identity information about the user that is digitally signed by Google.
    */
  var id_token: js.UndefOr[String | Null] = js.native
  /**
    * This field is only present if the access_type parameter was set to offline in the authentication request. For details, see Refresh tokens.
    */
  var refresh_token: js.UndefOr[String | Null] = js.native
  /**
    * The scopes of access granted by the access_token expressed as a list of space-delimited, case-sensitive strings.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Identifies the type of token returned. At this time, this field always has the value Bearer.
    */
  var token_type: js.UndefOr[String | Null] = js.native
}

object Credentials {
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAccess_tokenNull: Self = this.set("access_token", null)
    @scala.inline
    def setExpiry_date(value: Double): Self = this.set("expiry_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiry_date: Self = this.set("expiry_date", js.undefined)
    @scala.inline
    def setExpiry_dateNull: Self = this.set("expiry_date", null)
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    @scala.inline
    def setId_tokenNull: Self = this.set("id_token", null)
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    @scala.inline
    def setRefresh_tokenNull: Self = this.set("refresh_token", null)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
    @scala.inline
    def setToken_typeNull: Self = this.set("token_type", null)
  }
  
}

