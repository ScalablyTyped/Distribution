package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (metadataId != null) __obj.updateDynamic("metadataId")(metadataId.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

