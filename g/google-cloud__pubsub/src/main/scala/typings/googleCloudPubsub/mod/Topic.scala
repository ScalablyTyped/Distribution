package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.publisherMod.PublishOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Topic")
@js.native
class Topic protected ()
  extends typings.googleCloudPubsub.topicMod.Topic {
  def this(pubsub: typings.googleCloudPubsub.pubsubMod.PubSub, name: String) = this()
  def this(pubsub: typings.googleCloudPubsub.pubsubMod.PubSub, name: String, options: PublishOptions) = this()
}
/* static members */
object Topic {
  
  @JSImport("@google-cloud/pubsub", "Topic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the name of a topic. A Topic's full name is in the format of
    * 'projects/{projectId}/topics/{topicName}'.
    *
    * @private
    *
    * @return {string}
    */
  @scala.inline
  def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
