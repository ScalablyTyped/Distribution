package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  var location: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  var metadataId: js.UndefOr[scala.Double] = js.undefined
  var metadataKey: js.UndefOr[java.lang.String] = js.undefined
  var metadataValue: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    location: DeveloperMetadataLocation = null,
    metadataId: scala.Int | scala.Double = null,
    metadataKey: java.lang.String = null,
    metadataValue: java.lang.String = null,
    visibility: java.lang.String = null
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (metadataId != null) __obj.updateDynamic("metadataId")(metadataId.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey)
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

