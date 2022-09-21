package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTriggersWebhook
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the `ReceiveTriggerWebhook` to retrieve. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Project in which the specified trigger lives
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHttpBody] = js.undefined
  
  /**
    * Secret token used for authorization if an OAuth token isn't provided.
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the trigger to run the payload against
    */
  var trigger: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTriggersWebhook {
  
  inline def apply(): ParamsResourceProjectsTriggersWebhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTriggersWebhook]
  }
  
  extension [Self <: ParamsResourceProjectsTriggersWebhook](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaHttpBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
