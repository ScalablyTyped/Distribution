package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLookup extends js.Object {
  var locationMatchingStrategy: js.UndefOr[String] = js.undefined
  var locationType: js.UndefOr[String] = js.undefined
  var metadataId: js.UndefOr[Double] = js.undefined
  var metadataKey: js.UndefOr[String] = js.undefined
  var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  var metadataValue: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object DeveloperMetadataLookup {
  @scala.inline
  def apply(
    locationMatchingStrategy: String = null,
    locationType: String = null,
    metadataId: js.UndefOr[Double] = js.undefined,
    metadataKey: String = null,
    metadataLocation: DeveloperMetadataLocation = null,
    metadataValue: String = null,
    visibility: String = null
  ): DeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    if (locationMatchingStrategy != null) __obj.updateDynamic("locationMatchingStrategy")(locationMatchingStrategy.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (!js.isUndefined(metadataId)) __obj.updateDynamic("metadataId")(metadataId.get.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    if (metadataLocation != null) __obj.updateDynamic("metadataLocation")(metadataLocation.asInstanceOf[js.Any])
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadataLookup]
  }
}

