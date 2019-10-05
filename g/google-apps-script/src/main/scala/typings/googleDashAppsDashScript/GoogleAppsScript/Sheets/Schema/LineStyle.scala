package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(`type`: String = null, width: Int | Double = null): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

