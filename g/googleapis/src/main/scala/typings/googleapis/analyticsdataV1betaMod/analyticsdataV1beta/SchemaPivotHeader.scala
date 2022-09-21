package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotHeader extends StObject {
  
  /**
    * The size is the same as the cardinality of the corresponding dimension combinations.
    */
  var pivotDimensionHeaders: js.UndefOr[js.Array[SchemaPivotDimensionHeader]] = js.undefined
  
  /**
    * The cardinality of the pivot. The total number of rows for this pivot's fields regardless of how the parameters `offset` and `limit` are specified in the request.
    */
  var rowCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPivotHeader {
  
  inline def apply(): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeader]
  }
  
  extension [Self <: SchemaPivotHeader](x: Self) {
    
    inline def setPivotDimensionHeaders(value: js.Array[SchemaPivotDimensionHeader]): Self = StObject.set(x, "pivotDimensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setPivotDimensionHeadersUndefined: Self = StObject.set(x, "pivotDimensionHeaders", js.undefined)
    
    inline def setPivotDimensionHeadersVarargs(value: SchemaPivotDimensionHeader*): Self = StObject.set(x, "pivotDimensionHeaders", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountNull: Self = StObject.set(x, "rowCount", null)
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
  }
}
