package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSliderConstructorOptions extends StObject {
  
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  /**
    * Label text.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Selected value.
    */
  var value: js.UndefOr[Double] = js.native
}
object TouchBarSliderConstructorOptions {
  
  @scala.inline
  def apply(): TouchBarSliderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSliderConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarSliderConstructorOptionsMutableBuilder[Self <: TouchBarSliderConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* newValue */ Double => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
