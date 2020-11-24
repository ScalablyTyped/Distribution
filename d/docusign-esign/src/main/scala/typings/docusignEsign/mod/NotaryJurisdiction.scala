package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJurisdiction extends js.Object {
  
  var commissionExpiration: js.UndefOr[String] = js.native
  
  var commissionId: js.UndefOr[String] = js.native
  
  var county: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  var jurisdiction: js.UndefOr[Jurisdiction] = js.native
  
  var registeredName: js.UndefOr[String] = js.native
  
  var sealType: js.UndefOr[String] = js.native
}
object NotaryJurisdiction {
  
  @scala.inline
  def apply(): NotaryJurisdiction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJurisdiction]
  }
  
  @scala.inline
  implicit class NotaryJurisdictionOps[Self <: NotaryJurisdiction] (val x: Self) extends AnyVal {
    
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
    def setCommissionExpiration(value: String): Self = this.set("commissionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommissionExpiration: Self = this.set("commissionExpiration", js.undefined)
    
    @scala.inline
    def setCommissionId(value: String): Self = this.set("commissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommissionId: Self = this.set("commissionId", js.undefined)
    
    @scala.inline
    def setCounty(value: String): Self = this.set("county", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounty: Self = this.set("county", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: Jurisdiction): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setRegisteredName(value: String): Self = this.set("registeredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredName: Self = this.set("registeredName", js.undefined)
    
    @scala.inline
    def setSealType(value: String): Self = this.set("sealType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealType: Self = this.set("sealType", js.undefined)
  }
}
