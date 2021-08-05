package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains an HSM-generated attestation about a key operation. For more
  * information, see [Verifying attestations]
  * (https://cloud.google.com/kms/docs/attest-key).
  */
trait SchemaKeyOperationAttestation extends StObject {
  
  /**
    * Output only. The attestation data provided by the HSM when the key
    * operation was performed.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The format of the attestation data.
    */
  var format: js.UndefOr[String] = js.undefined
}
object SchemaKeyOperationAttestation {
  
  inline def apply(): SchemaKeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyOperationAttestation]
  }
  
  extension [Self <: SchemaKeyOperationAttestation](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
