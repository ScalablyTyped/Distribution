package typings.featherlight.Featherlight

import typings.featherlight.JQuery
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var afterClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var afterContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var afterOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var ajax: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var beforeClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var beforeContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var beforeOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var closeIcon: js.UndefOr[String] = js.undefined
  var closeOnClick: js.UndefOr[Boolean | String] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var closeSpeed: js.UndefOr[Double | String] = js.undefined
  var closeTrigger: js.UndefOr[String] = js.undefined
  var contentFilters: js.UndefOr[js.Any] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var jquery: js.UndefOr[JQuery] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.undefined
  var openSpeed: js.UndefOr[Double | String] = js.undefined
  var openTrigger: js.UndefOr[String] = js.undefined
  var otherClose: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[Boolean | String] = js.undefined
  var resetCss: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var targetAttr: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    afterClose: /* event */ JQueryEventObject => _ = null,
    afterContent: /* event */ JQueryEventObject => _ = null,
    afterOpen: /* event */ JQueryEventObject => _ = null,
    ajax: String = null,
    background: String = null,
    beforeClose: /* event */ JQueryEventObject => _ = null,
    beforeContent: /* event */ JQueryEventObject => _ = null,
    beforeOpen: /* event */ JQueryEventObject => _ = null,
    closeIcon: String = null,
    closeOnClick: Boolean | String = null,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeSpeed: Double | String = null,
    closeTrigger: String = null,
    contentFilters: js.Any = null,
    filter: String = null,
    html: String = null,
    image: String = null,
    jquery: JQuery = null,
    loading: String = null,
    namespace: String = null,
    onKeyUp: /* event */ JQueryEventObject => _ = null,
    onResize: /* event */ JQueryEventObject => _ = null,
    openSpeed: Double | String = null,
    openTrigger: String = null,
    otherClose: String = null,
    persist: Boolean | String = null,
    resetCss: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    targetAttr: String = null,
    text: String = null,
    `type`: String = null,
    variant: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction1(afterClose))
    if (afterContent != null) __obj.updateDynamic("afterContent")(js.Any.fromFunction1(afterContent))
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(js.Any.fromFunction1(afterOpen))
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeContent != null) __obj.updateDynamic("beforeContent")(js.Any.fromFunction1(beforeContent))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (closeOnClick != null) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (closeSpeed != null) __obj.updateDynamic("closeSpeed")(closeSpeed.asInstanceOf[js.Any])
    if (closeTrigger != null) __obj.updateDynamic("closeTrigger")(closeTrigger.asInstanceOf[js.Any])
    if (contentFilters != null) __obj.updateDynamic("contentFilters")(contentFilters.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (jquery != null) __obj.updateDynamic("jquery")(jquery.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (openSpeed != null) __obj.updateDynamic("openSpeed")(openSpeed.asInstanceOf[js.Any])
    if (openTrigger != null) __obj.updateDynamic("openTrigger")(openTrigger.asInstanceOf[js.Any])
    if (otherClose != null) __obj.updateDynamic("otherClose")(otherClose.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (!js.isUndefined(resetCss)) __obj.updateDynamic("resetCss")(resetCss.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (targetAttr != null) __obj.updateDynamic("targetAttr")(targetAttr.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

