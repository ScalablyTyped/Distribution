package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInterestGroupDetailsRequest extends StObject {
  
  var name: String
  
  var ownerOrigin: String
}
object GetInterestGroupDetailsRequest {
  
  inline def apply(name: String, ownerOrigin: String): GetInterestGroupDetailsRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInterestGroupDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInterestGroupDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
  }
}
