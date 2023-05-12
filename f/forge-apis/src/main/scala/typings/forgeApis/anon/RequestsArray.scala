package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestsArray extends StObject {
  
  var requests: js.Array[Parts]
}
object RequestsArray {
  
  inline def apply(requests: js.Array[Parts]): RequestsArray = {
    val __obj = js.Dynamic.literal(requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestsArray] (val x: Self) extends AnyVal {
    
    inline def setRequests(value: js.Array[Parts]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: Parts*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
