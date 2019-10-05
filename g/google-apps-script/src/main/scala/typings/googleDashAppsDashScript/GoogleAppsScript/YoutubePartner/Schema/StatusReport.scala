package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  var statusContent: js.UndefOr[String] = js.undefined
  var statusFileName: js.UndefOr[String] = js.undefined
}

object StatusReport {
  @scala.inline
  def apply(statusContent: String = null, statusFileName: String = null): StatusReport = {
    val __obj = js.Dynamic.literal()
    if (statusContent != null) __obj.updateDynamic("statusContent")(statusContent)
    if (statusFileName != null) __obj.updateDynamic("statusFileName")(statusFileName)
    __obj.asInstanceOf[StatusReport]
  }
}

