package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseObjectRequest extends StObject {
  
  /**
    * Identifier of the object to release.
    */
  var objectId: RemoteObjectId
}
object ReleaseObjectRequest {
  
  inline def apply(objectId: RemoteObjectId): ReleaseObjectRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectRequest]
  }
  
  extension [Self <: ReleaseObjectRequest](x: Self) {
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
