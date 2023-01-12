package typings.domTrustToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInit extends StObject {
  
  var trustToken: js.UndefOr[TrustToken] = js.undefined
}
object RequestInit {
  
  inline def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
    
    inline def setTrustToken(value: TrustToken): Self = StObject.set(x, "trustToken", value.asInstanceOf[js.Any])
    
    inline def setTrustTokenUndefined: Self = StObject.set(x, "trustToken", js.undefined)
  }
}
