package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PubsubMessage. */
trait IPubsubMessage extends StObject {
  
  /** PubsubMessage attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** PubsubMessage data */
  var data: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** PubsubMessage messageId */
  var messageId: js.UndefOr[String | Null] = js.undefined
  
  /** PubsubMessage orderingKey */
  var orderingKey: js.UndefOr[String | Null] = js.undefined
  
  /** PubsubMessage publishTime */
  var publishTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IPubsubMessage {
  
  inline def apply(): IPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPubsubMessage]
  }
  
  extension [Self <: IPubsubMessage](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setData(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setOrderingKey(value: String): Self = StObject.set(x, "orderingKey", value.asInstanceOf[js.Any])
    
    inline def setOrderingKeyNull: Self = StObject.set(x, "orderingKey", null)
    
    inline def setOrderingKeyUndefined: Self = StObject.set(x, "orderingKey", js.undefined)
    
    inline def setPublishTime(value: ITimestamp): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
