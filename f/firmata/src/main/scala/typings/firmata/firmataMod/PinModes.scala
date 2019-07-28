package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinModes extends js.Object {
  var ANALOG: PIN_MODE
  var I2C: PIN_MODE
  var IGNORE: PIN_MODE
  var INPUT: PIN_MODE
  var ONEWIRE: PIN_MODE
  var OUTPUT: PIN_MODE
  var PING_READ: PIN_MODE
  var PULLUP: PIN_MODE
  var PWM: PIN_MODE
  var SERIAL: PIN_MODE
  var SERVO: PIN_MODE
  var SHIFT: PIN_MODE
  var STEPPER: PIN_MODE
  var UNKOWN: PIN_MODE
}

object PinModes {
  @scala.inline
  def apply(
    ANALOG: PIN_MODE,
    I2C: PIN_MODE,
    IGNORE: PIN_MODE,
    INPUT: PIN_MODE,
    ONEWIRE: PIN_MODE,
    OUTPUT: PIN_MODE,
    PING_READ: PIN_MODE,
    PULLUP: PIN_MODE,
    PWM: PIN_MODE,
    SERIAL: PIN_MODE,
    SERVO: PIN_MODE,
    SHIFT: PIN_MODE,
    STEPPER: PIN_MODE,
    UNKOWN: PIN_MODE
  ): PinModes = {
    val __obj = js.Dynamic.literal(ANALOG = ANALOG, I2C = I2C, IGNORE = IGNORE, INPUT = INPUT, ONEWIRE = ONEWIRE, OUTPUT = OUTPUT, PING_READ = PING_READ, PULLUP = PULLUP, PWM = PWM, SERIAL = SERIAL, SERVO = SERVO, SHIFT = SHIFT, STEPPER = STEPPER, UNKOWN = UNKOWN)
  
    __obj.asInstanceOf[PinModes]
  }
}

