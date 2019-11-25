package typings.domDashHelpers

import typings.domDashHelpers.cjsAddEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Once[K /* <: String */] extends js.Object {
  var __once: js.UndefOr[EventHandler[K]] = js.undefined
}

object Anon_Once {
  @scala.inline
  def apply[K /* <: String */](__once: EventHandler[K] = null): Anon_Once[K] = {
    val __obj = js.Dynamic.literal()
    if (__once != null) __obj.updateDynamic("__once")(__once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Once[K]]
  }
}

