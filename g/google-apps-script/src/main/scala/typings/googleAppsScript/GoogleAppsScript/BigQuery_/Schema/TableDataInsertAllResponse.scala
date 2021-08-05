package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataInsertAllResponse extends StObject {
  
  var insertErrors: js.UndefOr[js.Array[TableDataInsertAllResponseInsertErrors]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object TableDataInsertAllResponse {
  
  inline def apply(): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
  
  extension [Self <: TableDataInsertAllResponse](x: Self) {
    
    inline def setInsertErrors(value: js.Array[TableDataInsertAllResponseInsertErrors]): Self = StObject.set(x, "insertErrors", value.asInstanceOf[js.Any])
    
    inline def setInsertErrorsUndefined: Self = StObject.set(x, "insertErrors", js.undefined)
    
    inline def setInsertErrorsVarargs(value: TableDataInsertAllResponseInsertErrors*): Self = StObject.set(x, "insertErrors", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
