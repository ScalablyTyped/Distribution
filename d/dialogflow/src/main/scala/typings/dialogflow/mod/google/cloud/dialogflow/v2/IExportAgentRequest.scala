package typings.dialogflow.mod.google.cloud.dialogflow.v2

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
  
  inline def apply(): IExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportAgentRequest]
  }
  
  extension [Self <: IExportAgentRequest](x: Self) {
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
