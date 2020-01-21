package typings.googleAuthLibrary.googleauthMod

import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAuthOptions extends js.Object {
  /**
    * Options object passed to the constructor of the client
    */
  var clientOptions: js.UndefOr[JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions] = js.undefined
  /**
    * Object containing client_email and private_key properties
    */
  var credentials: js.UndefOr[CredentialBody] = js.undefined
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFile: js.UndefOr[String] = js.undefined
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFilename: js.UndefOr[String] = js.undefined
  /**
    * Your project ID.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Required scopes for the desired API request
    */
  var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
}

object GoogleAuthOptions {
  @scala.inline
  def apply(
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    keyFile: String = null,
    keyFilename: String = null,
    projectId: String = null,
    scopes: String | js.Array[String] = null
  ): GoogleAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAuthOptions]
  }
}

