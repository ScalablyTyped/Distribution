package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunTaskRequest extends StObject {
  
  var responseView: js.UndefOr[View] = js.undefined
}
object RunTaskRequest {
  
  inline def apply(): RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setResponseView(value: View): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
