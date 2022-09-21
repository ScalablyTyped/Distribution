package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyOperationAttestation extends StObject {
  
  /**
    * Output only. The certificate chains needed to validate the attestation
    */
  var certChains: js.UndefOr[SchemaCertificateChains] = js.undefined
  
  /**
    * Output only. The attestation data provided by the HSM when the key operation was performed.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The format of the attestation data.
    */
  var format: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyOperationAttestation {
  
  inline def apply(): SchemaKeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyOperationAttestation]
  }
  
  extension [Self <: SchemaKeyOperationAttestation](x: Self) {
    
    inline def setCertChains(value: SchemaCertificateChains): Self = StObject.set(x, "certChains", value.asInstanceOf[js.Any])
    
    inline def setCertChainsUndefined: Self = StObject.set(x, "certChains", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
