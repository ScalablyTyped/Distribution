package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatAppLogEntry extends StObject {
  
  /**
    * The deployment that caused the error. For Chat apps built in Apps Script, this is the deployment ID defined by Apps Script.
    */
  var deployment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unencrypted `callback_method` name that was running when the error was encountered.
    */
  var deploymentFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The error code and message.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaChatAppLogEntry {
  
  inline def apply(): SchemaChatAppLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatAppLogEntry]
  }
  
  extension [Self <: SchemaChatAppLogEntry](x: Self) {
    
    inline def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentFunction(value: String): Self = StObject.set(x, "deploymentFunction", value.asInstanceOf[js.Any])
    
    inline def setDeploymentFunctionNull: Self = StObject.set(x, "deploymentFunction", null)
    
    inline def setDeploymentFunctionUndefined: Self = StObject.set(x, "deploymentFunction", js.undefined)
    
    inline def setDeploymentNull: Self = StObject.set(x, "deployment", null)
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
