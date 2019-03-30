package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeveloperMetadataResponse extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}

object UpdateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: js.Array[DeveloperMetadata] = null): UpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    __obj.asInstanceOf[UpdateDeveloperMetadataResponse]
  }
}

