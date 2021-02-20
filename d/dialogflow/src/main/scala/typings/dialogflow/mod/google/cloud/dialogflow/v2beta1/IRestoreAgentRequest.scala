package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreAgentRequest. */
@js.native
trait IRestoreAgentRequest extends StObject {
  
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.native
  
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.native
  
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object IRestoreAgentRequest {
  
  @scala.inline
  def apply(): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
  
  @scala.inline
  implicit class IRestoreAgentRequestMutableBuilder[Self <: IRestoreAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentContent(value: Uint8Array | String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentContentNull: Self = StObject.set(x, "agentContent", null)
    
    @scala.inline
    def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    @scala.inline
    def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    @scala.inline
    def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
