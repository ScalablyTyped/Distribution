package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadata extends js.Object {
  var location: DeveloperMetadataLocation = js.native
  var metadataId: Double = js.native
  var metadataKey: String = js.native
  var metadataValue: String = js.native
  var visibility: DeveloperMetadataVisibility = js.native
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    location: DeveloperMetadataLocation,
    metadataId: Double,
    metadataKey: String,
    metadataValue: String,
    visibility: DeveloperMetadataVisibility
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], metadataId = metadataId.asInstanceOf[js.Any], metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
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
    def setMetadataId(value: Double): Self = this.set("metadataId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataKey(value: String): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataValue(value: String): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: DeveloperMetadataVisibility): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

