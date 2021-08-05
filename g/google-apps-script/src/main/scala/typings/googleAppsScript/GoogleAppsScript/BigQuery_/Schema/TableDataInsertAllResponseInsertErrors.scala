package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataInsertAllResponseInsertErrors extends StObject {
  
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
}
object TableDataInsertAllResponseInsertErrors {
  
  inline def apply(): TableDataInsertAllResponseInsertErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponseInsertErrors]
  }
  
  extension [Self <: TableDataInsertAllResponseInsertErrors](x: Self) {
    
    inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
