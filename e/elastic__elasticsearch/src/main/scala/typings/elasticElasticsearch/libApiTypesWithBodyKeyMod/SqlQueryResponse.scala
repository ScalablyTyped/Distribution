package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQueryResponse extends StObject {
  
  var columns: js.UndefOr[js.Array[SqlColumn]] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var is_partial: js.UndefOr[Boolean] = js.undefined
  
  var is_running: js.UndefOr[Boolean] = js.undefined
  
  var rows: js.Array[SqlRow]
}
object SqlQueryResponse {
  
  inline def apply(rows: js.Array[SqlRow]): SqlQueryResponse = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryResponse]
  }
  
  extension [Self <: SqlQueryResponse](x: Self) {
    
    inline def setColumns(value: js.Array[SqlColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SqlColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_partialUndefined: Self = StObject.set(x, "is_partial", js.undefined)
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setIs_runningUndefined: Self = StObject.set(x, "is_running", js.undefined)
    
    inline def setRows(value: js.Array[SqlRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: SqlRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
