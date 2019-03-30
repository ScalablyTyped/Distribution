package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var bookmarkId: js.UndefOr[java.lang.String] = js.undefined
  var headingId: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    bookmarkId: java.lang.String = null,
    headingId: java.lang.String = null,
    url: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (bookmarkId != null) __obj.updateDynamic("bookmarkId")(bookmarkId)
    if (headingId != null) __obj.updateDynamic("headingId")(headingId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

