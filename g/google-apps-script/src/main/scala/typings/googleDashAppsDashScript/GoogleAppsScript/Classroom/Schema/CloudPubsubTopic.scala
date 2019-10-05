package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudPubsubTopic extends js.Object {
  var topicName: js.UndefOr[String] = js.undefined
}

object CloudPubsubTopic {
  @scala.inline
  def apply(topicName: String = null): CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[CloudPubsubTopic]
  }
}

