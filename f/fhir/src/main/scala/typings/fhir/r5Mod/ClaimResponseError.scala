package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * An error code, from a specified code system, which details why the claim could not be adjudicated.
    */
  var code: CodeableConcept
  
  /**
    * The sequence number of the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var detailSequence: js.UndefOr[Double] = js.undefined
  
  /**
    * The sequence number of the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var itemSequence: js.UndefOr[Double] = js.undefined
  
  /**
    * The sequence number of the sub-detail within the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var subDetailSequence: js.UndefOr[Double] = js.undefined
}
object ClaimResponseError {
  
  inline def apply(code: CodeableConcept): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  
  extension [Self <: ClaimResponseError](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetailSequence(value: Double): Self = StObject.set(x, "detailSequence", value.asInstanceOf[js.Any])
    
    inline def setDetailSequenceUndefined: Self = StObject.set(x, "detailSequence", js.undefined)
    
    inline def setItemSequence(value: Double): Self = StObject.set(x, "itemSequence", value.asInstanceOf[js.Any])
    
    inline def setItemSequenceUndefined: Self = StObject.set(x, "itemSequence", js.undefined)
    
    inline def setSubDetailSequence(value: Double): Self = StObject.set(x, "subDetailSequence", value.asInstanceOf[js.Any])
    
    inline def setSubDetailSequenceUndefined: Self = StObject.set(x, "subDetailSequence", js.undefined)
  }
}
