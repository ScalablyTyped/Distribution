package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionProperties extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  var hiddenByFilter: js.UndefOr[Boolean] = js.undefined
  var hiddenByUser: js.UndefOr[Boolean] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
}

object DimensionProperties {
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata] = null,
    hiddenByFilter: js.UndefOr[Boolean] = js.undefined,
    hiddenByUser: js.UndefOr[Boolean] = js.undefined,
    pixelSize: js.UndefOr[Double] = js.undefined
  ): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenByFilter)) __obj.updateDynamic("hiddenByFilter")(hiddenByFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenByUser)) __obj.updateDynamic("hiddenByUser")(hiddenByUser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelSize)) __obj.updateDynamic("pixelSize")(pixelSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionProperties]
  }
}

