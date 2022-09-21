package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimCoverage
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
    * Used by downstream payers to determine what balance remains and the net payable.
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * Need to identify the issuer to target for processing and for coordination of benefit processing.
    */
  var coverage: Reference
  
  /**
    * To identify which coverage is being adjudicated.
    */
  var focal: Boolean
  
  /**
    * Knowledge of the original version can inform the processing of this instance so that information which is processable by the originating system may be generated.
    */
  var originalRuleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * To provide any pre=determination or prior authorization reference.
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * To determine the relationship between the patient and the subscriber.
    */
  var relationship: Coding
  
  /**
    * To maintain order of the coverages.
    */
  var sequence: Double
}
object ClaimCoverage {
  
  inline def apply(coverage: Reference, focal: Boolean, relationship: Coding, sequence: Double): ClaimCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], focal = focal.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimCoverage]
  }
  
  extension [Self <: ClaimCoverage](x: Self) {
    
    inline def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    inline def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setFocal(value: Boolean): Self = StObject.set(x, "focal", value.asInstanceOf[js.Any])
    
    inline def setOriginalRuleset(value: Coding): Self = StObject.set(x, "originalRuleset", value.asInstanceOf[js.Any])
    
    inline def setOriginalRulesetUndefined: Self = StObject.set(x, "originalRuleset", js.undefined)
    
    inline def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value*))
    
    inline def setRelationship(value: Coding): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
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
