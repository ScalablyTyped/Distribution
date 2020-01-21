package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTopicDetails extends js.Object {
  var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
  var topicIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ChannelTopicDetails {
  @scala.inline
  def apply(topicCategories: js.Array[String] = null, topicIds: js.Array[String] = null): ChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories.asInstanceOf[js.Any])
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTopicDetails]
  }
}

