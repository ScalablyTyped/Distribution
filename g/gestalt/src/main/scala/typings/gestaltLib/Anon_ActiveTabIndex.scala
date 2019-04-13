package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabIndex extends js.Object {
  var activeTabIndex: scala.Double
  var event: reactLib.reactMod.SyntheticEvent[
    reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
    reactLib.Event
  ]
}

object Anon_ActiveTabIndex {
  @scala.inline
  def apply(
    activeTabIndex: scala.Double,
    event: reactLib.reactMod.SyntheticEvent[
      reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      reactLib.Event
    ]
  ): Anon_ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex, event = event)
  
    __obj.asInstanceOf[Anon_ActiveTabIndex]
  }
}

