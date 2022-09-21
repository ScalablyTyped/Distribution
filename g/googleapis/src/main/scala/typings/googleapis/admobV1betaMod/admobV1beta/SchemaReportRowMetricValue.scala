package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRowMetricValue extends StObject {
  
  /**
    * Double precision (approximate) decimal values. Rates are from 0 to 1.
    */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Metric integer value.
    */
  var integerValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD, EUR or other) specified by the request. For example, $6.50 whould be represented as 6500000 micros.
    */
  var microsValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportRowMetricValue {
  
  inline def apply(): SchemaReportRowMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRowMetricValue]
  }
  
  extension [Self <: SchemaReportRowMetricValue](x: Self) {
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMicrosValue(value: String): Self = StObject.set(x, "microsValue", value.asInstanceOf[js.Any])
    
    inline def setMicrosValueNull: Self = StObject.set(x, "microsValue", null)
    
    inline def setMicrosValueUndefined: Self = StObject.set(x, "microsValue", js.undefined)
  }
}
