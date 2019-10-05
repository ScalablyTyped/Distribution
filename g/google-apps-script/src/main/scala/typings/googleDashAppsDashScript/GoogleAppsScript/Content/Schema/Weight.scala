package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  var unit: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Weight {
  @scala.inline
  def apply(unit: String = null, value: String = null): Weight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Weight]
  }
}

