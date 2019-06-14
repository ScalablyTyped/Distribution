package typings
package elgamalLib.elgamalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", JSImport.Default)
@js.native
class default protected () extends ElGamal {
  def this(p: jsbnLib.jsbnMod.BigInteger | java.lang.String | scala.Double, g: jsbnLib.jsbnMod.BigInteger | java.lang.String | scala.Double, y: jsbnLib.jsbnMod.BigInteger | java.lang.String | scala.Double, x: jsbnLib.jsbnMod.BigInteger | java.lang.String | scala.Double) = this()
}

/* static members */
@JSImport("elgamal", JSImport.Default)
@js.native
object default extends js.Object {
  def generateAsync(): js.Promise[elgamalLib.elgamalMod.ElGamal] = js.native
  def generateAsync(primeBits: scala.Double): js.Promise[elgamalLib.elgamalMod.ElGamal] = js.native
}

