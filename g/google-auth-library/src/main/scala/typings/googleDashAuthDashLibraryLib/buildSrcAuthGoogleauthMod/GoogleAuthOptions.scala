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

