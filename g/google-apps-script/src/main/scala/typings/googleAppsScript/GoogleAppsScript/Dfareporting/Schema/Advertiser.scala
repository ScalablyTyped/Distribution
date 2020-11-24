package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertiser extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserGroupId: js.UndefOr[String] = js.native
  
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  
  var defaultEmail: js.UndefOr[String] = js.native
  
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var suspended: js.UndefOr[Boolean] = js.native
}
object Advertiser {
  
  @scala.inline
  def apply(): Advertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advertiser]
  }
  
  @scala.inline
  implicit class AdvertiserOps[Self <: Advertiser] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserGroupId(value: String): Self = this.set("advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserGroupId: Self = this.set("advertiserGroupId", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffix(value: String): Self = this.set("clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffix: Self = this.set("clickThroughUrlSuffix", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagId(value: String): Self = this.set("defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagId: Self = this.set("defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setDefaultEmail(value: String): Self = this.set("defaultEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEmail: Self = this.set("defaultEmail", js.undefined)
    
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
    def setOriginalFloodlightConfigurationId(value: String): Self = this.set("originalFloodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFloodlightConfigurationId: Self = this.set("originalFloodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
  }
}
