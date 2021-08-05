package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of images produced in single study (one or more series of references images)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ImagingStudy
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'numberOfSeries'.
    */
  var _numberOfSeries: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Related workflow identifier ("Accession Number")
    */
  var accession: js.UndefOr[Identifier] = js.undefined
  
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.undefined
  
  /**
    * Request fulfilled
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Originating context
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Institution-generated description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Study access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Other identifiers for the study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who interpreted images
    */
  var interpreter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * All series modality if actual acquisition modalities
    */
  var modalityList: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Number of Study Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Number of Study Related Series
    */
  var numberOfSeries: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Who the images are of
    */
  var patient: Reference
  
  /**
    * The performed procedure code
    */
  var procedureCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The performed Procedure reference
    */
  var procedureReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Why the study was requested
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Referring physician
    */
  var referrer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Each study has one or more series of instances
    */
  var series: js.UndefOr[js.Array[ImagingStudySeries]] = js.undefined
  
  /**
    * When the study was started
    */
  var started: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Formal DICOM identifier for the study
    */
  var uid: oid
}
object ImagingStudy {
  
  inline def apply(patient: Reference, uid: oid): ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  
  extension [Self <: ImagingStudy](x: Self) {
    
    inline def setAccession(value: Identifier): Self = StObject.set(x, "accession", value.asInstanceOf[js.Any])
    
    inline def setAccessionUndefined: Self = StObject.set(x, "accession", js.undefined)
    
    inline def setAvailability(value: code): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInterpreter(value: js.Array[Reference]): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setInterpreterVarargs(value: Reference*): Self = StObject.set(x, "interpreter", js.Array(value :_*))
    
    inline def setModalityList(value: js.Array[Coding]): Self = StObject.set(x, "modalityList", value.asInstanceOf[js.Any])
    
    inline def setModalityListUndefined: Self = StObject.set(x, "modalityList", js.undefined)
    
    inline def setModalityListVarargs(value: Coding*): Self = StObject.set(x, "modalityList", js.Array(value :_*))
    
    inline def setNumberOfInstances(value: unsignedInt): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    inline def setNumberOfSeries(value: unsignedInt): Self = StObject.set(x, "numberOfSeries", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSeriesUndefined: Self = StObject.set(x, "numberOfSeries", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setProcedureCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "procedureCode", value.asInstanceOf[js.Any])
    
    inline def setProcedureCodeUndefined: Self = StObject.set(x, "procedureCode", js.undefined)
    
    inline def setProcedureCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "procedureCode", js.Array(value :_*))
    
    inline def setProcedureReference(value: js.Array[Reference]): Self = StObject.set(x, "procedureReference", value.asInstanceOf[js.Any])
    
    inline def setProcedureReferenceUndefined: Self = StObject.set(x, "procedureReference", js.undefined)
    
    inline def setProcedureReferenceVarargs(value: Reference*): Self = StObject.set(x, "procedureReference", js.Array(value :_*))
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReferrer(value: Reference): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setSeries(value: js.Array[ImagingStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ImagingStudySeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setStarted(value: dateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    inline def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_numberOfInstances(value: Element): Self = StObject.set(x, "_numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def set_numberOfInstancesUndefined: Self = StObject.set(x, "_numberOfInstances", js.undefined)
    
    inline def set_numberOfSeries(value: Element): Self = StObject.set(x, "_numberOfSeries", value.asInstanceOf[js.Any])
    
    inline def set_numberOfSeriesUndefined: Self = StObject.set(x, "_numberOfSeries", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
