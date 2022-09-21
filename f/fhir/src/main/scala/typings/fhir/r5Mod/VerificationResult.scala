package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`in-process`
import typings.fhir.fhirStrings.`req-revalid`
import typings.fhir.fhirStrings.`reval-fail`
import typings.fhir.fhirStrings.`val-fail`
import typings.fhir.fhirStrings.attested
import typings.fhir.fhirStrings.validated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResult
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _lastPerformed: js.UndefOr[Element] = js.undefined
  
  var _nextScheduled: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  var _targetLocation: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Information about the entity attesting to information.
    */
  var attestation: js.UndefOr[VerificationResultAttestation] = js.undefined
  
  /**
    * The result if validation fails (fatal; warning; record only; none).
    */
  var failureAction: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Frequency of revalidation.
    */
  var frequency: js.UndefOr[Timing] = js.undefined
  
  /**
    * The date/time validation was last completed (including failed validations).
    */
  var lastPerformed: js.UndefOr[String] = js.undefined
  
  /**
    * The frequency with which the target must be validated (none; initial; periodic).
    */
  var need: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date when target is next validated, if appropriate.
    */
  var nextScheduled: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the primary source(s) involved in validation.
    */
  var primarySource: js.UndefOr[js.Array[VerificationResultPrimarySource]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_VerificationResult: typings.fhir.fhirStrings.VerificationResult
  
  /**
    * The validation status of the target (attested; validated; in process; requires revalidation; validation failed; revalidation failed).
    */
  var status: attested | validated | `in-process` | `req-revalid` | `val-fail` | `reval-fail`
  
  /**
    * When the validation status was updated.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * A resource that was validated.
    */
  var target: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The fhirpath location(s) within the resource that was validated.
    */
  var targetLocation: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).
    */
  var validationProcess: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * What the target is validated against (nothing; primary source; multiple sources).
    */
  var validationType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Information about the entity validating information.
    */
  var validator: js.UndefOr[js.Array[VerificationResultValidator]] = js.undefined
}
object VerificationResult {
  
  inline def apply(status: attested | validated | `in-process` | `req-revalid` | `val-fail` | `reval-fail`): VerificationResult = {
    val __obj = js.Dynamic.literal(resourceType = "VerificationResult", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationResult]
  }
  
  extension [Self <: VerificationResult](x: Self) {
    
    inline def setAttestation(value: VerificationResultAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setFailureAction(value: CodeableConcept): Self = StObject.set(x, "failureAction", value.asInstanceOf[js.Any])
    
    inline def setFailureActionUndefined: Self = StObject.set(x, "failureAction", js.undefined)
    
    inline def setFrequency(value: Timing): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setLastPerformed(value: String): Self = StObject.set(x, "lastPerformed", value.asInstanceOf[js.Any])
    
    inline def setLastPerformedUndefined: Self = StObject.set(x, "lastPerformed", js.undefined)
    
    inline def setNeed(value: CodeableConcept): Self = StObject.set(x, "need", value.asInstanceOf[js.Any])
    
    inline def setNeedUndefined: Self = StObject.set(x, "need", js.undefined)
    
    inline def setNextScheduled(value: String): Self = StObject.set(x, "nextScheduled", value.asInstanceOf[js.Any])
    
    inline def setNextScheduledUndefined: Self = StObject.set(x, "nextScheduled", js.undefined)
    
    inline def setPrimarySource(value: js.Array[VerificationResultPrimarySource]): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    inline def setPrimarySourceUndefined: Self = StObject.set(x, "primarySource", js.undefined)
    
    inline def setPrimarySourceVarargs(value: VerificationResultPrimarySource*): Self = StObject.set(x, "primarySource", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.VerificationResult): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: attested | validated | `in-process` | `req-revalid` | `val-fail` | `reval-fail`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setTarget(value: js.Array[Reference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetLocation(value: js.Array[String]): Self = StObject.set(x, "targetLocation", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationUndefined: Self = StObject.set(x, "targetLocation", js.undefined)
    
    inline def setTargetLocationVarargs(value: String*): Self = StObject.set(x, "targetLocation", js.Array(value*))
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: Reference*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setValidationProcess(value: js.Array[CodeableConcept]): Self = StObject.set(x, "validationProcess", value.asInstanceOf[js.Any])
    
    inline def setValidationProcessUndefined: Self = StObject.set(x, "validationProcess", js.undefined)
    
    inline def setValidationProcessVarargs(value: CodeableConcept*): Self = StObject.set(x, "validationProcess", js.Array(value*))
    
    inline def setValidationType(value: CodeableConcept): Self = StObject.set(x, "validationType", value.asInstanceOf[js.Any])
    
    inline def setValidationTypeUndefined: Self = StObject.set(x, "validationType", js.undefined)
    
    inline def setValidator(value: js.Array[VerificationResultValidator]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setValidatorVarargs(value: VerificationResultValidator*): Self = StObject.set(x, "validator", js.Array(value*))
    
    inline def set_lastPerformed(value: Element): Self = StObject.set(x, "_lastPerformed", value.asInstanceOf[js.Any])
    
    inline def set_lastPerformedUndefined: Self = StObject.set(x, "_lastPerformed", js.undefined)
    
    inline def set_nextScheduled(value: Element): Self = StObject.set(x, "_nextScheduled", value.asInstanceOf[js.Any])
    
    inline def set_nextScheduledUndefined: Self = StObject.set(x, "_nextScheduled", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_targetLocation(value: js.Array[Element]): Self = StObject.set(x, "_targetLocation", value.asInstanceOf[js.Any])
    
    inline def set_targetLocationUndefined: Self = StObject.set(x, "_targetLocation", js.undefined)
    
    inline def set_targetLocationVarargs(value: Element*): Self = StObject.set(x, "_targetLocation", js.Array(value*))
  }
}
