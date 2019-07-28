package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ActivitySnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    groupId: String = null,
    publishedAt: String = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null,
    `type`: String = null
  ): ActivitySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivitySnippet]
  }
}

