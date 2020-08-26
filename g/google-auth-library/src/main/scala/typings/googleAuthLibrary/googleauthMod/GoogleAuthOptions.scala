package typings.googleAuthLibrary.googleauthMod

import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleAuthOptions extends js.Object {
  /**
    * Options object passed to the constructor of the client
    */
  var clientOptions: js.UndefOr[JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions] = js.native
  /**
    * Object containing client_email and private_key properties
    */
  var credentials: js.UndefOr[CredentialBody] = js.native
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFile: js.UndefOr[String] = js.native
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFilename: js.UndefOr[String] = js.native
  /**
    * Your project ID.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required scopes for the desired API request
    */
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
}

object GoogleAuthOptions {
  @scala.inline
  def apply(): GoogleAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAuthOptions]
  }
  @scala.inline
  implicit class GoogleAuthOptionsOps[Self <: GoogleAuthOptions] (val x: Self) extends AnyVal {
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
    def setClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions): Self = this.set("clientOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientOptions: Self = this.set("clientOptions", js.undefined)
    @scala.inline
    def setCredentials(value: CredentialBody): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    @scala.inline
    def setKeyFilename(value: String): Self = this.set("keyFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFilename: Self = this.set("keyFilename", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: String | js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

