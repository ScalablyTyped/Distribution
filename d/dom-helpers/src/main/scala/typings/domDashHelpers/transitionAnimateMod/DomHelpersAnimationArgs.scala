package typings.domDashHelpers.transitionAnimateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomHelpersAnimationArgs extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[Boolean] = js.undefined
  var element: Element
  var properties: StringDictionary[js.Any]
}

object DomHelpersAnimationArgs {
  @scala.inline
  def apply(
    element: Element,
    properties: StringDictionary[js.Any],
    callback: () => Unit = null,
    duration: Int | Double = null,
    easing: js.UndefOr[Boolean] = js.undefined
  ): DomHelpersAnimationArgs = {
    val __obj = js.Dynamic.literal(element = element, properties = properties)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[DomHelpersAnimationArgs]
  }
}

