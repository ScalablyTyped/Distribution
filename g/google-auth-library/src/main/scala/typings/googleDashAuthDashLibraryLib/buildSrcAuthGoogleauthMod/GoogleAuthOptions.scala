package typings
package googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAuthOptions extends js.Object {
  /**
    * Options object passed to the constructor of the client
    */
  var clientOptions: js.UndefOr[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
  ] = js.undefined
  /**
    * Object containing client_email and private_key properties
    */
  var credentials: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody] = js.undefined
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Your project ID.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required scopes for the desired API request
    */
  var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object GoogleAuthOptions {
  @scala.inline
  def apply(
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    projectId: java.lang.String = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null
  ): GoogleAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAuthOptions]
  }
}

