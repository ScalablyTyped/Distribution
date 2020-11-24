package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataLookup extends js.Object {
  
  var locationMatchingStrategy: js.UndefOr[String] = js.native
  
  var locationType: js.UndefOr[String] = js.native
  
  var metadataId: js.UndefOr[Double] = js.native
  
  var metadataKey: js.UndefOr[String] = js.native
  
  var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.native
  
  var metadataValue: js.UndefOr[String] = js.native
  
  var visibility: js.UndefOr[String] = js.native
}
object DeveloperMetadataLookup {
  
  @scala.inline
  def apply(): DeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadataLookup]
  }
  
  @scala.inline
  implicit class DeveloperMetadataLookupOps[Self <: DeveloperMetadataLookup] (val x: Self) extends AnyVal {
    
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
    def setLocationMatchingStrategy(value: String): Self = this.set("locationMatchingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMatchingStrategy: Self = this.set("locationMatchingStrategy", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setMetadataId(value: Double): Self = this.set("metadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataId: Self = this.set("metadataId", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: String): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataKey: Self = this.set("metadataKey", js.undefined)
    
    @scala.inline
    def setMetadataLocation(value: DeveloperMetadataLocation): Self = this.set("metadataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataLocation: Self = this.set("metadataLocation", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: String): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataValue: Self = this.set("metadataValue", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
