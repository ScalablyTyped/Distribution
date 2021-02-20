package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context passed to create a SMART client directly without completing the SMART on FHIR OAuth2 authorization workflow
  */
@js.native
trait Context extends StObject {
  
  /**
    * Authorization context
    */
  var auth: js.UndefOr[AuthContext] = js.native
  
  /**
    * Patient in context
    */
  var patientId: js.UndefOr[String] = js.native
  
  /**
    * FHIR service base url
    */
  var serviceUrl: String = js.native
  
  /**
    * User in context
    */
  var userId: js.UndefOr[String] = js.native
}
object Context {
  
  @scala.inline
  def apply(serviceUrl: String): Context = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: AuthContext): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPatientId(value: String): Self = StObject.set(x, "patientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientIdUndefined: Self = StObject.set(x, "patientId", js.undefined)
    
    @scala.inline
    def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
