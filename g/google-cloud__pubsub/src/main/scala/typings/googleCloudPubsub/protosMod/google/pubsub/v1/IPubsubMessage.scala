package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PubsubMessage. */
trait IPubsubMessage extends StObject {
  
  /** PubsubMessage attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** PubsubMessage data */
  var data: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** PubsubMessage messageId */
  var messageId: js.UndefOr[String | Null] = js.undefined
  
  /** PubsubMessage orderingKey */
  var orderingKey: js.UndefOr[String | Null] = js.undefined
  
  /** PubsubMessage publishTime */
  var publishTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IPubsubMessage {
  
  @scala.inline
  def apply(): IPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPubsubMessage]
  }
  
  @scala.inline
  implicit class IPubsubMessageMutableBuilder[Self <: IPubsubMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setData(value: Uint8Array | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setOrderingKey(value: String): Self = StObject.set(x, "orderingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingKeyNull: Self = StObject.set(x, "orderingKey", null)
    
    @scala.inline
    def setOrderingKeyUndefined: Self = StObject.set(x, "orderingKey", js.undefined)
    
    @scala.inline
    def setPublishTime(value: ITimestamp): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    @scala.inline
    def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
