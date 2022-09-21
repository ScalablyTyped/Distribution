package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeOptions
  extends StObject
     with BaseGaugeOptions[dxLinearGauge] {
  
  /**
    * Specifies the properties required to set the geometry of the LinearGauge UI component.
    */
  var geometry: js.UndefOr[`5`] = js.undefined
  
  /**
    * Specifies gauge range container properties.
    */
  @JSName("rangeContainer")
  var rangeContainer_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeRangeContainer] = js.undefined
  
  /**
    * Specifies the gauge&apos;s scale properties.
    */
  @JSName("scale")
  var scale_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeScale] = js.undefined
  
  /**
    * Specifies the appearance properties of subvalue indicators.
    */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
  
  /**
    * Specifies the appearance properties of the value indicator.
    */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
}
object dxLinearGaugeOptions {
  
  inline def apply(): dxLinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeOptions]
  }
  
  extension [Self <: dxLinearGaugeOptions](x: Self) {
    
    inline def setGeometry(value: `5`): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setRangeContainer(value: dxLinearGaugeRangeContainer): Self = StObject.set(x, "rangeContainer", value.asInstanceOf[js.Any])
    
    inline def setRangeContainerUndefined: Self = StObject.set(x, "rangeContainer", js.undefined)
    
    inline def setScale(value: dxLinearGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSubvalueIndicator(value: GaugeIndicator): Self = StObject.set(x, "subvalueIndicator", value.asInstanceOf[js.Any])
    
    inline def setSubvalueIndicatorUndefined: Self = StObject.set(x, "subvalueIndicator", js.undefined)
    
    inline def setValueIndicator(value: GaugeIndicator): Self = StObject.set(x, "valueIndicator", value.asInstanceOf[js.Any])
    
    inline def setValueIndicatorUndefined: Self = StObject.set(x, "valueIndicator", js.undefined)
  }
}
