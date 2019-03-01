package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevealOptions extends js.Object {
  var animationIn: js.UndefOr[java.lang.String] = js.undefined
  var animationOut: js.UndefOr[java.lang.String] = js.undefined
  var btmOffsetPct: js.UndefOr[scala.Double] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var deepLink: js.UndefOr[scala.Boolean] = js.undefined
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var hOffset: js.UndefOr[scala.Double] = js.undefined
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  var multipleOpened: js.UndefOr[scala.Boolean] = js.undefined
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  var resetOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var showDelay: js.UndefOr[scala.Double] = js.undefined
  var vOffset: js.UndefOr[scala.Double] = js.undefined
}

object IRevealOptions {
  @scala.inline
  def apply(
    animationIn: java.lang.String = null,
    animationOut: java.lang.String = null,
    btmOffsetPct: scala.Int | scala.Double = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    deepLink: js.UndefOr[scala.Boolean] = js.undefined,
    fullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    hOffset: scala.Int | scala.Double = null,
    hideDelay: scala.Int | scala.Double = null,
    multipleOpened: js.UndefOr[scala.Boolean] = js.undefined,
    overlay: js.UndefOr[scala.Boolean] = js.undefined,
    resetOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    showDelay: scala.Int | scala.Double = null,
    vOffset: scala.Int | scala.Double = null
  ): IRevealOptions = {
    val __obj = js.Dynamic.literal()
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn)
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut)
    if (btmOffsetPct != null) __obj.updateDynamic("btmOffsetPct")(btmOffsetPct.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (!js.isUndefined(deepLink)) __obj.updateDynamic("deepLink")(deepLink)
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (hOffset != null) __obj.updateDynamic("hOffset")(hOffset.asInstanceOf[js.Any])
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOpened)) __obj.updateDynamic("multipleOpened")(multipleOpened)
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose)
    if (showDelay != null) __obj.updateDynamic("showDelay")(showDelay.asInstanceOf[js.Any])
    if (vOffset != null) __obj.updateDynamic("vOffset")(vOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevealOptions]
  }
}

