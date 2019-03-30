package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTopicDetails extends js.Object {
  var topicCategories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topicIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChannelTopicDetails {
  @scala.inline
  def apply(topicCategories: js.Array[java.lang.String] = null, topicIds: js.Array[java.lang.String] = null): ChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories)
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds)
    __obj.asInstanceOf[ChannelTopicDetails]
  }
}

