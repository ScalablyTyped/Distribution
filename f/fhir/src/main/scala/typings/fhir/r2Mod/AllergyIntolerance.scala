package typings.fhir.r2Mod

import typings.fhir.fhirStrings.CRITH
import typings.fhir.fhirStrings.CRITL
import typings.fhir.fhirStrings.CRITU
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.allergy
import typings.fhir.fhirStrings.confirmed
import typings.fhir.fhirStrings.environment
import typings.fhir.fhirStrings.food
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.intolerance
import typings.fhir.fhirStrings.medication_
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.refuted
import typings.fhir.fhirStrings.resolved
import typings.fhir.fhirStrings.unconfirmed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllergyIntolerance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _criticality: js.UndefOr[Element] = js.undefined
  
  var _lastOccurence: js.UndefOr[Element] = js.undefined
  
  var _onset: js.UndefOr[Element] = js.undefined
  
  var _recordedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Category of the identified Substance.
    */
  var category: js.UndefOr[food | medication_ | environment | other] = js.undefined
  
  /**
    * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
    */
  var criticality: js.UndefOr[CRITL | CRITH | CRITU] = js.undefined
  
  /**
    * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Represents the date and/or time of the last known occurrence of a reaction event.
    */
  var lastOccurence: js.UndefOr[String] = js.undefined
  
  /**
    * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Record of the date and/or time of the onset of the Allergy or Intolerance.
    */
  var onset: js.UndefOr[String] = js.undefined
  
  /**
    * The patient who has the allergy or intolerance.
    */
  var patient: Reference
  
  /**
    * Details about each adverse reaction event linked to exposure to the identified Substance.
    */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.undefined
  
  /**
    * Date when the sensitivity was recorded.
    */
  var recordedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Individual who recorded the record and takes responsibility for its conten.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /**
    * The source of the information about the allergy that is recorded.
    */
  var reporter: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AllergyIntolerance: typings.fhir.fhirStrings.AllergyIntolerance
  
  /**
    * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
    */
  var status: js.UndefOr[
    active | unconfirmed | confirmed | inactive | resolved | refuted | `entered-in-error`
  ] = js.undefined
  
  /**
    * Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.
    */
  var substance: CodeableConcept
  
  /**
    * Identification of the underlying physiological mechanism for the reaction risk.
    */
  var `type`: js.UndefOr[allergy | intolerance] = js.undefined
}
object AllergyIntolerance {
  
  inline def apply(patient: Reference, substance: CodeableConcept): AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "AllergyIntolerance", substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntolerance]
  }
  
  extension [Self <: AllergyIntolerance](x: Self) {
    
    inline def setCategory(value: food | medication_ | environment | other): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCriticality(value: CRITL | CRITH | CRITU): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLastOccurence(value: String): Self = StObject.set(x, "lastOccurence", value.asInstanceOf[js.Any])
    
    inline def setLastOccurenceUndefined: Self = StObject.set(x, "lastOccurence", js.undefined)
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOnset(value: String): Self = StObject.set(x, "onset", value.asInstanceOf[js.Any])
    
    inline def setOnsetUndefined: Self = StObject.set(x, "onset", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReaction(value: js.Array[AllergyIntoleranceReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: AllergyIntoleranceReaction*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setRecordedDate(value: String): Self = StObject.set(x, "recordedDate", value.asInstanceOf[js.Any])
    
    inline def setRecordedDateUndefined: Self = StObject.set(x, "recordedDate", js.undefined)
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setReporter(value: Reference): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AllergyIntolerance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | unconfirmed | confirmed | inactive | resolved | refuted | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setType(value: allergy | intolerance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_criticality(value: Element): Self = StObject.set(x, "_criticality", value.asInstanceOf[js.Any])
    
    inline def set_criticalityUndefined: Self = StObject.set(x, "_criticality", js.undefined)
    
    inline def set_lastOccurence(value: Element): Self = StObject.set(x, "_lastOccurence", value.asInstanceOf[js.Any])
    
    inline def set_lastOccurenceUndefined: Self = StObject.set(x, "_lastOccurence", js.undefined)
    
    inline def set_onset(value: Element): Self = StObject.set(x, "_onset", value.asInstanceOf[js.Any])
    
    inline def set_onsetUndefined: Self = StObject.set(x, "_onset", js.undefined)
    
    inline def set_recordedDate(value: Element): Self = StObject.set(x, "_recordedDate", value.asInstanceOf[js.Any])
    
    inline def set_recordedDateUndefined: Self = StObject.set(x, "_recordedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
