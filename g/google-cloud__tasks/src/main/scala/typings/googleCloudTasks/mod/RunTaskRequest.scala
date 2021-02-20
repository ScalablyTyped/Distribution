package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunTaskRequest extends StObject {
  
  var responseView: js.UndefOr[View] = js.native
}
object RunTaskRequest {
  
  @scala.inline
  def apply(): RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTaskRequest]
  }
  
  @scala.inline
  implicit class RunTaskRequestMutableBuilder[Self <: RunTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseView(value: View): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
