package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A series of measurements taken by a device
  */
trait SampledData
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'dimensions'.
    */
  var _dimensions: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lowerLimit'.
    */
  var _lowerLimit: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'upperLimit'.
    */
  var _upperLimit: js.UndefOr[Element] = js.undefined
  
  /**
    * Decimal values with spaces, or "E" | "U" | "L"
    */
  var data: String
  
  /**
    * Number of sample points at each time point
    */
  var dimensions: positiveInt
  
  /**
    * Multiply data by this before adding to origin
    */
  var factor: js.UndefOr[decimal] = js.undefined
  
  /**
    * Lower limit of detection
    */
  var lowerLimit: js.UndefOr[decimal] = js.undefined
  
  /**
    * Zero value and units
    */
  var origin: Quantity
  
  /**
    * Number of milliseconds between samples
    */
  var period: decimal
  
  /**
    * Upper limit of detection
    */
  var upperLimit: js.UndefOr[decimal] = js.undefined
}
object SampledData {
  
  inline def apply(data: String, dimensions: positiveInt, origin: Quantity, period: decimal): SampledData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
  
  extension [Self <: SampledData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: positiveInt): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setFactor(value: decimal): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setLowerLimit(value: decimal): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
    
    inline def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
    
    inline def setOrigin(value: Quantity): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: decimal): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setUpperLimit(value: decimal): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
    
    inline def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
    
    inline def set_dimensions(value: Element): Self = StObject.set(x, "_dimensions", value.asInstanceOf[js.Any])
    
    inline def set_dimensionsUndefined: Self = StObject.set(x, "_dimensions", js.undefined)
    
    inline def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    inline def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
    
    inline def set_lowerLimit(value: Element): Self = StObject.set(x, "_lowerLimit", value.asInstanceOf[js.Any])
    
    inline def set_lowerLimitUndefined: Self = StObject.set(x, "_lowerLimit", js.undefined)
    
    inline def set_period(value: Element): Self = StObject.set(x, "_period", value.asInstanceOf[js.Any])
    
    inline def set_periodUndefined: Self = StObject.set(x, "_period", js.undefined)
    
    inline def set_upperLimit(value: Element): Self = StObject.set(x, "_upperLimit", value.asInstanceOf[js.Any])
    
    inline def set_upperLimitUndefined: Self = StObject.set(x, "_upperLimit", js.undefined)
  }
}
