package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueBoolean extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event]
  var value: scala.Boolean
}

object Anon_EventValueBoolean {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event],
    value: scala.Boolean
  ): Anon_EventValueBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_EventValueBoolean]
  }
}

