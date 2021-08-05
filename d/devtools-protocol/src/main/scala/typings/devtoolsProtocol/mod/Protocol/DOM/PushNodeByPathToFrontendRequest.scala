package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNodeByPathToFrontendRequest extends StObject {
  
  /**
    * Path to node in the proprietary format.
    */
  var path: String
}
object PushNodeByPathToFrontendRequest {
  
  inline def apply(path: String): PushNodeByPathToFrontendRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodeByPathToFrontendRequest]
  }
  
  extension [Self <: PushNodeByPathToFrontendRequest](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
