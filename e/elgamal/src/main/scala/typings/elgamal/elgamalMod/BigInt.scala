package typings.elgamal.elgamalMod

import typings.jsbn.jsbnMod.BigInteger
import typings.jsbn.jsbnMod.RandomGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "BigInt")
@js.native
class BigInt protected () extends BigInteger {
  def this(a: String) = this()
  def this(a: js.Array[Double]) = this()
  def this(a: BigInteger) = this()
  def this(a: String, b: Double) = this()
  def this(a: js.Array[Double], b: Double) = this()
  def this(a: Double, c: RandomGenerator) = this()
  def this(a: Double, b: Double, c: RandomGenerator) = this()
}

/* static members */
@JSImport("elgamal", "BigInt")
@js.native
object BigInt extends js.Object {
  var ONE: BigInteger = js.native
  var ZERO: BigInteger = js.native
}

