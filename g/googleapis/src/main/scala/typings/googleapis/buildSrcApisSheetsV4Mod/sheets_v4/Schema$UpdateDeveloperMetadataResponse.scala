package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from updating developer metadata.
  */
@js.native
trait Schema$UpdateDeveloperMetadataResponse extends js.Object {
  /**
    * The updated developer metadata.
    */
  var developerMetadata: js.UndefOr[js.Array[Schema$DeveloperMetadata]] = js.native
}

object Schema$UpdateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: js.Array[Schema$DeveloperMetadata] = null): Schema$UpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDeveloperMetadataResponse]
  }
}

