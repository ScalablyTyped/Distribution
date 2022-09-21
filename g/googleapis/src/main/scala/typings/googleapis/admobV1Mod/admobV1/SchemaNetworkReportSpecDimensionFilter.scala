package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkReportSpecDimensionFilter extends StObject {
  
  /**
    * Applies the filter criterion to the specified dimension.
    */
  var dimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Matches a row if its value for the specified dimension is in one of the values specified in this condition.
    */
  var matchesAny: js.UndefOr[SchemaStringList] = js.undefined
}
object SchemaNetworkReportSpecDimensionFilter {
  
  inline def apply(): SchemaNetworkReportSpecDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkReportSpecDimensionFilter]
  }
  
  extension [Self <: SchemaNetworkReportSpecDimensionFilter](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionNull: Self = StObject.set(x, "dimension", null)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMatchesAny(value: SchemaStringList): Self = StObject.set(x, "matchesAny", value.asInstanceOf[js.Any])
    
    inline def setMatchesAnyUndefined: Self = StObject.set(x, "matchesAny", js.undefined)
  }
}
