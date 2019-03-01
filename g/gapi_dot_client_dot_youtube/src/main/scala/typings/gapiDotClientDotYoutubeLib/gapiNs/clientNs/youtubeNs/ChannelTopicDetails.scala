package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTopicDetails extends js.Object {
  /** A list of Wikipedia URLs that describe the channel's content. */
  var topicCategories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API. */
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

