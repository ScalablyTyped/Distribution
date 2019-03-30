package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  var statusContent: js.UndefOr[java.lang.String] = js.undefined
  var statusFileName: js.UndefOr[java.lang.String] = js.undefined
}

object StatusReport {
  @scala.inline
  def apply(statusContent: java.lang.String = null, statusFileName: java.lang.String = null): StatusReport = {
    val __obj = js.Dynamic.literal()
    if (statusContent != null) __obj.updateDynamic("statusContent")(statusContent)
    if (statusFileName != null) __obj.updateDynamic("statusFileName")(statusFileName)
    __obj.asInstanceOf[StatusReport]
  }
}

