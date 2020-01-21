package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressValidator.expressValidatorStrings.md4
  - typings.expressValidator.expressValidatorStrings.md5
  - typings.expressValidator.expressValidatorStrings.sha1
  - typings.expressValidator.expressValidatorStrings.sha256
  - typings.expressValidator.expressValidatorStrings.sha384
  - typings.expressValidator.expressValidatorStrings.sha512
  - typings.expressValidator.expressValidatorStrings.ripemd128
  - typings.expressValidator.expressValidatorStrings.ripemd160
  - typings.expressValidator.expressValidatorStrings.tiger128
  - typings.expressValidator.expressValidatorStrings.tiger160
  - typings.expressValidator.expressValidatorStrings.tiger192
  - typings.expressValidator.expressValidatorStrings.crc32
  - typings.expressValidator.expressValidatorStrings.crc32b
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crc32: typings.expressValidator.expressValidatorStrings.crc32 = this.cast("crc32")
  @scala.inline
  def crc32b: typings.expressValidator.expressValidatorStrings.crc32b = this.cast("crc32b")
  @scala.inline
  def md4: typings.expressValidator.expressValidatorStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typings.expressValidator.expressValidatorStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd128: typings.expressValidator.expressValidatorStrings.ripemd128 = this.cast("ripemd128")
  @scala.inline
  def ripemd160: typings.expressValidator.expressValidatorStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typings.expressValidator.expressValidatorStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.expressValidator.expressValidatorStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.expressValidator.expressValidatorStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.expressValidator.expressValidatorStrings.sha512 = this.cast("sha512")
  @scala.inline
  def tiger128: typings.expressValidator.expressValidatorStrings.tiger128 = this.cast("tiger128")
  @scala.inline
  def tiger160: typings.expressValidator.expressValidatorStrings.tiger160 = this.cast("tiger160")
  @scala.inline
  def tiger192: typings.expressValidator.expressValidatorStrings.tiger192 = this.cast("tiger192")
}

