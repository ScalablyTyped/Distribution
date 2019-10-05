package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationPoint extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InterpolationPoint {
  @scala.inline
  def apply(color: Color = null, `type`: String = null, value: String = null): InterpolationPoint = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InterpolationPoint]
  }
}

