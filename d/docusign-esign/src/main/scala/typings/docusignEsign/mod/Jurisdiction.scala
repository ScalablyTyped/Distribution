package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jurisdiction extends StObject {
  
  var allowSystemCreatedSeal: js.UndefOr[String] = js.undefined
  
  var allowUserUploadedSeal: js.UndefOr[String] = js.undefined
  
  var commissionIdInSeal: js.UndefOr[String] = js.undefined
  
  var county: js.UndefOr[String] = js.undefined
  
  var countyInSeal: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[String] = js.undefined
  
  var jurisdictionId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notaryPublicInSeal: js.UndefOr[String] = js.undefined
  
  var stateNameInSeal: js.UndefOr[String] = js.undefined
}
object Jurisdiction {
  
  @scala.inline
  def apply(): Jurisdiction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jurisdiction]
  }
  
  @scala.inline
  implicit class JurisdictionMutableBuilder[Self <: Jurisdiction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSystemCreatedSeal(value: String): Self = StObject.set(x, "allowSystemCreatedSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSystemCreatedSealUndefined: Self = StObject.set(x, "allowSystemCreatedSeal", js.undefined)
    
    @scala.inline
    def setAllowUserUploadedSeal(value: String): Self = StObject.set(x, "allowUserUploadedSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUserUploadedSealUndefined: Self = StObject.set(x, "allowUserUploadedSeal", js.undefined)
    
    @scala.inline
    def setCommissionIdInSeal(value: String): Self = StObject.set(x, "commissionIdInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommissionIdInSealUndefined: Self = StObject.set(x, "commissionIdInSeal", js.undefined)
    
    @scala.inline
    def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyInSeal(value: String): Self = StObject.set(x, "countyInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyInSealUndefined: Self = StObject.set(x, "countyInSeal", js.undefined)
    
    @scala.inline
    def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setJurisdictionId(value: String): Self = StObject.set(x, "jurisdictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionIdUndefined: Self = StObject.set(x, "jurisdictionId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotaryPublicInSeal(value: String): Self = StObject.set(x, "notaryPublicInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotaryPublicInSealUndefined: Self = StObject.set(x, "notaryPublicInSeal", js.undefined)
    
    @scala.inline
    def setStateNameInSeal(value: String): Self = StObject.set(x, "stateNameInSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNameInSealUndefined: Self = StObject.set(x, "stateNameInSeal", js.undefined)
  }
}
