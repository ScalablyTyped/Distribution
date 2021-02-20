package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.publisherMod.PublishOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /**
    * Format the name of a topic. A Topic's full name is in the format of
    * 'projects/{projectId}/topics/{topicName}'.
    *
    * @private
    *
    * @return {string}
    */
  @JSImport("@google-cloud/pubsub", "Topic.formatName_")
  @js.native
  def formatName_(projectId: String, name: String): String = js.native
}
