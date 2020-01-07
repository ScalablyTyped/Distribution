package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group&#39;s content details.
  */
@js.native
trait Schema$GroupContentDetails extends js.Object {
  /**
    * The number of items in the group.
    */
  var itemCount: js.UndefOr[String] = js.native
  /**
    * The type of resources that the group contains.  Valid values for this
    * property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var itemType: js.UndefOr[String] = js.native
}

object Schema$GroupContentDetails {
  @scala.inline
  def apply(itemCount: String = null, itemType: String = null): Schema$GroupContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupContentDetails]
  }
}

