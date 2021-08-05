package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExportAgentResponse. */
trait IExportAgentResponse extends StObject {
  
  /** ExportAgentResponse agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** ExportAgentResponse agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
}
object IExportAgentResponse {
  
  inline def apply(): IExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportAgentResponse]
  }
  
  extension [Self <: IExportAgentResponse](x: Self) {
    
    inline def setAgentContent(value: Uint8Array | String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentNull: Self = StObject.set(x, "agentContent", null)
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
