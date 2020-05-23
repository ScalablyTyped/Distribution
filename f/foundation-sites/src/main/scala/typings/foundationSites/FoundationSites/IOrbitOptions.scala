package typings.foundationSites.FoundationSites

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
    timerDelay: js.UndefOr[Double] = js.undefined,
    useMUI: js.UndefOr[Boolean] = js.undefined
  ): IOrbitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (animInFromLeft != null) __obj.updateDynamic("animInFromLeft")(animInFromLeft.asInstanceOf[js.Any])
    if (animInFromRight != null) __obj.updateDynamic("animInFromRight")(animInFromRight.asInstanceOf[js.Any])
    if (animOutToLeft != null) __obj.updateDynamic("animOutToLeft")(animOutToLeft.asInstanceOf[js.Any])
    if (animOutToRight != null) __obj.updateDynamic("animOutToRight")(animOutToRight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (boxOfBullets != null) __obj.updateDynamic("boxOfBullets")(boxOfBullets.asInstanceOf[js.Any])
    if (!js.isUndefined(bullets)) __obj.updateDynamic("bullets")(bullets.get.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteWrap)) __obj.updateDynamic("infiniteWrap")(infiniteWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navButtons)) __obj.updateDynamic("navButtons")(navButtons.get.asInstanceOf[js.Any])
    if (nextClass != null) __obj.updateDynamic("nextClass")(nextClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (prevClass != null) __obj.updateDynamic("prevClass")(prevClass.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timerDelay)) __obj.updateDynamic("timerDelay")(timerDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMUI)) __obj.updateDynamic("useMUI")(useMUI.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrbitOptions]
  }
}

