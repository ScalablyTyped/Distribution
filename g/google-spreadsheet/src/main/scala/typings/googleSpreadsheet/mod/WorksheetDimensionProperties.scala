package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetDimensionProperties extends js.Object {
  /**
    * @see https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.developerMetadata#DeveloperMetadata
    */
  var developerMetadata: js.Array[DeveloperMetadata] = js.native
  var hiddenByFilter: Boolean = js.native
  var hiddenByUser: Boolean = js.native
  var pixelSize: Double = js.native
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
  @scala.inline
  implicit class WorksheetDimensionPropertiesOps[Self <: WorksheetDimensionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = this.set("developerMetadata", js.Array(value :_*))
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenByFilter(value: Boolean): Self = this.set("hiddenByFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenByUser(value: Boolean): Self = this.set("hiddenByUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
  }
  
}

