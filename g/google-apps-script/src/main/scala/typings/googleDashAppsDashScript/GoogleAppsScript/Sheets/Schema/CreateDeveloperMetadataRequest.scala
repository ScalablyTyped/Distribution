package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeveloperMetadataRequest extends js.Object {
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}

object CreateDeveloperMetadataRequest {
  @scala.inline
  def apply(developerMetadata: DeveloperMetadata = null): CreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    __obj.asInstanceOf[CreateDeveloperMetadataRequest]
  }
}

