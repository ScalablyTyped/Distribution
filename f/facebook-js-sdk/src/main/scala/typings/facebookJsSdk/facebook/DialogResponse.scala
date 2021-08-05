package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogResponse extends StObject {
  
  var error_code: js.UndefOr[Double] = js.undefined
  
  var error_message: js.UndefOr[String] = js.undefined
}
object DialogResponse {
  
  inline def apply(): DialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogResponse]
  }
  
  extension [Self <: DialogResponse](x: Self) {
    
    inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    inline def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
  }
}
