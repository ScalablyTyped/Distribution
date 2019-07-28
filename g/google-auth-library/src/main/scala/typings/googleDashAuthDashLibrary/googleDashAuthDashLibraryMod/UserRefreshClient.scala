package typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod

import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", "UserRefreshClient")
@js.native
/**
  * User Refresh Token credentials.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param refreshToken The authentication refresh token.
  */
class UserRefreshClient ()
  extends typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClient {
  def this(clientId: String) = this()
  def this(options: UserRefreshClientOptions) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: String, clientSecret: String, refreshToken: String) = this()
}

