package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimInsurance
  extends StObject
     with BackboneElement {
  
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  
  var _focal: js.UndefOr[Element] = js.undefined
  
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * The contract number of a business agreement which describes the terms and conditions.
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  
  /**
    * The Coverages adjudication details.
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reference to the program or plan identification, underwriter or payor.
    */
  var coverage: Reference
  
  /**
    * A flag to indicate that this Coverage is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
    */
  var focal: Boolean
  
  /**
    * A list of references from the Insurer to which these services pertain.
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sequence of coverage which serves to provide a link and convey coordination of benefit order.
    */
  var sequence: Double
}
object ClaimInsurance {
  
  inline def apply(coverage: Reference, focal: Boolean, sequence: Double): ClaimInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], focal = focal.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimInsurance]
  }
  
  extension [Self <: ClaimInsurance](x: Self) {
    
    inline def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    inline def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setFocal(value: Boolean): Self = StObject.set(x, "focal", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangement(value: Element): Self = StObject.set(x, "_businessArrangement", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangementUndefined: Self = StObject.set(x, "_businessArrangement", js.undefined)
    
    inline def set_focal(value: Element): Self = StObject.set(x, "_focal", value.asInstanceOf[js.Any])
    
    inline def set_focalUndefined: Self = StObject.set(x, "_focal", js.undefined)
    
    inline def set_preAuthRef(value: js.Array[Element]): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_preAuthRefVarargs(value: Element*): Self = StObject.set(x, "_preAuthRef", js.Array(value*))
  }
}
