package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlGetAsyncResponse extends StObject {
  
  var columns: js.UndefOr[js.Array[SqlColumn]] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var id: Id
  
  var is_partial: Boolean
  
  var is_running: Boolean
  
  var rows: js.Array[SqlRow]
}
object SqlGetAsyncResponse {
  
  inline def apply(id: Id, is_partial: Boolean, is_running: Boolean, rows: js.Array[SqlRow]): SqlGetAsyncResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlGetAsyncResponse]
  }
  
  extension [Self <: SqlGetAsyncResponse](x: Self) {
    
    inline def setColumns(value: js.Array[SqlColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SqlColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[SqlRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: SqlRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
