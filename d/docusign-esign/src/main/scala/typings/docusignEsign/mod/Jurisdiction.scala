package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jurisdiction extends js.Object {
  
  var allowSystemCreatedSeal: js.UndefOr[String] = js.native
  
  var allowUserUploadedSeal: js.UndefOr[String] = js.native
  
  var commissionIdInSeal: js.UndefOr[String] = js.native
  
  var county: js.UndefOr[String] = js.native
  
  var countyInSeal: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[String] = js.native
  
  var jurisdictionId: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notaryPublicInSeal: js.UndefOr[String] = js.native
  
  var stateNameInSeal: js.UndefOr[String] = js.native
}
object Jurisdiction {
  
  @scala.inline
  def apply(): Jurisdiction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jurisdiction]
  }
  
  @scala.inline
  implicit class JurisdictionOps[Self <: Jurisdiction] (val x: Self) extends AnyVal {
    
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
    def setAllowSystemCreatedSeal(value: String): Self = this.set("allowSystemCreatedSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSystemCreatedSeal: Self = this.set("allowSystemCreatedSeal", js.undefined)
    
    @scala.inline
    def setAllowUserUploadedSeal(value: String): Self = this.set("allowUserUploadedSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUserUploadedSeal: Self = this.set("allowUserUploadedSeal", js.undefined)
    
    @scala.inline
    def setCommissionIdInSeal(value: String): Self = this.set("commissionIdInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommissionIdInSeal: Self = this.set("commissionIdInSeal", js.undefined)
    
    @scala.inline
    def setCounty(value: String): Self = this.set("county", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounty: Self = this.set("county", js.undefined)
    
    @scala.inline
    def setCountyInSeal(value: String): Self = this.set("countyInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountyInSeal: Self = this.set("countyInSeal", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setJurisdictionId(value: String): Self = this.set("jurisdictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdictionId: Self = this.set("jurisdictionId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotaryPublicInSeal(value: String): Self = this.set("notaryPublicInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotaryPublicInSeal: Self = this.set("notaryPublicInSeal", js.undefined)
    
    @scala.inline
    def setStateNameInSeal(value: String): Self = this.set("stateNameInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateNameInSeal: Self = this.set("stateNameInSeal", js.undefined)
  }
}
