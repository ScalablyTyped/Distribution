package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[Boolean] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object VideoCategorySnippet {
  @scala.inline
  def apply(assignable: js.UndefOr[Boolean] = js.undefined, channelId: String = null, title: String = null): VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignable)) __obj.updateDynamic("assignable")(assignable.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCategorySnippet]
  }
}

