package typings
package elgamalLib.elgamalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "BigInt")
@js.native
class BigInt protected ()
  extends jsbnLib.jsbnMod.BigInteger {
  def this(a: java.lang.String) = this()
  def this(a: js.Array[scala.Double]) = this()
  def this(a: jsbnLib.jsbnMod.BigInteger) = this()
  def this(a: java.lang.String, b: scala.Double) = this()
  def this(a: js.Array[scala.Double], b: scala.Double) = this()
  def this(a: scala.Double, c: jsbnLib.jsbnMod.RandomGenerator) = this()
  def this(a: scala.Double, b: scala.Double, c: jsbnLib.jsbnMod.RandomGenerator) = this()
}

/* static members */
@JSImport("elgamal", "BigInt")
@js.native
object BigInt extends js.Object {
  var ONE: jsbnLib.jsbnMod.BigInteger = js.native
  var ZERO: jsbnLib.jsbnMod.BigInteger = js.native
}

