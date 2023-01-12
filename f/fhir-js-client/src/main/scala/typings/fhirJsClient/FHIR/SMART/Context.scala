package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context passed to create a SMART client directly without completing the SMART on FHIR OAuth2 authorization workflow
  */
trait Context extends StObject {
  
  /**
    * Authorization context
    */
  var auth: js.UndefOr[AuthContext] = js.undefined
  
  /**
    * Patient in context
    */
  var patientId: js.UndefOr[String] = js.undefined
  
  /**
    * FHIR service base url
    */
  var serviceUrl: String
  
  /**
    * User in context
    */
  var userId: js.UndefOr[String] = js.undefined
}
object Context {
  
  inline def apply(serviceUrl: String): Context = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: AuthContext): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPatientId(value: String): Self = StObject.set(x, "patientId", value.asInstanceOf[js.Any])
    
    inline def setPatientIdUndefined: Self = StObject.set(x, "patientId", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
