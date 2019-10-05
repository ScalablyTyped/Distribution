package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrbitOptions extends js.Object {
  var accessible: js.UndefOr[Boolean] = js.undefined
  var animInFromLeft: js.UndefOr[String] = js.undefined
  var animInFromRight: js.UndefOr[String] = js.undefined
  var animOutToLeft: js.UndefOr[String] = js.undefined
  var animOutToRight: js.UndefOr[String] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var boxOfBullets: js.UndefOr[String] = js.undefined
  var bullets: js.UndefOr[Boolean] = js.undefined
  var containerClass: js.UndefOr[String] = js.undefined
  var infiniteWrap: js.UndefOr[Boolean] = js.undefined
  var navButtons: js.UndefOr[Boolean] = js.undefined
  var nextClass: js.UndefOr[String] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var prevClass: js.UndefOr[String] = js.undefined
  var slideClass: js.UndefOr[String] = js.undefined
  var swipe: js.UndefOr[Boolean] = js.undefined
  var timerDelay: js.UndefOr[Double] = js.undefined
  var useMUI: js.UndefOr[Boolean] = js.undefined
}

object IOrbitOptions {
  @scala.inline
  def apply(
    accessible: js.UndefOr[Boolean] = js.undefined,
    animInFromLeft: String = null,
    animInFromRight: String = null,
    animOutToLeft: String = null,
    animOutToRight: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    boxOfBullets: String = null,
    bullets: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    infiniteWrap: js.UndefOr[Boolean] = js.undefined,
    navButtons: js.UndefOr[Boolean] = js.undefined,
    nextClass: String = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevClass: String = null,
    slideClass: String = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    timerDelay: Int | Double = null,
    useMUI: js.UndefOr[Boolean] = js.undefined
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

