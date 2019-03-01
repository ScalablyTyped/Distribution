package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrbitOptions extends js.Object {
  var accessible: js.UndefOr[scala.Boolean] = js.undefined
  var animInFromLeft: js.UndefOr[java.lang.String] = js.undefined
  var animInFromRight: js.UndefOr[java.lang.String] = js.undefined
  var animOutToLeft: js.UndefOr[java.lang.String] = js.undefined
  var animOutToRight: js.UndefOr[java.lang.String] = js.undefined
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var boxOfBullets: js.UndefOr[java.lang.String] = js.undefined
  var bullets: js.UndefOr[scala.Boolean] = js.undefined
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  var infiniteWrap: js.UndefOr[scala.Boolean] = js.undefined
  var navButtons: js.UndefOr[scala.Boolean] = js.undefined
  var nextClass: js.UndefOr[java.lang.String] = js.undefined
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var prevClass: js.UndefOr[java.lang.String] = js.undefined
  var slideClass: js.UndefOr[java.lang.String] = js.undefined
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  var timerDelay: js.UndefOr[scala.Double] = js.undefined
  var useMUI: js.UndefOr[scala.Boolean] = js.undefined
}

object IOrbitOptions {
  @scala.inline
  def apply(
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    animInFromLeft: java.lang.String = null,
    animInFromRight: java.lang.String = null,
    animOutToLeft: java.lang.String = null,
    animOutToRight: java.lang.String = null,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    boxOfBullets: java.lang.String = null,
    bullets: js.UndefOr[scala.Boolean] = js.undefined,
    containerClass: java.lang.String = null,
    infiniteWrap: js.UndefOr[scala.Boolean] = js.undefined,
    navButtons: js.UndefOr[scala.Boolean] = js.undefined,
    nextClass: java.lang.String = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    prevClass: java.lang.String = null,
    slideClass: java.lang.String = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined,
    timerDelay: scala.Int | scala.Double = null,
    useMUI: js.UndefOr[scala.Boolean] = js.undefined
  ): IOrbitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (animInFromLeft != null) __obj.updateDynamic("animInFromLeft")(animInFromLeft)
    if (animInFromRight != null) __obj.updateDynamic("animInFromRight")(animInFromRight)
    if (animOutToLeft != null) __obj.updateDynamic("animOutToLeft")(animOutToLeft)
    if (animOutToRight != null) __obj.updateDynamic("animOutToRight")(animOutToRight)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (boxOfBullets != null) __obj.updateDynamic("boxOfBullets")(boxOfBullets)
    if (!js.isUndefined(bullets)) __obj.updateDynamic("bullets")(bullets)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (!js.isUndefined(infiniteWrap)) __obj.updateDynamic("infiniteWrap")(infiniteWrap)
    if (!js.isUndefined(navButtons)) __obj.updateDynamic("navButtons")(navButtons)
    if (nextClass != null) __obj.updateDynamic("nextClass")(nextClass)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prevClass != null) __obj.updateDynamic("prevClass")(prevClass)
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass)
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (timerDelay != null) __obj.updateDynamic("timerDelay")(timerDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(useMUI)) __obj.updateDynamic("useMUI")(useMUI)
    __obj.asInstanceOf[IOrbitOptions]
  }
}

