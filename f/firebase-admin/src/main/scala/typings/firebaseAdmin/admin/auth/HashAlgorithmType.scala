package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.firebaseAdminStrings.SCRYPT
  - typings.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT
  - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512
  - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256
  - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1
  - typings.firebaseAdmin.firebaseAdminStrings.HMAC_MD5
  - typings.firebaseAdmin.firebaseAdminStrings.MD5
  - typings.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1
  - typings.firebaseAdmin.firebaseAdminStrings.BCRYPT
  - typings.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256
  - typings.firebaseAdmin.firebaseAdminStrings.SHA512
  - typings.firebaseAdmin.firebaseAdminStrings.SHA256
  - typings.firebaseAdmin.firebaseAdminStrings.SHA1
*/
trait HashAlgorithmType extends js.Object

object HashAlgorithmType {
  @scala.inline
  def BCRYPT: typings.firebaseAdmin.firebaseAdminStrings.BCRYPT = this.cast("BCRYPT")
  @scala.inline
  def HMAC_MD5: typings.firebaseAdmin.firebaseAdminStrings.HMAC_MD5 = this.cast("HMAC_MD5")
  @scala.inline
  def HMAC_SHA1: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1 = this.cast("HMAC_SHA1")
  @scala.inline
  def HMAC_SHA256: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256 = this.cast("HMAC_SHA256")
  @scala.inline
  def HMAC_SHA512: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512 = this.cast("HMAC_SHA512")
  @scala.inline
  def MD5: typings.firebaseAdmin.firebaseAdminStrings.MD5 = this.cast("MD5")
  @scala.inline
  def PBKDF2_SHA256: typings.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256 = this.cast("PBKDF2_SHA256")
  @scala.inline
  def PBKDF_SHA1: typings.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1 = this.cast("PBKDF_SHA1")
  @scala.inline
  def SCRYPT: typings.firebaseAdmin.firebaseAdminStrings.SCRYPT = this.cast("SCRYPT")
  @scala.inline
  def SHA1: typings.firebaseAdmin.firebaseAdminStrings.SHA1 = this.cast("SHA1")
  @scala.inline
  def SHA256: typings.firebaseAdmin.firebaseAdminStrings.SHA256 = this.cast("SHA256")
  @scala.inline
  def SHA512: typings.firebaseAdmin.firebaseAdminStrings.SHA512 = this.cast("SHA512")
  @scala.inline
  def STANDARD_SCRYPT: typings.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT = this.cast("STANDARD_SCRYPT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

