package typings.gestalt

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveIndex extends js.Object {
  var activeIndex: Double
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]
}

object AnonActiveIndex {
  @scala.inline
  def apply(activeIndex: Double, event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]): AnonActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveIndex]
  }
}

