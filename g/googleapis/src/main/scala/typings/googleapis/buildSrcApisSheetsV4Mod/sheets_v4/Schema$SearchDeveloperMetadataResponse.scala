package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to a developer metadata search request.
  */
@js.native
trait Schema$SearchDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata matching the criteria of the search request.
    */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[Schema$MatchedDeveloperMetadata]] = js.native
}

object Schema$SearchDeveloperMetadataResponse {
  @scala.inline
  def apply(matchedDeveloperMetadata: js.Array[Schema$MatchedDeveloperMetadata] = null): Schema$SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (matchedDeveloperMetadata != null) __obj.updateDynamic("matchedDeveloperMetadata")(matchedDeveloperMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchDeveloperMetadataResponse]
  }
}

