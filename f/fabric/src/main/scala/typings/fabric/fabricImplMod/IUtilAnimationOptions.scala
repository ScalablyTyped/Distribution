package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Fabric util Interface
//////////////////////////////////////////////////////////////////////////////
trait IUtilAnimationOptions extends StObject {
  
  /**
    * Value to modify the property by
    */
  var byValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of change (in ms)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Easing function
    */
  var easing: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Ending value
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback; invoked on every value change
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * Callback; invoked when value change is completed
    */
  var onComplete: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Starting value
    */
  var startValue: js.UndefOr[Double] = js.undefined
}
object IUtilAnimationOptions {
  
  @scala.inline
  def apply(): IUtilAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUtilAnimationOptions]
  }
  
  @scala.inline
  implicit class IUtilAnimationOptionsMutableBuilder[Self <: IUtilAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByValue(value: Double): Self = StObject.set(x, "byValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByValueUndefined: Self = StObject.set(x, "byValue", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
