package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPrerenderingAllowedRequest extends StObject {
  
  var isAllowed: Boolean
}
object SetPrerenderingAllowedRequest {
  
  inline def apply(isAllowed: Boolean): SetPrerenderingAllowedRequest = {
    val __obj = js.Dynamic.literal(isAllowed = isAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPrerenderingAllowedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetPrerenderingAllowedRequest] (val x: Self) extends AnyVal {
    
    inline def setIsAllowed(value: Boolean): Self = StObject.set(x, "isAllowed", value.asInstanceOf[js.Any])
  }
}
