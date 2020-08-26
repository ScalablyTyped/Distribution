package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrbitOptions extends js.Object {
  var accessible: js.UndefOr[Boolean] = js.native
  var animInFromLeft: js.UndefOr[String] = js.native
  var animInFromRight: js.UndefOr[String] = js.native
  var animOutToLeft: js.UndefOr[String] = js.native
  var animOutToRight: js.UndefOr[String] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var boxOfBullets: js.UndefOr[String] = js.native
  var bullets: js.UndefOr[Boolean] = js.native
  var containerClass: js.UndefOr[String] = js.native
  var infiniteWrap: js.UndefOr[Boolean] = js.native
  var navButtons: js.UndefOr[Boolean] = js.native
  var nextClass: js.UndefOr[String] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var prevClass: js.UndefOr[String] = js.native
  var slideClass: js.UndefOr[String] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var timerDelay: js.UndefOr[Double] = js.native
  var useMUI: js.UndefOr[Boolean] = js.native
}

object IOrbitOptions {
  @scala.inline
  def apply(): IOrbitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOrbitOptions]
  }
  @scala.inline
  implicit class IOrbitOptionsOps[Self <: IOrbitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setAnimInFromLeft(value: String): Self = this.set("animInFromLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimInFromLeft: Self = this.set("animInFromLeft", js.undefined)
    @scala.inline
    def setAnimInFromRight(value: String): Self = this.set("animInFromRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimInFromRight: Self = this.set("animInFromRight", js.undefined)
    @scala.inline
    def setAnimOutToLeft(value: String): Self = this.set("animOutToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimOutToLeft: Self = this.set("animOutToLeft", js.undefined)
    @scala.inline
    def setAnimOutToRight(value: String): Self = this.set("animOutToRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimOutToRight: Self = this.set("animOutToRight", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setBoxOfBullets(value: String): Self = this.set("boxOfBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxOfBullets: Self = this.set("boxOfBullets", js.undefined)
    @scala.inline
    def setBullets(value: Boolean): Self = this.set("bullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullets: Self = this.set("bullets", js.undefined)
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    @scala.inline
    def setInfiniteWrap(value: Boolean): Self = this.set("infiniteWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteWrap: Self = this.set("infiniteWrap", js.undefined)
    @scala.inline
    def setNavButtons(value: Boolean): Self = this.set("navButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavButtons: Self = this.set("navButtons", js.undefined)
    @scala.inline
    def setNextClass(value: String): Self = this.set("nextClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextClass: Self = this.set("nextClass", js.undefined)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPrevClass(value: String): Self = this.set("prevClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevClass: Self = this.set("prevClass", js.undefined)
    @scala.inline
    def setSlideClass(value: String): Self = this.set("slideClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideClass: Self = this.set("slideClass", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setTimerDelay(value: Double): Self = this.set("timerDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimerDelay: Self = this.set("timerDelay", js.undefined)
    @scala.inline
    def setUseMUI(value: Boolean): Self = this.set("useMUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMUI: Self = this.set("useMUI", js.undefined)
  }
  
}

