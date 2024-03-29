package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.available
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingStudy
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _started: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A list of the diagnostic requests that resulted in this imaging study being performed.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The Imaging Manager description of the study. Institution-generated description or classification of the Study (component) performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some events may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter (e.g. pre-admission test).
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in native or rendered (e.g., JPG, PNG), formats using a RESTful API; DICOM WADO-URI, which can similarly retrieve native or rendered instances, except using an HTTP query-based approach; DICOM QIDO-RS, which allows RESTful query for DICOM information without retrieving the actual instances; or IHE Invoke Image Display (IID), which provides standard invocation of an imaging web viewer.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * See discussion under [Imaging Study Implementation Notes](imagingstudy.html#notes) for encoding of DICOM Study Instance UID.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The principal physical location where the ImagingStudy was performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * A list of all the distinct values of series.modality. This may include both acquisition and non-acquisition modalities.
    */
  var modality: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
    */
  var numberOfInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
    */
  var numberOfSeries: js.UndefOr[Double] = js.undefined
  
  /**
    * To link an ImagingStudy to an Encounter use `encounter`.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This field corresponds to the DICOM Procedure Code Sequence (0008,1032). This is different from the FHIR Procedure resource that may include the ImagingStudy.
    */
  var procedure: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Description of clinical condition indicating why the ImagingStudy was requested, and/or Indicates another resource whose existence justifies this Study.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The requesting/referring physician.
    */
  var referrer: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImagingStudy: typings.fhir.fhirStrings.ImagingStudy
  
  /**
    * Each study has one or more series of images or other content.
    */
  var series: js.UndefOr[js.Array[ImagingStudySeries]] = js.undefined
  
  /**
    * Date and time the study started.
    */
  var started: js.UndefOr[String] = js.undefined
  
  /**
    * Unknown does not represent "other" - one of the defined statuses must apply.  Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: registered | available | cancelled | `entered-in-error` | unknown
  
  /**
    * QA phantoms can be recorded with a Device; multiple subjects (such as mice) can be recorded with a Group.
    */
  var subject: Reference
}
object ImagingStudy {
  
  inline def apply(status: registered | available | cancelled | `entered-in-error` | unknown, subject: Reference): ImagingStudy = {
    val __obj = js.Dynamic.literal(resourceType = "ImagingStudy", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingStudy] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setModality(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
    
    inline def setModalityVarargs(value: CodeableConcept*): Self = StObject.set(x, "modality", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setNumberOfInstances(value: Double): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    inline def setNumberOfSeries(value: Double): Self = StObject.set(x, "numberOfSeries", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSeriesUndefined: Self = StObject.set(x, "numberOfSeries", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setProcedure(value: js.Array[CodeableReference]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: CodeableReference*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setReferrer(value: Reference): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: js.Array[ImagingStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ImagingStudySeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setStatus(value: registered | available | cancelled | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
