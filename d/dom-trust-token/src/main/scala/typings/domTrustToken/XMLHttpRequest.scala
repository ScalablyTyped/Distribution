package typings.domTrustToken

import typings.std.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequest extends StObject {
  
  def setTrustToken(trustToken: TrustToken): Unit
  
  val trustTokenOperationError: DOMException
}
object XMLHttpRequest {
  
  inline def apply(setTrustToken: TrustToken => Unit, trustTokenOperationError: DOMException): XMLHttpRequest = {
    val __obj = js.Dynamic.literal(setTrustToken = js.Any.fromFunction1(setTrustToken), trustTokenOperationError = trustTokenOperationError.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequest]
  }
  
  extension [Self <: XMLHttpRequest](x: Self) {
    
    inline def setSetTrustToken(value: TrustToken => Unit): Self = StObject.set(x, "setTrustToken", js.Any.fromFunction1(value))
    
    inline def setTrustTokenOperationError(value: DOMException): Self = StObject.set(x, "trustTokenOperationError", value.asInstanceOf[js.Any])
  }
}
