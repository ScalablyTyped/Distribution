package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.available
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudy
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[Element] = js.undefined
  
  var _instantiatesUri: js.UndefOr[Element] = js.undefined
  
  var _startDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The details about a specific analysis that was performed in this GenomicStudy.
    */
  var analysis: js.UndefOr[js.Array[GenomicStudyAnalysis]] = js.undefined
  
  /**
    * Event resources that the genomic study is based on.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Description of the genomic study.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The healthcare event with which this genomics study is associated.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers for this genomic study.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The defined protocol that describes the study.
    */
  var instantiatesCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The URL pointing to an externally maintained protocol that describes the study.
    */
  var instantiatesUri: js.UndefOr[String] = js.undefined
  
  /**
    * Healthcare professionals who interpreted the genomic study.
    */
  var interpreter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Comments related to the genomic study.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Why the genomic study was performed.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Healthcare professional who requested or referred the genomic study.
    */
  var referrer: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_GenomicStudy: typings.fhir.fhirStrings.GenomicStudy
  
  /**
    * When the genomic study was started.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the genomic study.
    */
  var status: registered | available | cancelled | `entered-in-error` | unknown
  
  /**
    * The primary subject of the genomic study.
    */
  var subject: Reference
  
  /**
    * The type of the study, e.g., Familial variant segregation, Functional variation detection, or Gene expression profiling.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object GenomicStudy {
  
  inline def apply(status: registered | available | cancelled | `entered-in-error` | unknown, subject: Reference): GenomicStudy = {
    val __obj = js.Dynamic.literal(resourceType = "GenomicStudy", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenomicStudy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudy] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: js.Array[GenomicStudyAnalysis]): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
    
    inline def setAnalysisVarargs(value: GenomicStudyAnalysis*): Self = StObject.set(x, "analysis", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: String): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesUri(value: String): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInterpreter(value: js.Array[Reference]): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setInterpreterVarargs(value: Reference*): Self = StObject.set(x, "interpreter", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setReferrer(value: Reference): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.GenomicStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStatus(value: registered | available | cancelled | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_instantiatesCanonical(value: Element): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesUri(value: Element): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    inline def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
