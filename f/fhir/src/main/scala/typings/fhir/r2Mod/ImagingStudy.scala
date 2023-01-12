package typings.fhir.r2Mod

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
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
    */
  var accession: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Availability of study (online, offline or nearline).
    */
  var availability: js.UndefOr[ONLINE | OFFLINE | NEARLINE | UNAVAILABLE] = js.undefined
  
  /**
    * Institution-generated description or classification of the Study performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Other identifiers for the study.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who read the study and interpreted the images or other content.
    */
  var interpreter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
    */
  var modalityList: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Number of SOP Instances in Study.
    */
  var numberOfInstances: Double
  
  /**
    * Number of Series in Study.
    */
  var numberOfSeries: Double
  
  /**
    * To support grouped procedures (one imaging study supporting multiple ordered procedures, e.g. chest/abdomen/pelvis CT).
    */
  var order: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The patient imaged in the study.
    */
  var patient: Reference
  
  /**
    * Type of procedure performed.
    */
  var procedure: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
    * Date and Time the study started.
    */
  var started: js.UndefOr[String] = js.undefined
  
  /**
    * Formal identifier for the study.
    */
  var uid: String
  
  /**
    * WADO-RS resource where Study is available.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ImagingStudy {
  
  inline def apply(numberOfInstances: Double, numberOfSeries: Double, patient: Reference, uid: String): ImagingStudy = {
    val __obj = js.Dynamic.literal(numberOfInstances = numberOfInstances.asInstanceOf[js.Any], numberOfSeries = numberOfSeries.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ImagingStudy", uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingStudy] (val x: Self) extends AnyVal {
    
    inline def setAccession(value: Identifier): Self = StObject.set(x, "accession", value.asInstanceOf[js.Any])
    
    inline def setAccessionUndefined: Self = StObject.set(x, "accession", js.undefined)
    
    inline def setAvailability(value: ONLINE | OFFLINE | NEARLINE | UNAVAILABLE): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInterpreter(value: Reference): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setModalityList(value: js.Array[Coding]): Self = StObject.set(x, "modalityList", value.asInstanceOf[js.Any])
    
    inline def setModalityListUndefined: Self = StObject.set(x, "modalityList", js.undefined)
    
    inline def setModalityListVarargs(value: Coding*): Self = StObject.set(x, "modalityList", js.Array(value*))
    
    inline def setNumberOfInstances(value: Double): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSeries(value: Double): Self = StObject.set(x, "numberOfSeries", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[Reference]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: Reference*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setProcedure(value: js.Array[Reference]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: Reference*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setReferrer(value: Reference): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: js.Array[ImagingStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ImagingStudySeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    inline def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
