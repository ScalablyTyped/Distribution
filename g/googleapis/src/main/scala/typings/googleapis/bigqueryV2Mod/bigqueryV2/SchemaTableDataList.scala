package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableDataList extends StObject {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A token used for paging results. Providing this token instead of the
    * startIndex parameter can help you retrieve stable results when an
    * underlying table is changing.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Rows of results.
    */
  var rows: js.UndefOr[js.Array[SchemaTableRow]] = js.undefined
  
  /**
    * The total number of rows in the complete table.
    */
  var totalRows: js.UndefOr[String] = js.undefined
}
object SchemaTableDataList {
  
  @scala.inline
  def apply(): SchemaTableDataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataList]
  }
  
  @scala.inline
  implicit class SchemaTableDataListMutableBuilder[Self <: SchemaTableDataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaTableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
