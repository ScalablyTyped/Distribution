package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error information about the response.
  */
@js.native
trait SchemaErrorInfo extends StObject {
  
  var errorMessages: js.UndefOr[js.Array[SchemaErrorMessage]] = js.native
}
object SchemaErrorInfo {
  
  @scala.inline
  def apply(): SchemaErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorInfo]
  }
  
  @scala.inline
  implicit class SchemaErrorInfoMutableBuilder[Self <: SchemaErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessages(value: js.Array[SchemaErrorMessage]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    @scala.inline
    def setErrorMessagesVarargs(value: SchemaErrorMessage*): Self = StObject.set(x, "errorMessages", js.Array(value :_*))
  }
}
