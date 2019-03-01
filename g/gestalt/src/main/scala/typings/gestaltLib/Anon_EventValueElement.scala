package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueElement extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.reactMod.ReactNs.FocusEvent[reactLib.Element], reactLib.Event]
  var value: java.lang.String
}

object Anon_EventValueElement {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.reactMod.ReactNs.FocusEvent[reactLib.Element], reactLib.Event],
    value: java.lang.String
  ): Anon_EventValueElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_EventValueElement]
  }
}

