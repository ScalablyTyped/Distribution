package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampledData
  extends StObject
     with Element {
  
  var _data: js.UndefOr[Element] = js.undefined
  
  /**
    * A series of data points which are decimal values separated by a single space (character u20). The special values "E" (error), "L" (below detection limit) and "U" (above detection limit) can also be used in place of a decimal value.
    */
  var data: String
  
  /**
    * If there is more than one dimension, the code for the type of data will define the meaning of the dimensions (typically ECG data).
    */
  var dimensions: Double
  
  /**
    * A correction factor that is applied to the sampled data points before they are added to the origin.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
    */
  var lowerLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
    */
  var origin: Quantity
  
  /**
    * This is usually a whole number.
    */
  var period: Double
  
  /**
    * The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
    */
  var upperLimit: js.UndefOr[Double] = js.undefined
}
object SampledData {
  
  inline def apply(data: String, dimensions: Double, origin: Quantity, period: Double): SampledData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SampledData] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: Double): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setLowerLimit(value: Double): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
    
    inline def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
    
    inline def setOrigin(value: Quantity): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setUpperLimit(value: Double): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
    
    inline def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
  }
}
