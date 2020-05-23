package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveIndex extends js.Object {
  var activeIndex: Double
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}

object ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: Double,
    event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
}

