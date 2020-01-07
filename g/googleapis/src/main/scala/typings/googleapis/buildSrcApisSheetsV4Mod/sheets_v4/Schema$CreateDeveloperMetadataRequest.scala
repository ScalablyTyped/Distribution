package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create developer metadata.
  */
@js.native
trait Schema$CreateDeveloperMetadataRequest extends js.Object {
  /**
    * The developer metadata to create.
    */
  var developerMetadata: js.UndefOr[Schema$DeveloperMetadata] = js.native
}

object Schema$CreateDeveloperMetadataRequest {
  @scala.inline
  def apply(developerMetadata: Schema$DeveloperMetadata = null): Schema$CreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateDeveloperMetadataRequest]
  }
}

