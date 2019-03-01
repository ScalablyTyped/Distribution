package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValue extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event]
  var value: java.lang.String
}

object Anon_EventValue {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event],
    value: java.lang.String
  ): Anon_EventValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_EventValue]
  }
}

