package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBetweenFilter extends StObject {
  
  /**
    * Begins with this number.
    */
  var fromValue: js.UndefOr[SchemaNumericValue] = js.undefined
  
  /**
    * Ends with this number.
    */
  var toValue: js.UndefOr[SchemaNumericValue] = js.undefined
}
object SchemaBetweenFilter {
  
  inline def apply(): SchemaBetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBetweenFilter]
  }
  
  extension [Self <: SchemaBetweenFilter](x: Self) {
    
    inline def setFromValue(value: SchemaNumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setToValue(value: SchemaNumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
