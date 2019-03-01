package typings
package featherlightLib.FeatherlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var afterClose: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var afterContent: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var afterOpen: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var ajax: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var beforeClose: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var beforeContent: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var beforeOpen: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var closeIcon: js.UndefOr[java.lang.String] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var closeSpeed: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var closeTrigger: js.UndefOr[java.lang.String] = js.undefined
  var contentFilters: js.UndefOr[js.Any] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var jquery: js.UndefOr[featherlightLib.JQuery] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* event */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var openSpeed: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var openTrigger: js.UndefOr[java.lang.String] = js.undefined
  var otherClose: js.UndefOr[java.lang.String] = js.undefined
  var persist: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var resetCss: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var targetAttr: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var variant: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    afterClose: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    afterContent: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    afterOpen: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    ajax: java.lang.String = null,
    background: java.lang.String = null,
    beforeClose: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    beforeContent: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    beforeOpen: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    closeIcon: java.lang.String = null,
    closeOnClick: scala.Boolean | java.lang.String = null,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    closeSpeed: scala.Double | java.lang.String = null,
    closeTrigger: java.lang.String = null,
    contentFilters: js.Any = null,
    filter: java.lang.String = null,
    html: java.lang.String = null,
    image: java.lang.String = null,
    jquery: featherlightLib.JQuery = null,
    loading: java.lang.String = null,
    namespace: java.lang.String = null,
    onKeyUp: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    onResize: js.Function1[/* event */ jqueryLib.JQueryEventObject, _] = null,
    openSpeed: scala.Double | java.lang.String = null,
    openTrigger: java.lang.String = null,
    otherClose: java.lang.String = null,
    persist: scala.Boolean | java.lang.String = null,
    resetCss: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    targetAttr: java.lang.String = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null,
    variant: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterContent != null) __obj.updateDynamic("afterContent")(afterContent)
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(afterOpen)
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (background != null) __obj.updateDynamic("background")(background)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeContent != null) __obj.updateDynamic("beforeContent")(beforeContent)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon)
    if (closeOnClick != null) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (closeSpeed != null) __obj.updateDynamic("closeSpeed")(closeSpeed.asInstanceOf[js.Any])
    if (closeTrigger != null) __obj.updateDynamic("closeTrigger")(closeTrigger)
    if (contentFilters != null) __obj.updateDynamic("contentFilters")(contentFilters)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (html != null) __obj.updateDynamic("html")(html)
    if (image != null) __obj.updateDynamic("image")(image)
    if (jquery != null) __obj.updateDynamic("jquery")(jquery)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (openSpeed != null) __obj.updateDynamic("openSpeed")(openSpeed.asInstanceOf[js.Any])
    if (openTrigger != null) __obj.updateDynamic("openTrigger")(openTrigger)
    if (otherClose != null) __obj.updateDynamic("otherClose")(otherClose)
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (!js.isUndefined(resetCss)) __obj.updateDynamic("resetCss")(resetCss)
    if (root != null) __obj.updateDynamic("root")(root)
    if (targetAttr != null) __obj.updateDynamic("targetAttr")(targetAttr)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Config]
  }
}

