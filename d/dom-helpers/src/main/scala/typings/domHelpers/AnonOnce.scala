package typings.domHelpers

import typings.domHelpers.addEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnce[K /* <: String */] extends js.Object {
  var __once: js.UndefOr[EventHandler[K]] = js.undefined
}

object AnonOnce {
  @scala.inline
  def apply[K /* <: String */](__once: EventHandler[K] = null): AnonOnce[K] = {
    val __obj = js.Dynamic.literal()
    if (__once != null) __obj.updateDynamic("__once")(__once.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnce[K]]
  }
}

