package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurance or medical plan
  */
trait ClaimResponseInsurance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'focal'.
    */
  var _focal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  
  /**
    * Adjudication results
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * Insurance information
    */
  var coverage: Reference
  
  /**
    * Is the focal Coverage
    */
  var focal: Boolean
  
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Service instance identifier
    */
  var sequence: positiveInt
}
object ClaimResponseInsurance {
  
  inline def apply(coverage: Reference, focal: Boolean, sequence: positiveInt): ClaimResponseInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], focal = focal.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseInsurance]
  }
  
  extension [Self <: ClaimResponseInsurance](x: Self) {
    
    inline def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    inline def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setFocal(value: Boolean): Self = StObject.set(x, "focal", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value :_*))
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangement(value: Element): Self = StObject.set(x, "_businessArrangement", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangementUndefined: Self = StObject.set(x, "_businessArrangement", js.undefined)
    
    inline def set_focal(value: Element): Self = StObject.set(x, "_focal", value.asInstanceOf[js.Any])
    
    inline def set_focalUndefined: Self = StObject.set(x, "_focal", js.undefined)
    
    inline def set_preAuthRef(value: js.Array[Element]): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_preAuthRefVarargs(value: Element*): Self = StObject.set(x, "_preAuthRef", js.Array(value :_*))
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
