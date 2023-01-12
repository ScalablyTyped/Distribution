package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var data: AuthorizeId
  
  var status: String
}
object Status {
  
  inline def apply(data: AuthorizeId, status: String): Status = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setData(value: AuthorizeId): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
