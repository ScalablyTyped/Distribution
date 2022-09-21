package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationAttemptInfo extends StObject {
  
  /**
    * Output only. Human readable explanation for reaching the state. Provided to help address the configuration issues. Not guaranteed to be stable. For programmatic access use FailureReason enum.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Domain name of the authorization attempt.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Reason for failure of the authorization attempt for the domain.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the domain for managed certificate issuance.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizationAttemptInfo {
  
  inline def apply(): SchemaAuthorizationAttemptInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationAttemptInfo]
  }
  
  extension [Self <: SchemaAuthorizationAttemptInfo](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
