package typings.googleapis.cloudschedulerV1Mod.cloudschedulerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubMessage extends StObject {
  
  /**
    * Attributes for this message. If this field is empty, the message must contain non-empty data. This can be used to filter messages on the subscription.
    */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The message data field. If this field is empty, the message must contain at least one attribute.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this message, assigned by the server when the message is published. Guaranteed to be unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage` via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If non-empty, identifies related messages for which publish order should be respected. If a `Subscription` has `enable_message_ordering` set to `true`, messages published with the same non-empty `ordering_key` value will be delivered to subscribers in the order in which they are received by the Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest` must specify the same `ordering_key` value. For more information, see [ordering messages](https://cloud.google.com/pubsub/docs/ordering).
    */
  var orderingKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the message was published, populated by the server when it receives the `Publish` call. It must not be populated by the publisher in a `Publish` call.
    */
  var publishTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubsubMessage {
  
  inline def apply(): SchemaPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubMessage]
  }
  
  extension [Self <: SchemaPubsubMessage](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setOrderingKey(value: String): Self = StObject.set(x, "orderingKey", value.asInstanceOf[js.Any])
    
    inline def setOrderingKeyNull: Self = StObject.set(x, "orderingKey", null)
    
    inline def setOrderingKeyUndefined: Self = StObject.set(x, "orderingKey", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
