package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteAgentRequest. */
trait IDeleteAgentRequest extends StObject {
  
  /** DeleteAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IDeleteAgentRequest {
  
  @scala.inline
  def apply(): IDeleteAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteAgentRequest]
  }
  
  @scala.inline
  implicit class IDeleteAgentRequestMutableBuilder[Self <: IDeleteAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
