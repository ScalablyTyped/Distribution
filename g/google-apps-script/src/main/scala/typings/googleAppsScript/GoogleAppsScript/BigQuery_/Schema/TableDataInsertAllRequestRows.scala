package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataInsertAllRequestRows extends StObject {
  
  var insertId: js.UndefOr[String] = js.undefined
  
  var json: js.UndefOr[js.Object] = js.undefined
}
object TableDataInsertAllRequestRows {
  
  @scala.inline
  def apply(): TableDataInsertAllRequestRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequestRows]
  }
  
  @scala.inline
  implicit class TableDataInsertAllRequestRowsMutableBuilder[Self <: TableDataInsertAllRequestRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    @scala.inline
    def setJson(value: js.Object): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
