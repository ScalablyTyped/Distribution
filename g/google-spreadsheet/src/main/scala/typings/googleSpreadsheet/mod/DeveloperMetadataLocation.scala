package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataLocation extends js.Object {
  
  var dimensionRange: DimensionRange = js.native
  
  var locationType: DeveloperMetadataLocationType = js.native
  
  var sheetId: Double = js.native
  
  var spreadsheet: Boolean = js.native
}
object DeveloperMetadataLocation {
  
  @scala.inline
  def apply(
    dimensionRange: DimensionRange,
    locationType: DeveloperMetadataLocationType,
    sheetId: Double,
    spreadsheet: Boolean
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(dimensionRange = dimensionRange.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], spreadsheet = spreadsheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  @scala.inline
  implicit class DeveloperMetadataLocationOps[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
    
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
    def setDimensionRange(value: DimensionRange): Self = this.set("dimensionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: DeveloperMetadataLocationType): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheet(value: Boolean): Self = this.set("spreadsheet", value.asInstanceOf[js.Any])
  }
}
