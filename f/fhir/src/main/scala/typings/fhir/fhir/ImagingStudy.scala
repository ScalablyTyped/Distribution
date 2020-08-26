package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of images produced in single study (one or more series of references images)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ImagingStudy extends DomainResource {
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'numberOfSeries'.
    */
  var _numberOfSeries: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Related workflow identifier ("Accession Number")
    */
  var accession: js.UndefOr[Identifier] = js.native
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.native
  /**
    * Request fulfilled
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Originating context
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Institution-generated description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Study access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Other identifiers for the study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Who interpreted images
    */
  var interpreter: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * All series modality if actual acquisition modalities
    */
  var modalityList: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Number of Study Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.native
  /**
    * Number of Study Related Series
    */
  var numberOfSeries: js.UndefOr[unsignedInt] = js.native
  /**
    * Who the images are of
    */
  var patient: Reference = js.native
  /**
    * The performed procedure code
    */
  var procedureCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The performed Procedure reference
    */
  var procedureReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Why the study was requested
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Referring physician
    */
  var referrer: js.UndefOr[Reference] = js.native
  /**
    * Each study has one or more series of instances
    */
  var series: js.UndefOr[js.Array[ImagingStudySeries]] = js.native
  /**
    * When the study was started
    */
  var started: js.UndefOr[dateTime] = js.native
  /**
    * Formal DICOM identifier for the study
    */
  var uid: oid = js.native
}

object ImagingStudy {
  @scala.inline
  def apply(patient: Reference, uid: oid): ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  @scala.inline
  implicit class ImagingStudyOps[Self <: ImagingStudy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: oid): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def set_availability(value: Element): Self = this.set("_availability", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_availability: Self = this.set("_availability", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_numberOfInstances(value: Element): Self = this.set("_numberOfInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_numberOfInstances: Self = this.set("_numberOfInstances", js.undefined)
    @scala.inline
    def set_numberOfSeries(value: Element): Self = this.set("_numberOfSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_numberOfSeries: Self = this.set("_numberOfSeries", js.undefined)
    @scala.inline
    def set_started(value: Element): Self = this.set("_started", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_started: Self = this.set("_started", js.undefined)
    @scala.inline
    def set_uid(value: Element): Self = this.set("_uid", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
    @scala.inline
    def setAccession(value: Identifier): Self = this.set("accession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccession: Self = this.set("accession", js.undefined)
    @scala.inline
    def setAvailability(value: code): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setInterpreterVarargs(value: Reference*): Self = this.set("interpreter", js.Array(value :_*))
    @scala.inline
    def setInterpreter(value: js.Array[Reference]): Self = this.set("interpreter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpreter: Self = this.set("interpreter", js.undefined)
    @scala.inline
    def setModalityListVarargs(value: Coding*): Self = this.set("modalityList", js.Array(value :_*))
    @scala.inline
    def setModalityList(value: js.Array[Coding]): Self = this.set("modalityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalityList: Self = this.set("modalityList", js.undefined)
    @scala.inline
    def setNumberOfInstances(value: unsignedInt): Self = this.set("numberOfInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfInstances: Self = this.set("numberOfInstances", js.undefined)
    @scala.inline
    def setNumberOfSeries(value: unsignedInt): Self = this.set("numberOfSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfSeries: Self = this.set("numberOfSeries", js.undefined)
    @scala.inline
    def setProcedureCodeVarargs(value: CodeableConcept*): Self = this.set("procedureCode", js.Array(value :_*))
    @scala.inline
    def setProcedureCode(value: js.Array[CodeableConcept]): Self = this.set("procedureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedureCode: Self = this.set("procedureCode", js.undefined)
    @scala.inline
    def setProcedureReferenceVarargs(value: Reference*): Self = this.set("procedureReference", js.Array(value :_*))
    @scala.inline
    def setProcedureReference(value: js.Array[Reference]): Self = this.set("procedureReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedureReference: Self = this.set("procedureReference", js.undefined)
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setReferrer(value: Reference): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: ImagingStudySeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[ImagingStudySeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStarted(value: dateTime): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
  }
  
}

