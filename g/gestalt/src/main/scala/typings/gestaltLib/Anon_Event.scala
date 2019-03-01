package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[
    reactLib.reactMod.ReactNs.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
    reactLib.Event
  ]
}

object Anon_Event {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      reactLib.Event
    ]
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_Event]
  }
}

