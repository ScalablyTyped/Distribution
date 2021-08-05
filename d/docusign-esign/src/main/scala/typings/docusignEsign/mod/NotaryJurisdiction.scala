package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJurisdiction extends StObject {
  
  var commissionExpiration: js.UndefOr[String] = js.undefined
  
  var commissionId: js.UndefOr[String] = js.undefined
  
  var county: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  var jurisdiction: js.UndefOr[Jurisdiction] = js.undefined
  
  var registeredName: js.UndefOr[String] = js.undefined
  
  var sealType: js.UndefOr[String] = js.undefined
}
object NotaryJurisdiction {
  
  inline def apply(): NotaryJurisdiction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJurisdiction]
  }
  
  extension [Self <: NotaryJurisdiction](x: Self) {
    
    inline def setCommissionExpiration(value: String): Self = StObject.set(x, "commissionExpiration", value.asInstanceOf[js.Any])
    
    inline def setCommissionExpirationUndefined: Self = StObject.set(x, "commissionExpiration", js.undefined)
    
    inline def setCommissionId(value: String): Self = StObject.set(x, "commissionId", value.asInstanceOf[js.Any])
    
    inline def setCommissionIdUndefined: Self = StObject.set(x, "commissionId", js.undefined)
    
    inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    inline def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setJurisdiction(value: Jurisdiction): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setRegisteredName(value: String): Self = StObject.set(x, "registeredName", value.asInstanceOf[js.Any])
    
    inline def setRegisteredNameUndefined: Self = StObject.set(x, "registeredName", js.undefined)
    
    inline def setSealType(value: String): Self = StObject.set(x, "sealType", value.asInstanceOf[js.Any])
    
    inline def setSealTypeUndefined: Self = StObject.set(x, "sealType", js.undefined)
  }
}
