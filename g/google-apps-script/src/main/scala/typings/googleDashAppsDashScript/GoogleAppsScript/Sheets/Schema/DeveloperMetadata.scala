package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  var location: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  var metadataId: js.UndefOr[Double] = js.undefined
  var metadataKey: js.UndefOr[String] = js.undefined
  var metadataValue: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    location: DeveloperMetadataLocation = null,
    metadataId: Int | Double = null,
    metadataKey: String = null,
    metadataValue: String = null,
    visibility: String = null
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

