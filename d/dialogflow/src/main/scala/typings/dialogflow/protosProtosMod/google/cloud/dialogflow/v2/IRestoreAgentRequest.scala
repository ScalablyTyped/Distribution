package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreAgentRequest. */
trait IRestoreAgentRequest extends StObject {
  
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IRestoreAgentRequest {
  
  inline def apply(): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
  
  extension [Self <: IRestoreAgentRequest](x: Self) {
    
    inline def setAgentContent(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentNull: Self = StObject.set(x, "agentContent", null)
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
