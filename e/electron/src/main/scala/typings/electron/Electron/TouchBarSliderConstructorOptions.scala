package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSliderConstructorOptions extends StObject {
  
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  /**
    * Label text.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Selected value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object TouchBarSliderConstructorOptions {
  
  inline def apply(): TouchBarSliderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSliderConstructorOptions]
  }
  
  extension [Self <: TouchBarSliderConstructorOptions](x: Self) {
    
    inline def setChange(value: /* newValue */ Double => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
