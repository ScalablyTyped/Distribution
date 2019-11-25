package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategorySnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GuideCategorySnippet {
  @scala.inline
  def apply(channelId: String = null, title: String = null): GuideCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideCategorySnippet]
  }
}

