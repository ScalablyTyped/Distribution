package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingMetadataEntry extends js.Object {
  var compatibleDimensions: js.UndefOr[js.Array[String]] = js.undefined
  var compatibleMetrics: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var requiredDimensions: js.UndefOr[js.Array[String]] = js.undefined
  var requiredMetrics: js.UndefOr[js.Array[String]] = js.undefined
  var supportedProducts: js.UndefOr[js.Array[String]] = js.undefined
}

object ReportingMetadataEntry {
  @scala.inline
  def apply(
    compatibleDimensions: js.Array[String] = null,
    compatibleMetrics: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    requiredDimensions: js.Array[String] = null,
    requiredMetrics: js.Array[String] = null,
    supportedProducts: js.Array[String] = null
  ): ReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (compatibleDimensions != null) __obj.updateDynamic("compatibleDimensions")(compatibleDimensions.asInstanceOf[js.Any])
    if (compatibleMetrics != null) __obj.updateDynamic("compatibleMetrics")(compatibleMetrics.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (requiredDimensions != null) __obj.updateDynamic("requiredDimensions")(requiredDimensions.asInstanceOf[js.Any])
    if (requiredMetrics != null) __obj.updateDynamic("requiredMetrics")(requiredMetrics.asInstanceOf[js.Any])
    if (supportedProducts != null) __obj.updateDynamic("supportedProducts")(supportedProducts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingMetadataEntry]
  }
}

