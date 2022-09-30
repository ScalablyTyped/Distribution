package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IListValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResultSet. */
trait IResultSet extends StObject {
  
  /** ResultSet metadata */
  var metadata: js.UndefOr[IResultSetMetadata | Null] = js.undefined
  
  /** ResultSet rows */
  var rows: js.UndefOr[js.Array[IListValue] | Null] = js.undefined
  
  /** ResultSet stats */
  var stats: js.UndefOr[IResultSetStats | Null] = js.undefined
}
object IResultSet {
  
  inline def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  
  extension [Self <: IResultSet](x: Self) {
    
    inline def setMetadata(value: IResultSetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRows(value: js.Array[IListValue]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: IListValue*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStats(value: IResultSetStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsNull: Self = StObject.set(x, "stats", null)
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
