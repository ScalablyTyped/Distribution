package typings.domHelpers

import typings.domHelpers.addEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnce[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */] extends js.Object {
  var __once: js.UndefOr[EventHandler[K]] = js.undefined
}

object AnonOnce {
  @scala.inline
  def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */](__once: EventHandler[K] = null): AnonOnce[K] = {
    val __obj = js.Dynamic.literal()
    if (__once != null) __obj.updateDynamic("__once")(__once.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnce[K]]
  }
}

