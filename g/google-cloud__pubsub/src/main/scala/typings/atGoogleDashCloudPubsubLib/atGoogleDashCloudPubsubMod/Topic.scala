package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Topic")
@js.native
class Topic protected ()
  extends atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic {
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String) = this()
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, name: java.lang.String, options: atGoogleDashCloudPubsubLib.buildSrcPublisherMod.PublishOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Topic")
@js.native
object Topic extends js.Object {
  /**
    * Format the name of a topic. A Topic's full name is in the format of
    * 'projects/{projectId}/topics/{topicName}'.
    *
    * @private
    *
    * @return {string}
    */
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

