package typings.domDashHelpers.cjsAnimateMod

import typings.domDashHelpers.cjsAddEventListenerMod.EventHandler
import typings.domDashHelpers.domDashHelpersStrings.transitionend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callback: js.UndefOr[EventHandler[transitionend]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var node: HTMLElement
  var properties: AnimateProperties
}

object Options {
  @scala.inline
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    callback: EventHandler[transitionend] = null,
    duration: Int | Double = null,
    easing: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

