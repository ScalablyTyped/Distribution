package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ShowMode
import typings.devextreme.mod.DevExpress.ui.dxSlider.ValueChangeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSliderBaseOptions[TComponent]
  extends StObject
     with dxTrackBarOptions[TComponent] {
  
  /**
    * Specifies the step by which a handle moves when a user presses Page Up or Page Down.
    */
  var keyStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the labels displayed at the min and max values.
    */
  var label: js.UndefOr[typings.devextreme.anon.Format] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to highlight the selected range.
    */
  var showRange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the step by which the UI component&apos;s value changes when a user drags a handler.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures a tooltip.
    */
  var tooltip: js.UndefOr[ShowMode] = js.undefined
  
  /**
    * 
    */
  var valueChangeMode: js.UndefOr[ValueChangeMode] = js.undefined
}
object dxSliderBaseOptions {
  
  inline def apply[TComponent](): dxSliderBaseOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderBaseOptions[TComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxSliderBaseOptions[?], TComponent] (val x: Self & dxSliderBaseOptions[TComponent]) extends AnyVal {
    
    inline def setKeyStep(value: Double): Self = StObject.set(x, "keyStep", value.asInstanceOf[js.Any])
    
    inline def setKeyStepUndefined: Self = StObject.set(x, "keyStep", js.undefined)
    
    inline def setLabel(value: typings.devextreme.anon.Format): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowRange(value: Boolean): Self = StObject.set(x, "showRange", value.asInstanceOf[js.Any])
    
    inline def setShowRangeUndefined: Self = StObject.set(x, "showRange", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTooltip(value: ShowMode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueChangeMode(value: ValueChangeMode): Self = StObject.set(x, "valueChangeMode", value.asInstanceOf[js.Any])
    
    inline def setValueChangeModeUndefined: Self = StObject.set(x, "valueChangeMode", js.undefined)
  }
}
