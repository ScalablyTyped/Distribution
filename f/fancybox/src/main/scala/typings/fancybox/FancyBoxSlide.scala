package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxSlide extends FancyBoxGroupItemWithFilledProps {
  @JSName("$content")
  var $content: js.UndefOr[JQuery] = js.native
  @JSName("$iframe")
  var $iframe: js.UndefOr[JQuery] = js.native
  @JSName("$image")
  var $image: js.UndefOr[JQuery] = js.native
  @JSName("$slide")
  var $slide: js.UndefOr[JQuery] = js.native
  @JSName("$spinner")
  var $spinner: js.UndefOr[JQuery] = js.native
  var contentSource: js.UndefOr[String] = js.native
  var forcedDuration: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var isComplete: Boolean = js.native
  var isLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var isRevealed: Boolean = js.native
  var pos: Double = js.native
  var width: Double = js.native
}

object FancyBoxSlide {
  @scala.inline
  def apply(
    height: Double,
    isComplete: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRevealed: Boolean,
    pos: Double,
    src: String,
    width: Double
  ): FancyBoxSlide = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRevealed = isRevealed.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlide]
  }
  @scala.inline
  implicit class FancyBoxSlideOps[Self <: FancyBoxSlide] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComplete(value: Boolean): Self = this.set("isComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRevealed(value: Boolean): Self = this.set("isRevealed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def set$content(value: JQuery): Self = this.set("$content", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$content: Self = this.set("$content", js.undefined)
    @scala.inline
    def set$iframe(value: JQuery): Self = this.set("$iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$iframe: Self = this.set("$iframe", js.undefined)
    @scala.inline
    def set$image(value: JQuery): Self = this.set("$image", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$image: Self = this.set("$image", js.undefined)
    @scala.inline
    def set$slide(value: JQuery): Self = this.set("$slide", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$slide: Self = this.set("$slide", js.undefined)
    @scala.inline
    def set$spinner(value: JQuery): Self = this.set("$spinner", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$spinner: Self = this.set("$spinner", js.undefined)
    @scala.inline
    def setContentSource(value: String): Self = this.set("contentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentSource: Self = this.set("contentSource", js.undefined)
    @scala.inline
    def setForcedDuration(value: Double): Self = this.set("forcedDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcedDuration: Self = this.set("forcedDuration", js.undefined)
  }
  
}

