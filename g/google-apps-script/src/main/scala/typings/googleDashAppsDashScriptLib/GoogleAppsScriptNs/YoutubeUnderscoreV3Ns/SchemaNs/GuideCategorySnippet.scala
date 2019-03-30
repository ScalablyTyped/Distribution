package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategorySnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object GuideCategorySnippet {
  @scala.inline
  def apply(channelId: java.lang.String = null, title: java.lang.String = null): GuideCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GuideCategorySnippet]
  }
}

