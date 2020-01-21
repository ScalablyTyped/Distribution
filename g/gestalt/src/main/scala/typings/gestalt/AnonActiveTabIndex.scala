package typings.gestalt

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]
}

object AnonActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]): AnonActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveTabIndex]
  }
}

