package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityEventsParameters extends js.Object {
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  var intValue: js.UndefOr[java.lang.String] = js.undefined
  var multiIntValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var multiValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityEventsParameters {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    intValue: java.lang.String = null,
    multiIntValue: js.Array[java.lang.String] = null,
    multiValue: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    value: java.lang.String = null
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

