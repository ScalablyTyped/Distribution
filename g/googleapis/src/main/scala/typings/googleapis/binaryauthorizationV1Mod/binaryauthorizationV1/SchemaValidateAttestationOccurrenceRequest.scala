package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateAttestationOccurrenceRequest extends StObject {
  
  /**
    * Required. An AttestationOccurrence to be checked that it can be verified by the Attestor. It does not have to be an existing entity in Container Analysis. It must otherwise be a valid AttestationOccurrence.
    */
  var attestation: js.UndefOr[SchemaAttestationOccurrence] = js.undefined
  
  /**
    * Required. The resource name of the Note to which the containing Occurrence is associated.
    */
  var occurrenceNote: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The URI of the artifact (e.g. container image) that is the subject of the containing Occurrence.
    */
  var occurrenceResourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaValidateAttestationOccurrenceRequest {
  
  inline def apply(): SchemaValidateAttestationOccurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateAttestationOccurrenceRequest]
  }
  
  extension [Self <: SchemaValidateAttestationOccurrenceRequest](x: Self) {
    
    inline def setAttestation(value: SchemaAttestationOccurrence): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setOccurrenceNote(value: String): Self = StObject.set(x, "occurrenceNote", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceNoteNull: Self = StObject.set(x, "occurrenceNote", null)
    
    inline def setOccurrenceNoteUndefined: Self = StObject.set(x, "occurrenceNote", js.undefined)
    
    inline def setOccurrenceResourceUri(value: String): Self = StObject.set(x, "occurrenceResourceUri", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceResourceUriNull: Self = StObject.set(x, "occurrenceResourceUri", null)
    
    inline def setOccurrenceResourceUriUndefined: Self = StObject.set(x, "occurrenceResourceUri", js.undefined)
  }
}
