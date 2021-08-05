package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataList extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  
  var totalRows: js.UndefOr[String] = js.undefined
}
object TableDataList {
  
  inline def apply(): TableDataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataList]
  }
  
  extension [Self <: TableDataList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
