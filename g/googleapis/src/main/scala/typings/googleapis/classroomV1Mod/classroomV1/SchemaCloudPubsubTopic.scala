package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a Cloud Pub/Sub topic.  To register for notifications, the
  * owner of the topic must grant
  * `classroom-notifications@system.gserviceaccount.com` the
  * `projects.topics.publish` permission.
  */
trait SchemaCloudPubsubTopic extends StObject {
  
  /**
    * The `name` field of a Cloud Pub/Sub
    * [Topic](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String] = js.undefined
}
object SchemaCloudPubsubTopic {
  
  inline def apply(): SchemaCloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPubsubTopic]
  }
  
  extension [Self <: SchemaCloudPubsubTopic](x: Self) {
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
