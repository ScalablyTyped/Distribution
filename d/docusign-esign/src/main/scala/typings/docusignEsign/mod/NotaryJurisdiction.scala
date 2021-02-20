package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJurisdiction extends StObject {
  
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
  implicit class NotaryJurisdictionMutableBuilder[Self <: NotaryJurisdiction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommissionExpiration(value: String): Self = StObject.set(x, "commissionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommissionExpirationUndefined: Self = StObject.set(x, "commissionExpiration", js.undefined)
    
    @scala.inline
    def setCommissionId(value: String): Self = StObject.set(x, "commissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommissionIdUndefined: Self = StObject.set(x, "commissionId", js.undefined)
    
    @scala.inline
    def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: Jurisdiction): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setRegisteredName(value: String): Self = StObject.set(x, "registeredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredNameUndefined: Self = StObject.set(x, "registeredName", js.undefined)
    
    @scala.inline
    def setSealType(value: String): Self = StObject.set(x, "sealType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealTypeUndefined: Self = StObject.set(x, "sealType", js.undefined)
  }
}
