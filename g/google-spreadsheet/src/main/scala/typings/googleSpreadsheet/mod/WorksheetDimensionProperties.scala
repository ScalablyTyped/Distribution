package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetDimensionProperties extends js.Object {
  /**
    * @see https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.developerMetadata#DeveloperMetadata
    */
  var developerMetadata: js.Array[DeveloperMetadata]
  var hiddenByFilter: Boolean
  var hiddenByUser: Boolean
  var pixelSize: Double
}

object WorksheetDimensionProperties {
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata],
    hiddenByFilter: Boolean,
    hiddenByUser: Boolean,
    pixelSize: Double
  ): WorksheetDimensionProperties = {
    val __obj = js.Dynamic.literal(developerMetadata = developerMetadata.asInstanceOf[js.Any], hiddenByFilter = hiddenByFilter.asInstanceOf[js.Any], hiddenByUser = hiddenByUser.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDimensionProperties]
  }
}

