package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}

object ActiveTabIndex {
  @scala.inline
  def apply(
    activeTabIndex: Double,
    event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
}

