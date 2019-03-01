package typings
package domDashHelpersLib.transitionAnimateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomHelpersAnimationArgs extends js.Object {
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[scala.Boolean] = js.undefined
  var element: stdLib.Element
  var properties: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object DomHelpersAnimationArgs {
  @scala.inline
  def apply(
    element: stdLib.Element,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function0[scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: js.UndefOr[scala.Boolean] = js.undefined
  ): DomHelpersAnimationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("properties")(properties)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[DomHelpersAnimationArgs]
  }
}

