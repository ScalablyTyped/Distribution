package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDataInsertAllResponseInsertErrors extends StObject {
  
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.native
  
  var index: js.UndefOr[Double] = js.native
}
object TableDataInsertAllResponseInsertErrors {
  
  @scala.inline
  def apply(): TableDataInsertAllResponseInsertErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponseInsertErrors]
  }
  
  @scala.inline
  implicit class TableDataInsertAllResponseInsertErrorsMutableBuilder[Self <: TableDataInsertAllResponseInsertErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
