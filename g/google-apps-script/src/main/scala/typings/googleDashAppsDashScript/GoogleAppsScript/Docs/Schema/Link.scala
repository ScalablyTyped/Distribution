package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var bookmarkId: js.UndefOr[String] = js.undefined
  var headingId: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(bookmarkId: String = null, headingId: String = null, url: String = null): Link = {
    val __obj = js.Dynamic.literal()
    if (bookmarkId != null) __obj.updateDynamic("bookmarkId")(bookmarkId.asInstanceOf[js.Any])
    if (headingId != null) __obj.updateDynamic("headingId")(headingId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

