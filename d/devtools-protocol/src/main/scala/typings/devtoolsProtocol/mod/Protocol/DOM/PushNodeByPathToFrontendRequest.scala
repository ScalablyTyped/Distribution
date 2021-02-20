package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNodeByPathToFrontendRequest extends StObject {
  
  /**
    * Path to node in the proprietary format.
    */
  var path: String = js.native
}
object PushNodeByPathToFrontendRequest {
  
  @scala.inline
  def apply(path: String): PushNodeByPathToFrontendRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodeByPathToFrontendRequest]
  }
  
  @scala.inline
  implicit class PushNodeByPathToFrontendRequestMutableBuilder[Self <: PushNodeByPathToFrontendRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
