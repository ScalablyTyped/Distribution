package typings.digibyte.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Unit")
@js.native
class Unit protected () extends js.Object {
  def this(amount: Double, unitPreference: String) = this()
  def toBits(): Double = js.native
  def toDGB(): Double = js.native
  def toMilis(): Double = js.native
  def toSatoshis(): Double = js.native
}

/* static members */
@JSImport("digibyte", "Unit")
@js.native
object Unit extends js.Object {
  def fromBits(amount: Double): Unit = js.native
  def fromDGB(amount: Double): Unit = js.native
  def fromFiat(amount: Double, exchangeRate: Double): Unit = js.native
  def fromMilis(amount: Double): Unit = js.native
  def fromSatoshis(amount: Double): Unit = js.native
}

