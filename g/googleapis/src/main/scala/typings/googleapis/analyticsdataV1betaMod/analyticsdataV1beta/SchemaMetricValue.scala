package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricValue extends StObject {
  
  /**
    * Measurement value. See MetricHeader for type.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricValue {
  
  inline def apply(): SchemaMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValue]
  }
  
  extension [Self <: SchemaMetricValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
