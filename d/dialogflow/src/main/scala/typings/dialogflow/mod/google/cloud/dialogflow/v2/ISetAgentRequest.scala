package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SetAgentRequest. */
trait ISetAgentRequest extends StObject {
  
  /** SetAgentRequest agent */
  var agent: js.UndefOr[IAgent | Null] = js.undefined
  
  /** SetAgentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object ISetAgentRequest {
  
  @scala.inline
  def apply(): ISetAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetAgentRequest]
  }
  
  @scala.inline
  implicit class ISetAgentRequestMutableBuilder[Self <: ISetAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: IAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentNull: Self = StObject.set(x, "agent", null)
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
