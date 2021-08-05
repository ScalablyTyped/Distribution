package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  var errorDetails: js.UndefOr[js.Any] = js.undefined
  
  var httpStatus: js.UndefOr[Double] = js.undefined
  
  var requestOptions: js.UndefOr[js.Any] = js.undefined
}
object ErrorDetails {
  
  inline def apply(): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setErrorDetails(value: js.Any): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    inline def setRequestOptions(value: js.Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
