package typings
package googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", "JWTAccess")
@js.native
/**
  * JWTAccess service account credentials.
  *
  * Create a new access token by using the credential to create a new JWT token
  * that's recognized as the access token.
  *
  * @param email the service account email address.
  * @param key the private key that will be used to sign the token.
  * @param keyId the ID of the private key used to sign the token.
  */
class JWTAccess ()
  extends googleDashAuthDashLibraryLib.buildSrcAuthJwtaccessMod.JWTAccess {
  def this(email: java.lang.String) = this()
  def this(email: java.lang.String, key: java.lang.String) = this()
  def this(email: scala.Null, key: java.lang.String) = this()
  def this(email: java.lang.String, key: java.lang.String, keyId: java.lang.String) = this()
  def this(email: java.lang.String, key: scala.Null, keyId: java.lang.String) = this()
  def this(email: scala.Null, key: java.lang.String, keyId: java.lang.String) = this()
  def this(email: scala.Null, key: scala.Null, keyId: java.lang.String) = this()
}

