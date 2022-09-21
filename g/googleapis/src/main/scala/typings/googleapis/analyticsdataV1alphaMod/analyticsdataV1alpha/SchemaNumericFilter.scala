package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNumericFilter extends StObject {
  
  /**
    * The operation type for this filter.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A numeric value or a date value.
    */
  var value: js.UndefOr[SchemaNumericValue] = js.undefined
}
object SchemaNumericFilter {
  
  inline def apply(): SchemaNumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericFilter]
  }
  
  extension [Self <: SchemaNumericFilter](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: SchemaNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
