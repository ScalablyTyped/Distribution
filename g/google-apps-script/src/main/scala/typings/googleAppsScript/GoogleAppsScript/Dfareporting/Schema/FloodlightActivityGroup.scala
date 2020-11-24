package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityGroup extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var tagString: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object FloodlightActivityGroup {
  
  @scala.inline
  def apply(): FloodlightActivityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityGroup]
  }
  
  @scala.inline
  implicit class FloodlightActivityGroupOps[Self <: FloodlightActivityGroup] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdDimensionValue(value: DimensionValue): Self = this.set("floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationIdDimensionValue: Self = this.set("floodlightConfigurationIdDimensionValue", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTagString(value: String): Self = this.set("tagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagString: Self = this.set("tagString", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
