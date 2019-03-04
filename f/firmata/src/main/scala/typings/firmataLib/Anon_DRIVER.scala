package typings
package firmataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DRIVER extends js.Object {
  var DRIVER: firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  var FOUR_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  var TWO_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE
}

object Anon_DRIVER {
  @scala.inline
  def apply(
    DRIVER: firmataLib.firmataMod.BoardNs.STEPPER_TYPE,
    FOUR_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE,
    TWO_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  ): Anon_DRIVER = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER, FOUR_WIRE = FOUR_WIRE, TWO_WIRE = TWO_WIRE)
  
    __obj.asInstanceOf[Anon_DRIVER]
  }
}

