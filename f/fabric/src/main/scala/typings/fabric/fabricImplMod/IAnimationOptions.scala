package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationOptions extends StObject {
  
  /**
    *  Value to modify the property by, default: end - start
    */
  var by: js.UndefOr[Double] = js.undefined
  
  /**
    * Defaults to 500 (ms). Can be used to change duration of an animation.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Easing function. Default: fabric.util.ease.easeInSine
    */
  var easing: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Allows to specify starting value of animatable property (if we don't want current value to be used).
    */
  var from: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Callback; invoked on every value change
    */
  var onChange: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback; invoked when value change is completed
    */
  var onComplete: js.UndefOr[js.Function] = js.undefined
}
object IAnimationOptions {
  
  @scala.inline
  def apply(): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimationOptions]
  }
  
  @scala.inline
  implicit class IAnimationOptionsMutableBuilder[Self <: IAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: Double): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
  }
}
