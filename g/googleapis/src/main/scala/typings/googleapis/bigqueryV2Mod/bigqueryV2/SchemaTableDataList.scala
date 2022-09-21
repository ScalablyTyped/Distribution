package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableDataList extends StObject {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token used for paging results. Providing this token instead of the startIndex parameter can help you retrieve stable results when an underlying table is changing.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rows of results.
    */
  var rows: js.UndefOr[js.Array[SchemaTableRow]] = js.undefined
  
  /**
    * The total number of rows in the complete table.
    */
  var totalRows: js.UndefOr[String | Null] = js.undefined
}
object SchemaTableDataList {
  
  inline def apply(): SchemaTableDataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataList]
  }
  
  extension [Self <: SchemaTableDataList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRows(value: js.Array[SchemaTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaTableRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    inline def setTotalRowsNull: Self = StObject.set(x, "totalRows", null)
    
    inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
