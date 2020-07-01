package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  var location: DeveloperMetadataLocation
  var metadataId: Double
  var metadataKey: String
  var metadataValue: String
  var visibility: DeveloperMetadataVisibility
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
}

