package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message that is published by publishers and consumed by subscribers. The
  * message must contain either a non-empty data field or at least one
  * attribute. Note that client libraries represent this object differently
  * depending on the language. See the corresponding &lt;a
  * href=&quot;https://cloud.google.com/pubsub/docs/reference/libraries&quot;&gt;client
  * library documentation&lt;/a&gt; for more information. See &lt;a
  * href=&quot;https://cloud.google.com/pubsub/quotas&quot;&gt;Quotas and
  * limits&lt;/a&gt; for more information about message limits.
  */
trait SchemaPubsubMessage extends StObject {
  
  /**
    * Optional attributes for this message.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The message data field. If this field is empty, the message must contain
    * at least one attribute.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this message, assigned by the server when the message is published.
    * Guaranteed to be unique within the topic. This value may be read by a
    * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
    * delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the message was published, populated by the server when
    * it receives the `Publish` call. It must not be populated by the publisher
    * in a `Publish` call.
    */
  var publishTime: js.UndefOr[String] = js.undefined
}
object SchemaPubsubMessage {
  
  @scala.inline
  def apply(): SchemaPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubMessage]
  }
  
  @scala.inline
  implicit class SchemaPubsubMessageMutableBuilder[Self <: SchemaPubsubMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
