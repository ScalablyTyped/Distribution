package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExportAgentRequest. */
trait IExportAgentRequest extends StObject {
  
  /** ExportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  
  /** ExportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IExportAgentRequest {
  
  @scala.inline
  def apply(): IExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportAgentRequest]
  }
  
  @scala.inline
  implicit class IExportAgentRequestMutableBuilder[Self <: IExportAgentRequest] (val x: Self) extends AnyVal {
    
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
