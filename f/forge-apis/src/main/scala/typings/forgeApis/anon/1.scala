package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var requests: js.Array[Size]
}
object `1` {
  
  inline def apply(requests: js.Array[Size]): `1` = {
    val __obj = js.Dynamic.literal(requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setRequests(value: js.Array[Size]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: Size*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
