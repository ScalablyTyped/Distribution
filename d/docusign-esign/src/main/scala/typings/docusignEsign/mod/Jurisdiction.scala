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
  
  inline def apply(): Jurisdiction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jurisdiction]
  }
  
  extension [Self <: Jurisdiction](x: Self) {
    
    inline def setAllowSystemCreatedSeal(value: String): Self = StObject.set(x, "allowSystemCreatedSeal", value.asInstanceOf[js.Any])
    
    inline def setAllowSystemCreatedSealUndefined: Self = StObject.set(x, "allowSystemCreatedSeal", js.undefined)
    
    inline def setAllowUserUploadedSeal(value: String): Self = StObject.set(x, "allowUserUploadedSeal", value.asInstanceOf[js.Any])
    
    inline def setAllowUserUploadedSealUndefined: Self = StObject.set(x, "allowUserUploadedSeal", js.undefined)
    
    inline def setCommissionIdInSeal(value: String): Self = StObject.set(x, "commissionIdInSeal", value.asInstanceOf[js.Any])
    
    inline def setCommissionIdInSealUndefined: Self = StObject.set(x, "commissionIdInSeal", js.undefined)
    
    inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    inline def setCountyInSeal(value: String): Self = StObject.set(x, "countyInSeal", value.asInstanceOf[js.Any])
    
    inline def setCountyInSealUndefined: Self = StObject.set(x, "countyInSeal", js.undefined)
    
    inline def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setJurisdictionId(value: String): Self = StObject.set(x, "jurisdictionId", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionIdUndefined: Self = StObject.set(x, "jurisdictionId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotaryPublicInSeal(value: String): Self = StObject.set(x, "notaryPublicInSeal", value.asInstanceOf[js.Any])
    
    inline def setNotaryPublicInSealUndefined: Self = StObject.set(x, "notaryPublicInSeal", js.undefined)
    
    inline def setStateNameInSeal(value: String): Self = StObject.set(x, "stateNameInSeal", value.asInstanceOf[js.Any])
    
    inline def setStateNameInSealUndefined: Self = StObject.set(x, "stateNameInSeal", js.undefined)
  }
}
