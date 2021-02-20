package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about security of implementation
  */
@js.native
trait CapabilityStatementRestSecurity extends BackboneElement {
  
  /**
    * Contains extended information for property 'cors'.
    */
  var _cors: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Certificates associated with security profiles
    */
  var certificate: js.UndefOr[js.Array[CapabilityStatementRestSecurityCertificate]] = js.native
  
  /**
    * Adds CORS Headers (http://enable-cors.org/)
    */
  var cors: js.UndefOr[Boolean] = js.native
  
  /**
    * General description of how security works
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object CapabilityStatementRestSecurity {
  
  @scala.inline
  def apply(): CapabilityStatementRestSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurity]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestSecurityMutableBuilder[Self <: CapabilityStatementRestSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: js.Array[CapabilityStatementRestSecurityCertificate]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setCertificateVarargs(value: CapabilityStatementRestSecurityCertificate*): Self = StObject.set(x, "certificate", js.Array(value :_*))
    
    @scala.inline
    def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setService(value: js.Array[CodeableConcept]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: CodeableConcept*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    @scala.inline
    def set_cors(value: Element): Self = StObject.set(x, "_cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_corsUndefined: Self = StObject.set(x, "_cors", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
