package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadata extends js.Object {
  /** The location where the metadata is associated. */
  var location: js.UndefOr[DeveloperMetadataLocation] = js.native
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be
    * specified when metadata is created, otherwise one will be randomly
    * generated and assigned. Must be positive.
    */
  var metadataId: js.UndefOr[Double] = js.native
  /**
    * The metadata key. There may be multiple metadata in a spreadsheet with the
    * same key.  Developer metadata must always have a key specified.
    */
  var metadataKey: js.UndefOr[String] = js.native
  /** Data associated with the metadata's key. */
  var metadataValue: js.UndefOr[String] = js.native
  /**
    * The metadata visibility.  Developer metadata must always have a visibility
    * specified.
    */
  var visibility: js.UndefOr[String] = js.native
}

object DeveloperMetadata {
  @scala.inline
  def apply(): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadata]
  }
  @scala.inline
  implicit class DeveloperMetadataOps[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocation(value: DeveloperMetadataLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMetadataId(value: Double): Self = this.set("metadataId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataId: Self = this.set("metadataId", js.undefined)
    @scala.inline
    def setMetadataKey(value: String): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataKey: Self = this.set("metadataKey", js.undefined)
    @scala.inline
    def setMetadataValue(value: String): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataValue: Self = this.set("metadataValue", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

