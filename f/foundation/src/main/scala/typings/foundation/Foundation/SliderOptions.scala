package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/range_slider.html
@js.native
trait SliderOptions extends StObject {
  
  var end: js.UndefOr[Double] = js.native
  
  var initial: js.UndefOr[Double] = js.native
  
  var on_change: js.UndefOr[js.Function0[_]] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var trigger_input_change: js.UndefOr[Boolean] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object SliderOptions {
  
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit class SliderOptionsMutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setOn_change(value: () => _): Self = StObject.set(x, "on_change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTrigger_input_change(value: Boolean): Self = StObject.set(x, "trigger_input_change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger_input_changeUndefined: Self = StObject.set(x, "trigger_input_change", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
