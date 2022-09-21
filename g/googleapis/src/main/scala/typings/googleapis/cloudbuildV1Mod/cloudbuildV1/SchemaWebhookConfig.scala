package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebhookConfig extends StObject {
  
  /**
    * Required. Resource name for the secret required as a URL parameter.
    */
  var secret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebhookConfig {
  
  inline def apply(): SchemaWebhookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebhookConfig]
  }
  
  extension [Self <: SchemaWebhookConfig](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
