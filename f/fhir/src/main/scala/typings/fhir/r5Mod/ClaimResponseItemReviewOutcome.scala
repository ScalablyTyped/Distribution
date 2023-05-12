package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemReviewOutcome
  extends StObject
     with BackboneElement {
  
  var _preAuthRef: js.UndefOr[Element] = js.undefined
  
  /**
    * The element is used to indicate the current state of the adjudication overall for the claim resource, for example: the request has been held (pended) for adjudication processing, for manual review or other reasons; that it has been processed and will be paid, or the outstanding paid, as submitted (approved); that no amount will be paid (denied); or that some amount between zero and the submitted amount will be paid (partial).
    */
  var decision: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time frame during which this authorization is effective.
    */
  var preAuthPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This value is only present on preauthorization adjudications.
    */
  var preAuthRef: js.UndefOr[String] = js.undefined
  
  /**
    * The reasons for the result of the claim, predetermination, or preauthorization adjudication.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ClaimResponseItemReviewOutcome {
  
  inline def apply(): ClaimResponseItemReviewOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseItemReviewOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseItemReviewOutcome] (val x: Self) extends AnyVal {
    
    inline def setDecision(value: CodeableConcept): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setPreAuthPeriod(value: Period): Self = StObject.set(x, "preAuthPeriod", value.asInstanceOf[js.Any])
    
    inline def setPreAuthPeriodUndefined: Self = StObject.set(x, "preAuthPeriod", js.undefined)
    
    inline def setPreAuthRef(value: String): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def set_preAuthRef(value: Element): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
  }
}
