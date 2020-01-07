package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from creating developer metadata.
  */
@js.native
trait Schema$CreateDeveloperMetadataResponse extends js.Object {
  /**
    * The developer metadata that was created.
    */
  var developerMetadata: js.UndefOr[Schema$DeveloperMetadata] = js.native
}

object Schema$CreateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: Schema$DeveloperMetadata = null): Schema$CreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateDeveloperMetadataResponse]
  }
}

