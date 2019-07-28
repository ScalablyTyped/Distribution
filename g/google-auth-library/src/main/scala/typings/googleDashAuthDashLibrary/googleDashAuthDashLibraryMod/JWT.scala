package typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod

import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", "JWT")
@js.native
class JWT protected ()
  extends typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWT {
  /**
    * JWT service account credentials.
    *
    * Retrieve access token using gtoken.
    *
    * @param email service account email address.
    * @param keyFile path to private key file.
    * @param key value of key
    * @param scopes list of requested scopes or a single scope.
    * @param subject impersonated account's email address.
    * @param key_id the ID of the key
    */
  def this(options: JWTOptions) = this()
  def this(
    email: js.UndefOr[String],
    keyFile: js.UndefOr[String],
    key: js.UndefOr[String],
    scopes: js.UndefOr[js.Array[String] | String],
    subject: js.UndefOr[String],
    keyId: js.UndefOr[String]
  ) = this()
}

