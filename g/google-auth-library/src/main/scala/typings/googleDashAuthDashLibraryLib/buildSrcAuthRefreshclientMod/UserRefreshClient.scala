package typings
package googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/refreshclient", "UserRefreshClient")
@js.native
/**
  * User Refresh Token credentials.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param refreshToken The authentication refresh token.
  */
class UserRefreshClient ()
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client {
  def this(clientId: java.lang.String) = this()
  def this(options: UserRefreshClientOptions) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String, refreshToken: java.lang.String) = this()
  var _refreshToken: js.UndefOr[java.lang.String | scala.Null] = js.native
  var fromStreamAsync: js.Any = js.native
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * options.
    * @param json The input object.
    */
  def fromJSON(json: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput): scala.Unit = js.native
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: nodeLib.streamMod.Readable): js.Promise[scala.Unit] = js.native
  def fromStream(
    inputStream: nodeLib.streamMod.Readable,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

