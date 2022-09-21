package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotDimensionHeader extends StObject {
  
  /**
    * Values of multiple dimensions in a pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
}
object SchemaPivotDimensionHeader {
  
  inline def apply(): SchemaPivotDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotDimensionHeader]
  }
  
  extension [Self <: SchemaPivotDimensionHeader](x: Self) {
    
    inline def setDimensionValues(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
  }
}
