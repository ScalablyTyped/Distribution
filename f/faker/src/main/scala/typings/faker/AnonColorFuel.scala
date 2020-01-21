package typings.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorFuel extends js.Object {
  def color(): String
  def fuel(): String
  def manufacturer(): String
  def model(): String
  def `type`(): String
  def vehicle(): String
  def vin(): String
}

object AnonColorFuel {
  @scala.inline
  def apply(
    color: () => String,
    fuel: () => String,
    manufacturer: () => String,
    model: () => String,
    `type`: () => String,
    vehicle: () => String,
    vin: () => String
  ): AnonColorFuel = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), fuel = js.Any.fromFunction0(fuel), manufacturer = js.Any.fromFunction0(manufacturer), model = js.Any.fromFunction0(model), vehicle = js.Any.fromFunction0(vehicle), vin = js.Any.fromFunction0(vin))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[AnonColorFuel]
  }
}

