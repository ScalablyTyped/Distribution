package typings.domHelpers.anon

import typings.domHelpers.addEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Once[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */] extends js.Object {
  var __once: js.UndefOr[EventHandler[K]] = js.undefined
}

object Once {
  @scala.inline
  def apply[K](__once: EventHandler[K] = null): Once[K] = {
    val __obj = js.Dynamic.literal()
    if (__once != null) __obj.updateDynamic("__once")(__once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once[K]]
  }
}

