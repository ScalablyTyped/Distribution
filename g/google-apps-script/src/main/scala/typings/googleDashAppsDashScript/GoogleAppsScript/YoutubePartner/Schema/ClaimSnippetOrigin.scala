package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimSnippetOrigin extends js.Object {
  var source: js.UndefOr[String] = js.undefined
}

object ClaimSnippetOrigin {
  @scala.inline
  def apply(source: String = null): ClaimSnippetOrigin = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimSnippetOrigin]
  }
}

