package typings.firmata

import typings.firmata.mod.STEPPER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDRIVER extends js.Object {
  var DRIVER: STEPPER_TYPE
  var FOUR_WIRE: STEPPER_TYPE
  var TWO_WIRE: STEPPER_TYPE
}

object AnonDRIVER {
  @scala.inline
  def apply(DRIVER: STEPPER_TYPE, FOUR_WIRE: STEPPER_TYPE, TWO_WIRE: STEPPER_TYPE): AnonDRIVER = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDRIVER]
  }
}

