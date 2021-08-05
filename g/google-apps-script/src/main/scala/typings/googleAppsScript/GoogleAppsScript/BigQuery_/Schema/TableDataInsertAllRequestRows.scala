package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataInsertAllRequestRows extends StObject {
  
  var insertId: js.UndefOr[String] = js.undefined
  
  var json: js.UndefOr[js.Object] = js.undefined
}
object TableDataInsertAllRequestRows {
  
  inline def apply(): TableDataInsertAllRequestRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequestRows]
  }
  
  extension [Self <: TableDataInsertAllRequestRows](x: Self) {
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setJson(value: js.Object): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
