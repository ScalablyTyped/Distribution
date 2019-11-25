package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  var pattern: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object NumberFormat {
  @scala.inline
  def apply(pattern: String = null, `type`: String = null): NumberFormat = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}

