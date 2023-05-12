package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requests extends StObject {
  
  var requests: js.Array[ObjectKey]
}
object Requests {
  
  inline def apply(requests: js.Array[ObjectKey]): Requests = {
    val __obj = js.Dynamic.literal(requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requests] (val x: Self) extends AnyVal {
    
    inline def setRequests(value: js.Array[ObjectKey]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: ObjectKey*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
