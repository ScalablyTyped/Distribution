package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingMetadataEntry extends js.Object {
  var compatibleDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var compatibleMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var requiredDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var requiredMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var supportedProducts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReportingMetadataEntry {
  @scala.inline
  def apply(
    compatibleDimensions: js.Array[java.lang.String] = null,
    compatibleMetrics: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    requiredDimensions: js.Array[java.lang.String] = null,
    requiredMetrics: js.Array[java.lang.String] = null,
    supportedProducts: js.Array[java.lang.String] = null
  ): ReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (compatibleDimensions != null) __obj.updateDynamic("compatibleDimensions")(compatibleDimensions)
    if (compatibleMetrics != null) __obj.updateDynamic("compatibleMetrics")(compatibleMetrics)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (requiredDimensions != null) __obj.updateDynamic("requiredDimensions")(requiredDimensions)
    if (requiredMetrics != null) __obj.updateDynamic("requiredMetrics")(requiredMetrics)
    if (supportedProducts != null) __obj.updateDynamic("supportedProducts")(supportedProducts)
    __obj.asInstanceOf[ReportingMetadataEntry]
  }
}

