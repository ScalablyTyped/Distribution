package typings
package firmataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CCW extends js.Object {
  var CCW: firmataLib.firmataMod.STEPPER_DIRECTION
  var CW: firmataLib.firmataMod.STEPPER_DIRECTION
}

object Anon_CCW {
  @scala.inline
  def apply(CCW: firmataLib.firmataMod.STEPPER_DIRECTION, CW: firmataLib.firmataMod.STEPPER_DIRECTION): Anon_CCW = {
    val __obj = js.Dynamic.literal(CCW = CCW, CW = CW)
  
    __obj.asInstanceOf[Anon_CCW]
  }
}

