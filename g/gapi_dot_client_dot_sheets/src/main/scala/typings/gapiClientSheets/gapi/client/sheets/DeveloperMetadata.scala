package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  /** The location where the metadata is associated. */
  var location: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be
    * specified when metadata is created, otherwise one will be randomly
    * generated and assigned. Must be positive.
    */
  var metadataId: js.UndefOr[Double] = js.undefined
  /**
    * The metadata key. There may be multiple metadata in a spreadsheet with the
    * same key.  Developer metadata must always have a key specified.
    */
  var metadataKey: js.UndefOr[String] = js.undefined
  /** Data associated with the metadata's key. */
  var metadataValue: js.UndefOr[String] = js.undefined
  /**
    * The metadata visibility.  Developer metadata must always have a visibility
    * specified.
    */
  var visibility: js.UndefOr[String] = js.undefined
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    location: DeveloperMetadataLocation = null,
    metadataId: js.UndefOr[Double] = js.undefined,
    metadataKey: String = null,
    metadataValue: String = null,
    visibility: String = null
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(metadataId)) __obj.updateDynamic("metadataId")(metadataId.get.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

