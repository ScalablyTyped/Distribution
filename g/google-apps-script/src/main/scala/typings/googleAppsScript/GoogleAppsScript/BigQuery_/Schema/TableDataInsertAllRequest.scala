package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDataInsertAllRequest extends StObject {
  
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[TableDataInsertAllRequestRows]] = js.native
  
  var skipInvalidRows: js.UndefOr[Boolean] = js.native
  
  var templateSuffix: js.UndefOr[String] = js.native
}
object TableDataInsertAllRequest {
  
  @scala.inline
  def apply(): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
  
  @scala.inline
  implicit class TableDataInsertAllRequestMutableBuilder[Self <: TableDataInsertAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[TableDataInsertAllRequestRows]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: TableDataInsertAllRequestRows*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSkipInvalidRows(value: Boolean): Self = StObject.set(x, "skipInvalidRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipInvalidRowsUndefined: Self = StObject.set(x, "skipInvalidRows", js.undefined)
    
    @scala.inline
    def setTemplateSuffix(value: String): Self = StObject.set(x, "templateSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSuffixUndefined: Self = StObject.set(x, "templateSuffix", js.undefined)
  }
}
