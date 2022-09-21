package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotSelection extends StObject {
  
  /**
    * Must be a dimension name from the request.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Order by only when the named dimension is this value.
    */
  var dimensionValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaPivotSelection {
  
  inline def apply(): SchemaPivotSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotSelection]
  }
  
  extension [Self <: SchemaPivotSelection](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setDimensionValue(value: String): Self = StObject.set(x, "dimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueNull: Self = StObject.set(x, "dimensionValue", null)
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "dimensionValue", js.undefined)
  }
}
