package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudPubsubTopic extends StObject {
  
  /**
    * Optional. The format of the payload that would be sent. If not specified the format will be JSON.
    */
  var payloadFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `name` field of a Cloud Pubsub [Topic] (https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudPubsubTopic {
  
  inline def apply(): SchemaCloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPubsubTopic]
  }
  
  extension [Self <: SchemaCloudPubsubTopic](x: Self) {
    
    inline def setPayloadFormat(value: String): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatNull: Self = StObject.set(x, "payloadFormat", null)
    
    inline def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameNull: Self = StObject.set(x, "topicName", null)
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
