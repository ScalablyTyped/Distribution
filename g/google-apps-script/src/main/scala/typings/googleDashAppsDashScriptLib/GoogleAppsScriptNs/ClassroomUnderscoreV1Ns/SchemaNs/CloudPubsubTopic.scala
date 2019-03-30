package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudPubsubTopic extends js.Object {
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

