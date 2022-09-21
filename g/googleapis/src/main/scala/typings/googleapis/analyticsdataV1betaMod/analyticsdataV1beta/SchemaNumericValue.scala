package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNumericValue extends StObject {
  
  /**
    * Double value
    */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Integer value
    */
  var int64Value: js.UndefOr[String | Null] = js.undefined
}
object SchemaNumericValue {
  
  inline def apply(): SchemaNumericValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericValue]
  }
  
  extension [Self <: SchemaNumericValue](x: Self) {
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueNull: Self = StObject.set(x, "int64Value", null)
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
  }
}
