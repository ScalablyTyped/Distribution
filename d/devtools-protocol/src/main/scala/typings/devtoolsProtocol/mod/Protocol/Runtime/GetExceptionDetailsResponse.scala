package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExceptionDetailsResponse extends StObject {
  
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
}
object GetExceptionDetailsResponse {
  
  inline def apply(): GetExceptionDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExceptionDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExceptionDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
  }
}
