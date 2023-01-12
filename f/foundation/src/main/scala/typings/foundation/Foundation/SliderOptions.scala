package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/range_slider.html
trait SliderOptions extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var initial: js.UndefOr[Double] = js.undefined
  
  var on_change: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var trigger_input_change: js.UndefOr[Boolean] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SliderOptions {
  
  inline def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setOn_change(value: () => Any): Self = StObject.set(x, "on_change", js.Any.fromFunction0(value))
    
    inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTrigger_input_change(value: Boolean): Self = StObject.set(x, "trigger_input_change", value.asInstanceOf[js.Any])
    
    inline def setTrigger_input_changeUndefined: Self = StObject.set(x, "trigger_input_change", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
