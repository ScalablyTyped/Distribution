package typings.domTrustToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLIFrameElement extends StObject {
  
  var trustToken: String
}
object HTMLIFrameElement {
  
  inline def apply(trustToken: String): HTMLIFrameElement = {
    val __obj = js.Dynamic.literal(trustToken = trustToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLIFrameElement]
  }
  
  extension [Self <: HTMLIFrameElement](x: Self) {
    
    inline def setTrustToken(value: String): Self = StObject.set(x, "trustToken", value.asInstanceOf[js.Any])
  }
}
