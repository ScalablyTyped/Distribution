package typings
package elgamalLib.elgamalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "EncryptedValue")
@js.native
class EncryptedValue protected () extends js.Object {
  def this(a: jsbnLib.jsbnMod.BigInteger, b: jsbnLib.jsbnMod.BigInteger) = this()
  var a: jsbnLib.jsbnMod.BigInteger = js.native
  var b: jsbnLib.jsbnMod.BigInteger = js.native
  def multiply(encryptedValue: EncryptedValue): EncryptedValue = js.native
}

