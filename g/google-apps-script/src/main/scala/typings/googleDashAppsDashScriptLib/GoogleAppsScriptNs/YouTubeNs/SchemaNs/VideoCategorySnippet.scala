package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[scala.Boolean] = js.undefined
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object VideoCategorySnippet {
  @scala.inline
  def apply(
    assignable: js.UndefOr[scala.Boolean] = js.undefined,
    channelId: java.lang.String = null,
    title: java.lang.String = null
  ): VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignable)) __obj.updateDynamic("assignable")(assignable)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VideoCategorySnippet]
  }
}

