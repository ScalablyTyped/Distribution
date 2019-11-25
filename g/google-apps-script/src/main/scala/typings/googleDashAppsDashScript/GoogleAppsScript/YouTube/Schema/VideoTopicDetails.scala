package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoTopicDetails extends js.Object {
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.undefined
  var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
  var topicIds: js.UndefOr[js.Array[String]] = js.undefined
}

object VideoTopicDetails {
  @scala.inline
  def apply(
    relevantTopicIds: js.Array[String] = null,
    topicCategories: js.Array[String] = null,
    topicIds: js.Array[String] = null
  ): VideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (relevantTopicIds != null) __obj.updateDynamic("relevantTopicIds")(relevantTopicIds.asInstanceOf[js.Any])
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories.asInstanceOf[js.Any])
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTopicDetails]
  }
}

