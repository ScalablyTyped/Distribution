package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevealOptions extends js.Object {
  var animationIn: js.UndefOr[String] = js.undefined
  var animationOut: js.UndefOr[String] = js.undefined
  var btmOffsetPct: js.UndefOr[Double] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var deepLink: js.UndefOr[Boolean] = js.undefined
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  var hOffset: js.UndefOr[Double] = js.undefined
  var hideDelay: js.UndefOr[Double] = js.undefined
  var multipleOpened: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  var showDelay: js.UndefOr[Double] = js.undefined
  var vOffset: js.UndefOr[Double] = js.undefined
}

object IRevealOptions {
  @scala.inline
  def apply(
    animationIn: String = null,
    animationOut: String = null,
    btmOffsetPct: js.UndefOr[Double] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    deepLink: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    hOffset: js.UndefOr[Double] = js.undefined,
    hideDelay: js.UndefOr[Double] = js.undefined,
    multipleOpened: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    resetOnClose: js.UndefOr[Boolean] = js.undefined,
    showDelay: js.UndefOr[Double] = js.undefined,
    vOffset: js.UndefOr[Double] = js.undefined
  ): IRevealOptions = {
    val __obj = js.Dynamic.literal()
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (!js.isUndefined(btmOffsetPct)) __obj.updateDynamic("btmOffsetPct")(btmOffsetPct.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deepLink)) __obj.updateDynamic("deepLink")(deepLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hOffset)) __obj.updateDynamic("hOffset")(hOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOpened)) __obj.updateDynamic("multipleOpened")(multipleOpened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDelay)) __obj.updateDynamic("showDelay")(showDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vOffset)) __obj.updateDynamic("vOffset")(vOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevealOptions]
  }
}

