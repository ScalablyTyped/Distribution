package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  var dimensionName: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(dimensionName: String = null, kind: String = null, value: String = null): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionFilter]
  }
}

