package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetails extends StObject {
  
  var errorDetails: js.UndefOr[js.Any] = js.native
  
  var httpStatus: js.UndefOr[Double] = js.native
  
  var requestOptions: js.UndefOr[js.Any] = js.native
}
object ErrorDetails {
  
  @scala.inline
  def apply(): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetails]
  }
  
  @scala.inline
  implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(value: js.Any): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: js.Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
