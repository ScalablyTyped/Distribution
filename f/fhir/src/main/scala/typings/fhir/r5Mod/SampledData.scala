package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampledData
  extends StObject
     with Element {
  
  var _codeMap: js.UndefOr[Element] = js.undefined
  
  var _data: js.UndefOr[Element] = js.undefined
  
  var _intervalUnit: js.UndefOr[Element] = js.undefined
  
  var _offsets: js.UndefOr[Element] = js.undefined
  
  /**
    * The ConceptMap cannot define meanings for the codes 'E', 'U', or 'L' (nor 'e', 'u', or 'l').
    */
  var codeMap: js.UndefOr[String] = js.undefined
  
  /**
    * The data may be missing if it is omitted for summarization purposes. In general, data is required for any actual use of a SampledData.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * If there is more than one dimension, the code for the type of data will define the meaning of the dimensions (typically ECG data).
    */
  var dimensions: Double
  
  /**
    * A correction factor that is applied to the sampled data points before they are added to the origin.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * This is usually a whole number.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * The measurement unit in which the sample interval is expressed.
    */
  var intervalUnit: String
  
  /**
    * The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
    */
  var lowerLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * If offsets is present, the number of data points must be equal to the number of offsets mlutipled by the dimensions.
    */
  var offsets: js.UndefOr[String] = js.undefined
  
  /**
    * The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
    */
  var origin: Quantity
  
  /**
    * The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
    */
  var upperLimit: js.UndefOr[Double] = js.undefined
}
object SampledData {
  
  inline def apply(dimensions: Double, intervalUnit: String, origin: Quantity): SampledData = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], intervalUnit = intervalUnit.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SampledData] (val x: Self) extends AnyVal {
    
    inline def setCodeMap(value: String): Self = StObject.set(x, "codeMap", value.asInstanceOf[js.Any])
    
    inline def setCodeMapUndefined: Self = StObject.set(x, "codeMap", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDimensions(value: Double): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setIntervalUnit(value: String): Self = StObject.set(x, "intervalUnit", value.asInstanceOf[js.Any])
    
    inline def setLowerLimit(value: Double): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
    
    inline def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
    
    inline def setOffsets(value: String): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setOrigin(value: Quantity): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setUpperLimit(value: Double): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
    
    inline def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
    
    inline def set_codeMap(value: Element): Self = StObject.set(x, "_codeMap", value.asInstanceOf[js.Any])
    
    inline def set_codeMapUndefined: Self = StObject.set(x, "_codeMap", js.undefined)
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
    
    inline def set_intervalUnit(value: Element): Self = StObject.set(x, "_intervalUnit", value.asInstanceOf[js.Any])
    
    inline def set_intervalUnitUndefined: Self = StObject.set(x, "_intervalUnit", js.undefined)
    
    inline def set_offsets(value: Element): Self = StObject.set(x, "_offsets", value.asInstanceOf[js.Any])
    
    inline def set_offsetsUndefined: Self = StObject.set(x, "_offsets", js.undefined)
  }
}
