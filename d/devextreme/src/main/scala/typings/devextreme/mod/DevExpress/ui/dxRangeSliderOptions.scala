package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxRangeSlider.ValueChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxRangeSliderOptions
  extends StObject
     with dxSliderBaseOptions[dxRangeSlider] {
  
  /**
    * The right edge of the interval currently selected using the range slider.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * The value to be assigned to the name attribute of the underlying `` element.
    */
  var endName: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  @JSName("onValueChanged")
  var onValueChanged_dxRangeSliderOptions: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * The left edge of the interval currently selected using the range slider.
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * The value to be assigned to the name attribute of the underlying `` element.
    */
  var startName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the UI component&apos;s value.
    */
  @JSName("value")
  var value_dxRangeSliderOptions: js.UndefOr[js.Array[Double]] = js.undefined
}
object dxRangeSliderOptions {
  
  inline def apply(): dxRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRangeSliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxRangeSliderOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndName(value: String): Self = StObject.set(x, "endName", value.asInstanceOf[js.Any])
    
    inline def setEndNameUndefined: Self = StObject.set(x, "endName", js.undefined)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartName(value: String): Self = StObject.set(x, "startName", value.asInstanceOf[js.Any])
    
    inline def setStartNameUndefined: Self = StObject.set(x, "startName", js.undefined)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
