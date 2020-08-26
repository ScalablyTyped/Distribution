package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDurationAnimationDurationUpdate extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
}

object AnimationDurationAnimationDurationUpdate {
  @scala.inline
  def apply(): AnimationDurationAnimationDurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDurationAnimationDurationUpdate]
  }
  @scala.inline
  implicit class AnimationDurationAnimationDurationUpdateOps[Self <: AnimationDurationAnimationDurationUpdate] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = this.set("animationEasingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasingUpdate: Self = this.set("animationEasingUpdate", js.undefined)
    @scala.inline
    def setAnimationThreshold(value: Double): Self = this.set("animationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationThreshold: Self = this.set("animationThreshold", js.undefined)
  }
  
}

