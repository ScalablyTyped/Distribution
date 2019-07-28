package typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod

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
  extends typings.googleDashAuthDashLibrary.buildSrcAuthJwtaccessMod.JWTAccess {
  def this(email: String) = this()
  def this(email: String, key: String) = this()
  def this(email: Null, key: String) = this()
  def this(email: String, key: String, keyId: String) = this()
  def this(email: String, key: Null, keyId: String) = this()
  def this(email: Null, key: String, keyId: String) = this()
  def this(email: Null, key: Null, keyId: String) = this()
}

