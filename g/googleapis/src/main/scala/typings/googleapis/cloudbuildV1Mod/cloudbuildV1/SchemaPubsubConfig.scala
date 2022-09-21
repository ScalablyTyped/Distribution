package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubConfig extends StObject {
  
  /**
    * Service account that will make the push request.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the subscription. Format is `projects/{project\}/subscriptions/{subscription\}`.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the topic from which this subscription is receiving messages. Format is `projects/{project\}/topics/{topic\}`.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubsubConfig {
  
  inline def apply(): SchemaPubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubConfig]
  }
  
  extension [Self <: SchemaPubsubConfig](x: Self) {
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
