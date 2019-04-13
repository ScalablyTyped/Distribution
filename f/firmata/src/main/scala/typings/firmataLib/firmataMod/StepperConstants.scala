package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperConstants extends js.Object {
  var DIRECTION: firmataLib.Anon_CCW
  var RUNSTATE: firmataLib.Anon_ACCEL
  var TYPE: firmataLib.Anon_DRIVER
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: firmataLib.Anon_CCW, RUNSTATE: firmataLib.Anon_ACCEL, TYPE: firmataLib.Anon_DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION, RUNSTATE = RUNSTATE, TYPE = TYPE)
  
    __obj.asInstanceOf[StepperConstants]
  }
}

