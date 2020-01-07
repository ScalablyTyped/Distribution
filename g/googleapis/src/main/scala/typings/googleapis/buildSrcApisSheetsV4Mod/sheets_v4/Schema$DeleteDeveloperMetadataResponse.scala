package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from deleting developer metadata.
  */
@js.native
trait Schema$DeleteDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[Schema$DeveloperMetadata]] = js.native
}

object Schema$DeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(deletedDeveloperMetadata: js.Array[Schema$DeveloperMetadata] = null): Schema$DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (deletedDeveloperMetadata != null) __obj.updateDynamic("deletedDeveloperMetadata")(deletedDeveloperMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteDeveloperMetadataResponse]
  }
}

