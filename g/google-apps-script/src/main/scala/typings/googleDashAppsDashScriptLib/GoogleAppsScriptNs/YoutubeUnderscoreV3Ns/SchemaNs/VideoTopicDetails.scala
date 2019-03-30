package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoTopicDetails extends js.Object {
  var relevantTopicIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topicCategories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topicIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object VideoTopicDetails {
  @scala.inline
  def apply(
    relevantTopicIds: js.Array[java.lang.String] = null,
    topicCategories: js.Array[java.lang.String] = null,
    topicIds: js.Array[java.lang.String] = null
  ): VideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (relevantTopicIds != null) __obj.updateDynamic("relevantTopicIds")(relevantTopicIds)
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories)
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds)
    __obj.asInstanceOf[VideoTopicDetails]
  }
}

