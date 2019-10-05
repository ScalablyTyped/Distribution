package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageviewData extends js.Object {
  var pagePath: js.UndefOr[String] = js.undefined
  var pageTitle: js.UndefOr[String] = js.undefined
}

object PageviewData {
  @scala.inline
  def apply(pagePath: String = null, pageTitle: String = null): PageviewData = {
    val __obj = js.Dynamic.literal()
    if (pagePath != null) __obj.updateDynamic("pagePath")(pagePath)
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle)
    __obj.asInstanceOf[PageviewData]
  }
}

