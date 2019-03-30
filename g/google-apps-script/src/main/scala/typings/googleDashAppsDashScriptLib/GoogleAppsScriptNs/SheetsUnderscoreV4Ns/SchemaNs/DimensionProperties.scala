package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionProperties extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  var hiddenByFilter: js.UndefOr[scala.Boolean] = js.undefined
  var hiddenByUser: js.UndefOr[scala.Boolean] = js.undefined
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
}

object DimensionProperties {
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata] = null,
    hiddenByFilter: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenByUser: js.UndefOr[scala.Boolean] = js.undefined,
    pixelSize: scala.Int | scala.Double = null
  ): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    if (!js.isUndefined(hiddenByFilter)) __obj.updateDynamic("hiddenByFilter")(hiddenByFilter)
    if (!js.isUndefined(hiddenByUser)) __obj.updateDynamic("hiddenByUser")(hiddenByUser)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionProperties]
  }
}

