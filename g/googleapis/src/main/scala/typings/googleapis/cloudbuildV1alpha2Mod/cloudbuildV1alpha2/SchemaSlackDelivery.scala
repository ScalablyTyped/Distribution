package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlackDelivery extends StObject {
  
  /**
    * The secret reference for the Slack webhook URI for sending messages to a channel.
    */
  var webhookUri: js.UndefOr[SchemaNotifierSecretRef] = js.undefined
}
object SchemaSlackDelivery {
  
  inline def apply(): SchemaSlackDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlackDelivery]
  }
  
  extension [Self <: SchemaSlackDelivery](x: Self) {
    
    inline def setWebhookUri(value: SchemaNotifierSecretRef): Self = StObject.set(x, "webhookUri", value.asInstanceOf[js.Any])
    
    inline def setWebhookUriUndefined: Self = StObject.set(x, "webhookUri", js.undefined)
  }
}
