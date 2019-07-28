package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSnippet extends js.Object {
  var publishedAt: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GroupSnippet {
  @scala.inline
  def apply(publishedAt: String = null, title: String = null): GroupSnippet = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GroupSnippet]
  }
}

