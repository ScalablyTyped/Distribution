package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IStruct
import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResultSetStats. */
trait IResultSetStats extends StObject {
  
  /** ResultSetStats queryPlan */
  var queryPlan: js.UndefOr[IQueryPlan | Null] = js.undefined
  
  /** ResultSetStats queryStats */
  var queryStats: js.UndefOr[IStruct | Null] = js.undefined
  
  /** ResultSetStats rowCountExact */
  var rowCountExact: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** ResultSetStats rowCountLowerBound */
  var rowCountLowerBound: js.UndefOr[Double | ^ | String | Null] = js.undefined
}
object IResultSetStats {
  
  inline def apply(): IResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSetStats]
  }
  
  extension [Self <: IResultSetStats](x: Self) {
    
    inline def setQueryPlan(value: IQueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanNull: Self = StObject.set(x, "queryPlan", null)
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryStats(value: IStruct): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    inline def setQueryStatsNull: Self = StObject.set(x, "queryStats", null)
    
    inline def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    inline def setRowCountExact(value: Double | ^ | String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    inline def setRowCountExactNull: Self = StObject.set(x, "rowCountExact", null)
    
    inline def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    inline def setRowCountLowerBound(value: Double | ^ | String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    inline def setRowCountLowerBoundNull: Self = StObject.set(x, "rowCountLowerBound", null)
    
    inline def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
