package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActivitySnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    description: java.lang.String = null,
    groupId: java.lang.String = null,
    publishedAt: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

