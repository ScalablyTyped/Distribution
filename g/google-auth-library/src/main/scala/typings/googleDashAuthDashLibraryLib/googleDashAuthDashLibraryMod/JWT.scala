package typings
package googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", "JWT")
@js.native
class JWT protected ()
  extends googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT {
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
  def this(options: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions) = this()
  def this(email: js.UndefOr[java.lang.String], keyFile: js.UndefOr[java.lang.String], key: js.UndefOr[java.lang.String], scopes: js.UndefOr[js.Array[java.lang.String] | java.lang.String], subject: js.UndefOr[java.lang.String], keyId: js.UndefOr[java.lang.String]) = this()
}

