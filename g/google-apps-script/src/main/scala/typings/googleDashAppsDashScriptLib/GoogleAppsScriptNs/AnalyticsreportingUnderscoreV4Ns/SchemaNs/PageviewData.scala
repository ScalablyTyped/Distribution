package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageviewData extends js.Object {
  var pagePath: js.UndefOr[java.lang.String] = js.undefined
  var pageTitle: js.UndefOr[java.lang.String] = js.undefined
}

object PageviewData {
  @scala.inline
  def apply(pagePath: java.lang.String = null, pageTitle: java.lang.String = null): PageviewData = {
    val __obj = js.Dynamic.literal()
    if (pagePath != null) __obj.updateDynamic("pagePath")(pagePath)
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle)
    __obj.asInstanceOf[PageviewData]
  }
}

