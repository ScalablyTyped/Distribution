package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLookup extends js.Object {
  var locationMatchingStrategy: js.UndefOr[java.lang.String] = js.undefined
  var locationType: js.UndefOr[java.lang.String] = js.undefined
  var metadataId: js.UndefOr[scala.Double] = js.undefined
  var metadataKey: js.UndefOr[java.lang.String] = js.undefined
  var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  var metadataValue: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object DeveloperMetadataLookup {
  @scala.inline
  def apply(
    locationMatchingStrategy: java.lang.String = null,
    locationType: java.lang.String = null,
    metadataId: scala.Int | scala.Double = null,
    metadataKey: java.lang.String = null,
    metadataLocation: DeveloperMetadataLocation = null,
    metadataValue: java.lang.String = null,
    visibility: java.lang.String = null
  ): DeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    if (locationMatchingStrategy != null) __obj.updateDynamic("locationMatchingStrategy")(locationMatchingStrategy)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    if (metadataId != null) __obj.updateDynamic("metadataId")(metadataId.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey)
    if (metadataLocation != null) __obj.updateDynamic("metadataLocation")(metadataLocation)
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[DeveloperMetadataLookup]
  }
}

