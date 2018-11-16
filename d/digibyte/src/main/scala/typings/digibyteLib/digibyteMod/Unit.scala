package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Unit")
@js.native
class Unit protected () extends js.Object {
  def this(amount: scala.Double, unitPreference: java.lang.String) = this()
  def toBits(): scala.Double = js.native
  def toDGB(): scala.Double = js.native
  def toMilis(): scala.Double = js.native
  def toSatoshis(): scala.Double = js.native
}

@JSImport("digibyte", "Unit")
@js.native
object Unit extends js.Object {
  def fromBits(amount: scala.Double): digibyteLib.digibyteMod.Unit = js.native
  def fromDGB(amount: scala.Double): digibyteLib.digibyteMod.Unit = js.native
  def fromFiat(amount: scala.Double, exchangeRate: scala.Double): digibyteLib.digibyteMod.Unit = js.native
  def fromMilis(amount: scala.Double): digibyteLib.digibyteMod.Unit = js.native
  def fromSatoshis(amount: scala.Double): digibyteLib.digibyteMod.Unit = js.native
}

