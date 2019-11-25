package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Metadata.DimensionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Metadata.MetricsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataCollection extends js.Object {
  var Dimensions: js.UndefOr[DimensionsCollection] = js.undefined
  var Metrics: js.UndefOr[MetricsCollection] = js.undefined
}

object MetadataCollection {
  @scala.inline
  def apply(Dimensions: DimensionsCollection = null, Metrics: MetricsCollection = null): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataCollection]
  }
}

