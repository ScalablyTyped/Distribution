package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ImportAgentRequest. */
trait IImportAgentRequest extends StObject {
  
  /** ImportAgentRequest agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** ImportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  
  /** ImportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IImportAgentRequest {
  
  @scala.inline
  def apply(): IImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImportAgentRequest]
  }
  
  @scala.inline
  implicit class IImportAgentRequestMutableBuilder[Self <: IImportAgentRequest] (val x: Self) extends AnyVal {
    
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
