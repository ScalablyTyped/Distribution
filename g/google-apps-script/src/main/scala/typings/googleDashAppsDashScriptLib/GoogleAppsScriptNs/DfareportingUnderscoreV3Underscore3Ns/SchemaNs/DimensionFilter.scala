package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(
    dimensionName: java.lang.String = null,
    kind: java.lang.String = null,
    value: java.lang.String = null
  ): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionFilter]
  }
}

