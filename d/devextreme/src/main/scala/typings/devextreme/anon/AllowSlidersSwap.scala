package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxRangeSelector.ValueChangedCallMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowSlidersSwap extends StObject {
  
  /**
    * Indicates whether or not you can swap sliders.
    */
  var allowSlidersSwap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not animation is enabled.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when to call the onValueChanged function.
    */
  var callValueChanged: js.UndefOr[ValueChangedCallMode] = js.undefined
  
  /**
    * Indicates whether or not an end user can specify the range using a mouse, without the use of sliders.
    */
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not an end user can shift the selected range to the required location on a scale by clicking.
    */
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to snap a slider to ticks.
    */
  var snapToTicks: js.UndefOr[Boolean] = js.undefined
}
object AllowSlidersSwap {
  
  inline def apply(): AllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowSlidersSwap]
  }
  
  extension [Self <: AllowSlidersSwap](x: Self) {
    
    inline def setAllowSlidersSwap(value: Boolean): Self = StObject.set(x, "allowSlidersSwap", value.asInstanceOf[js.Any])
    
    inline def setAllowSlidersSwapUndefined: Self = StObject.set(x, "allowSlidersSwap", js.undefined)
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setCallValueChanged(value: ValueChangedCallMode): Self = StObject.set(x, "callValueChanged", value.asInstanceOf[js.Any])
    
    inline def setCallValueChangedUndefined: Self = StObject.set(x, "callValueChanged", js.undefined)
    
    inline def setManualRangeSelectionEnabled(value: Boolean): Self = StObject.set(x, "manualRangeSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setManualRangeSelectionEnabledUndefined: Self = StObject.set(x, "manualRangeSelectionEnabled", js.undefined)
    
    inline def setMoveSelectedRangeByClick(value: Boolean): Self = StObject.set(x, "moveSelectedRangeByClick", value.asInstanceOf[js.Any])
    
    inline def setMoveSelectedRangeByClickUndefined: Self = StObject.set(x, "moveSelectedRangeByClick", js.undefined)
    
    inline def setSnapToTicks(value: Boolean): Self = StObject.set(x, "snapToTicks", value.asInstanceOf[js.Any])
    
    inline def setSnapToTicksUndefined: Self = StObject.set(x, "snapToTicks", js.undefined)
  }
}
