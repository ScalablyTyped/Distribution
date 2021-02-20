package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExportAgentResponse. */
@js.native
trait IExportAgentResponse extends StObject {
  
  /** ExportAgentResponse agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.native
  
  /** ExportAgentResponse agentUri */
  var agentUri: js.UndefOr[String | Null] = js.native
}
object IExportAgentResponse {
  
  @scala.inline
  def apply(): IExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportAgentResponse]
  }
  
  @scala.inline
  implicit class IExportAgentResponseMutableBuilder[Self <: IExportAgentResponse] (val x: Self) extends AnyVal {
    
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
  }
}
