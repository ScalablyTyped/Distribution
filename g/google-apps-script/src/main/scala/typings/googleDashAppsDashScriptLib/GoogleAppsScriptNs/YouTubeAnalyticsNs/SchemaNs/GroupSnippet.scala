package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSnippet extends js.Object {
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object GroupSnippet {
  @scala.inline
  def apply(publishedAt: java.lang.String = null, title: java.lang.String = null): GroupSnippet = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GroupSnippet]
  }
}

