package typings.googleAuthLibrary.refreshclientMod

import typings.googleAuthLibrary.credentialsMod.JWTInput
import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/refreshclient", "UserRefreshClient")
@js.native
/**
  * User Refresh Token credentials.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param refreshToken The authentication refresh token.
  */
class UserRefreshClient () extends OAuth2Client {
  def this(clientId: String) = this()
  def this(options: UserRefreshClientOptions) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String, refreshToken: String) = this()
  def this(clientId: String, clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
  def this(clientId: String, clientSecret: String, refreshToken: String) = this()
  
  var _refreshToken: js.UndefOr[String | Null] = js.native
  
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * options.
    * @param json The input object.
    */
  def fromJSON(json: JWTInput): Unit = js.native
  
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
  def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  var fromStreamAsync: js.Any = js.native
}
