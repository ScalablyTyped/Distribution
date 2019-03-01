package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: scala.Double
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[
    reactLib.reactMod.ReactNs.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
    reactLib.Event
  ]
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: scala.Double,
    event: reactLib.reactMod.ReactNs.SyntheticEvent[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      reactLib.Event
    ]
  ): Anon_ActiveIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeIndex")(activeIndex)
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_ActiveIndex]
  }
}

