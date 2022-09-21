package typings.fhir.r3Mod

import typings.fhir.fhirStrings.NEARLINE
import typings.fhir.fhirStrings.OFFLINE
import typings.fhir.fhirStrings.ONLINE
import typings.fhir.fhirStrings.UNAVAILABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingStudy
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _availability: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _started: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
    */
  var accession: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Availability of study (online, offline, or nearline).
    */
  var availability: js.UndefOr[ONLINE | OFFLINE | NEARLINE | UNAVAILABLE] = js.undefined
  
  /**
    * A list of the diagnostic requests that resulted in this imaging study being performed.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The encounter or episode at which the request is initiated.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Institution-generated description or classification of the Study performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in native or rendered (e.g., JPG, PNG), formats using a RESTful API; DICOM WADO-URI, which can similarly retrieve native or rendered instances, except using an HTTP query-based approach; DICOM QIDO-RS, which allows RESTful query for DICOM information without retrieving the actual instances; or IHE Invoke Image Display (IID), which provides standard invocation of an imaging web viewer.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Other identifiers for the study.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who read the study and interpreted the images or other content.
    */
  var interpreter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
    */
  var modalityList: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
    */
  var numberOfInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
    */
  var numberOfSeries: js.UndefOr[Double] = js.undefined
  
  /**
    * The patient imaged in the study.
    */
  var patient: Reference
  
  /**
    * The code for the performed procedure type.
    */
  var procedureCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A reference to the performed Procedure.
    */
  var procedureReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Description of clinical condition indicating why the ImagingStudy was requested.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
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
    * Formal identifier for the study.
    */
  var uid: String
}
object ImagingStudy {
  
  inline def apply(patient: Reference, uid: String): ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ImagingStudy", uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  
  extension [Self <: ImagingStudy](x: Self) {
    
    inline def setAccession(value: Identifier): Self = StObject.set(x, "accession", value.asInstanceOf[js.Any])
    
    inline def setAccessionUndefined: Self = StObject.set(x, "accession", js.undefined)
    
    inline def setAvailability(value: ONLINE | OFFLINE | NEARLINE | UNAVAILABLE): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInterpreter(value: js.Array[Reference]): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setInterpreterVarargs(value: Reference*): Self = StObject.set(x, "interpreter", js.Array(value*))
    
    inline def setModalityList(value: js.Array[Coding]): Self = StObject.set(x, "modalityList", value.asInstanceOf[js.Any])
    
    inline def setModalityListUndefined: Self = StObject.set(x, "modalityList", js.undefined)
    
    inline def setModalityListVarargs(value: Coding*): Self = StObject.set(x, "modalityList", js.Array(value*))
    
    inline def setNumberOfInstances(value: Double): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    inline def setNumberOfSeries(value: Double): Self = StObject.set(x, "numberOfSeries", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSeriesUndefined: Self = StObject.set(x, "numberOfSeries", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setProcedureCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "procedureCode", value.asInstanceOf[js.Any])
    
    inline def setProcedureCodeUndefined: Self = StObject.set(x, "procedureCode", js.undefined)
    
    inline def setProcedureCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "procedureCode", js.Array(value*))
    
    inline def setProcedureReference(value: js.Array[Reference]): Self = StObject.set(x, "procedureReference", value.asInstanceOf[js.Any])
    
    inline def setProcedureReferenceUndefined: Self = StObject.set(x, "procedureReference", js.undefined)
    
    inline def setProcedureReferenceVarargs(value: Reference*): Self = StObject.set(x, "procedureReference", js.Array(value*))
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReferrer(value: Reference): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: js.Array[ImagingStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ImagingStudySeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    inline def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
