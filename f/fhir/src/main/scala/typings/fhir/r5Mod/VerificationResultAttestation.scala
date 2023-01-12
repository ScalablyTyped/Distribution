package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResultAttestation
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _proxyIdentityCertificate: js.UndefOr[Element] = js.undefined
  
  var _sourceIdentityCertificate: js.UndefOr[Element] = js.undefined
  
  /**
    * The method by which attested information was submitted/retrieved (manual; API; Push).
    */
  var communicationMethod: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date the information was attested to.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * When the who is asserting on behalf of another (organization or individual).
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * A digital identity certificate associated with the proxy entity submitting attested information on behalf of the attestation source.
    */
  var proxyIdentityCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Signed assertion by the proxy entity indicating that they have the right to submit attested information on behalf of the attestation source.
    */
  var proxySignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * A digital identity certificate associated with the attestation source.
    */
  var sourceIdentityCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Signed assertion by the attestation source that they have attested to the information.
    */
  var sourceSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * The individual or organization attesting to information.
    */
  var who: js.UndefOr[Reference] = js.undefined
}
object VerificationResultAttestation {
  
  inline def apply(): VerificationResultAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationResultAttestation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationResultAttestation] (val x: Self) extends AnyVal {
    
    inline def setCommunicationMethod(value: CodeableConcept): Self = StObject.set(x, "communicationMethod", value.asInstanceOf[js.Any])
    
    inline def setCommunicationMethodUndefined: Self = StObject.set(x, "communicationMethod", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setProxyIdentityCertificate(value: String): Self = StObject.set(x, "proxyIdentityCertificate", value.asInstanceOf[js.Any])
    
    inline def setProxyIdentityCertificateUndefined: Self = StObject.set(x, "proxyIdentityCertificate", js.undefined)
    
    inline def setProxySignature(value: Signature): Self = StObject.set(x, "proxySignature", value.asInstanceOf[js.Any])
    
    inline def setProxySignatureUndefined: Self = StObject.set(x, "proxySignature", js.undefined)
    
    inline def setSourceIdentityCertificate(value: String): Self = StObject.set(x, "sourceIdentityCertificate", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityCertificateUndefined: Self = StObject.set(x, "sourceIdentityCertificate", js.undefined)
    
    inline def setSourceSignature(value: Signature): Self = StObject.set(x, "sourceSignature", value.asInstanceOf[js.Any])
    
    inline def setSourceSignatureUndefined: Self = StObject.set(x, "sourceSignature", js.undefined)
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def setWhoUndefined: Self = StObject.set(x, "who", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_proxyIdentityCertificate(value: Element): Self = StObject.set(x, "_proxyIdentityCertificate", value.asInstanceOf[js.Any])
    
    inline def set_proxyIdentityCertificateUndefined: Self = StObject.set(x, "_proxyIdentityCertificate", js.undefined)
    
    inline def set_sourceIdentityCertificate(value: Element): Self = StObject.set(x, "_sourceIdentityCertificate", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdentityCertificateUndefined: Self = StObject.set(x, "_sourceIdentityCertificate", js.undefined)
  }
}
