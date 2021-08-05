package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsRequest extends StObject {
  
  /**
    * Symbolic group name that can be used to release the results.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId
}
object QueryObjectsRequest {
  
  inline def apply(prototypeObjectId: RemoteObjectId): QueryObjectsRequest = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsRequest]
  }
  
  extension [Self <: QueryObjectsRequest](x: Self) {
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    inline def setPrototypeObjectId(value: RemoteObjectId): Self = StObject.set(x, "prototypeObjectId", value.asInstanceOf[js.Any])
  }
}
