package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseTargetResponse extends StObject {
  
  /**
    * Always set to true. If an error occurs, the response indicates protocol error.
    */
  var success: Boolean = js.native
}
object CloseTargetResponse {
  
  @scala.inline
  def apply(success: Boolean): CloseTargetResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTargetResponse]
  }
  
  @scala.inline
  implicit class CloseTargetResponseMutableBuilder[Self <: CloseTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
