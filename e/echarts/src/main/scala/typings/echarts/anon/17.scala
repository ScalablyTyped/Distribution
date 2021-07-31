package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
}
object `17` {
  
  @scala.inline
  def apply(): `17` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDelayUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUpdateUndefined: Self = StObject.set(x, "animationDelayUpdate", js.undefined)
  }
}
