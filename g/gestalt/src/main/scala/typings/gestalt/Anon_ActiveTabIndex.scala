package typings.gestalt

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]
}

object Anon_ActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]): Anon_ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex, event = event)
  
    __obj.asInstanceOf[Anon_ActiveTabIndex]
  }
}

