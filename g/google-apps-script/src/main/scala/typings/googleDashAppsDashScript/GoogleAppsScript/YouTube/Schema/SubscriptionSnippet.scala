package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SubscriptionSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    publishedAt: String = null,
    resourceId: ResourceId = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): SubscriptionSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SubscriptionSnippet]
  }
}

