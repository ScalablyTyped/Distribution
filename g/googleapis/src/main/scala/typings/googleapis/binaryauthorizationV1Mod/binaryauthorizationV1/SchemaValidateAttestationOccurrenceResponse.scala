package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateAttestationOccurrenceResponse extends StObject {
  
  /**
    * The reason for denial if the Attestation couldn't be validated.
    */
  var denialReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of the Attestation validation.
    */
  var result: js.UndefOr[String | Null] = js.undefined
}
object SchemaValidateAttestationOccurrenceResponse {
  
  inline def apply(): SchemaValidateAttestationOccurrenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateAttestationOccurrenceResponse]
  }
  
  extension [Self <: SchemaValidateAttestationOccurrenceResponse](x: Self) {
    
    inline def setDenialReason(value: String): Self = StObject.set(x, "denialReason", value.asInstanceOf[js.Any])
    
    inline def setDenialReasonNull: Self = StObject.set(x, "denialReason", null)
    
    inline def setDenialReasonUndefined: Self = StObject.set(x, "denialReason", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
