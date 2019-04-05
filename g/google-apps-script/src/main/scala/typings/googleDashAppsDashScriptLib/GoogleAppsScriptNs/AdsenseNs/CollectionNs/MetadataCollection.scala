package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataCollection extends js.Object {
  var Dimensions: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs.DimensionsCollection
  ] = js.undefined
  var Metrics: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs.MetricsCollection
  ] = js.undefined
}

object MetadataCollection {
  @scala.inline
  def apply(
    Dimensions: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs.DimensionsCollection = null,
    Metrics: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs.MetricsCollection = null
  ): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    __obj.asInstanceOf[MetadataCollection]
  }
}

