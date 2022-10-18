package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * An error code,froma specified code system, which details why the claim could not be adjudicated.
    */
  var code: Coding
  
  /**
    * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
    */
  var detailSequenceLinkId: js.UndefOr[Double] = js.undefined
  
  /**
    * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
    */
  var sequenceLinkId: js.UndefOr[Double] = js.undefined
  
  /**
    * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
    */
  var subdetailSequenceLinkId: js.UndefOr[Double] = js.undefined
}
object ClaimResponseError {
  
  inline def apply(code: Coding): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  
  extension [Self <: ClaimResponseError](x: Self) {
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetailSequenceLinkId(value: Double): Self = StObject.set(x, "detailSequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setDetailSequenceLinkIdUndefined: Self = StObject.set(x, "detailSequenceLinkId", js.undefined)
    
    inline def setSequenceLinkId(value: Double): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSequenceLinkIdUndefined: Self = StObject.set(x, "sequenceLinkId", js.undefined)
    
    inline def setSubdetailSequenceLinkId(value: Double): Self = StObject.set(x, "subdetailSequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSubdetailSequenceLinkIdUndefined: Self = StObject.set(x, "subdetailSequenceLinkId", js.undefined)
  }
}
