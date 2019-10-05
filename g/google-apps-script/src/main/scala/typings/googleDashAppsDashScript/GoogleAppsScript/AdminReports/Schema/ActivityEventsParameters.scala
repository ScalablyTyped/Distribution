package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityEventsParameters extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.undefined
  var intValue: js.UndefOr[String] = js.undefined
  var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
  var multiValue: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ActivityEventsParameters {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    multiIntValue: js.Array[String] = null,
    multiValue: js.Array[String] = null,
    name: String = null,
    value: String = null
  ): ActivityEventsParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (intValue != null) __obj.updateDynamic("intValue")(intValue)
    if (multiIntValue != null) __obj.updateDynamic("multiIntValue")(multiIntValue)
    if (multiValue != null) __obj.updateDynamic("multiValue")(multiValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ActivityEventsParameters]
  }
}

