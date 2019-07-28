package typings.elgamal.elgamalMod

import typings.jsbn.jsbnMod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "EncryptedValue")
@js.native
class EncryptedValue protected () extends js.Object {
  def this(a: BigInteger, b: BigInteger) = this()
  var a: BigInteger = js.native
  var b: BigInteger = js.native
  def multiply(encryptedValue: EncryptedValue): EncryptedValue = js.native
}

