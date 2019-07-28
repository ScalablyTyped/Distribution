package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDeveloperMetadataResponse extends js.Object {
  var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.undefined
}

object SearchDeveloperMetadataResponse {
  @scala.inline
  def apply(matchedDeveloperMetadata: js.Array[MatchedDeveloperMetadata] = null): SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (matchedDeveloperMetadata != null) __obj.updateDynamic("matchedDeveloperMetadata")(matchedDeveloperMetadata)
    __obj.asInstanceOf[SearchDeveloperMetadataResponse]
  }
}

