package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudPubsubTopic extends js.Object {
  /**
    * The `name` field of a Cloud Pub/Sub
    * [Topic](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[java.lang.String] = js.undefined
}

object CloudPubsubTopic {
  @scala.inline
  def apply(topicName: java.lang.String = null): CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[CloudPubsubTopic]
  }
}

