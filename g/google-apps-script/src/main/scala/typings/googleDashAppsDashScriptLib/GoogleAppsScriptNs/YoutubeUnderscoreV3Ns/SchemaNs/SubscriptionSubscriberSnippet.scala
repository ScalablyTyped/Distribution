package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionSubscriberSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionSubscriberSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    description: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
  ): SubscriptionSubscriberSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SubscriptionSubscriberSnippet]
  }
}

