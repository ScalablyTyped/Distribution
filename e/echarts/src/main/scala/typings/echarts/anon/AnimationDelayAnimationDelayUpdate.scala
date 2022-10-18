package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDelayAnimationDelayUpdate extends StObject {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  
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
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  
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
  var animationEasing: js.UndefOr[String] = js.undefined
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.hoverAnimation.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  
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
  var animationThreshold: js.UndefOr[Double] = js.undefined
}
object AnimationDelayAnimationDelayUpdate {
  
  inline def apply(): AnimationDelayAnimationDelayUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDelayAnimationDelayUpdate]
  }
  
  extension [Self <: AnimationDelayAnimationDelayUpdate](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationDelay(value: js.Function | Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    inline def setAnimationDelayUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDelayUpdate", value.asInstanceOf[js.Any])
    
    inline def setAnimationDelayUpdateUndefined: Self = StObject.set(x, "animationDelayUpdate", js.undefined)
    
    inline def setAnimationDuration(value: js.Function | Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationDurationUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUpdateUndefined: Self = StObject.set(x, "animationDurationUpdate", js.undefined)
    
    inline def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    inline def setAnimationEasingUpdate(value: String): Self = StObject.set(x, "animationEasingUpdate", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUpdateUndefined: Self = StObject.set(x, "animationEasingUpdate", js.undefined)
    
    inline def setAnimationThreshold(value: Double): Self = StObject.set(x, "animationThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationThresholdUndefined: Self = StObject.set(x, "animationThreshold", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
