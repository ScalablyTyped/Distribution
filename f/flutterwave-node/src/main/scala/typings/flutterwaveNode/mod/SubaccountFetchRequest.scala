package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountFetchRequest extends StObject {
  
  var id: String
}
object SubaccountFetchRequest {
  
  inline def apply(id: String): SubaccountFetchRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountFetchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountFetchRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
