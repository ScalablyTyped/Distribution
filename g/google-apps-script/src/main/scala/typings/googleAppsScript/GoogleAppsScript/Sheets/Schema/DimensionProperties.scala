package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionProperties extends js.Object {
  
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  
  var hiddenByFilter: js.UndefOr[Boolean] = js.native
  
  var hiddenByUser: js.UndefOr[Boolean] = js.native
  
  var pixelSize: js.UndefOr[Double] = js.native
}
object DimensionProperties {
  
  @scala.inline
  def apply(): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionProperties]
  }
  
  @scala.inline
  implicit class DimensionPropertiesOps[Self <: DimensionProperties] (val x: Self) extends AnyVal {
    
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
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
    
    @scala.inline
    def setHiddenByFilter(value: Boolean): Self = this.set("hiddenByFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenByFilter: Self = this.set("hiddenByFilter", js.undefined)
    
    @scala.inline
    def setHiddenByUser(value: Boolean): Self = this.set("hiddenByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenByUser: Self = this.set("hiddenByUser", js.undefined)
    
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
  }
}
