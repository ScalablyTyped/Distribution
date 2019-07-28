package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of images produced in single study (one or more series of references images)
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ImagingStudy extends DomainResource {
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
  @scala.inline
  def apply(
    patient: Reference,
    uid: oid,
    _availability: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _numberOfInstances: Element = null,
    _numberOfSeries: Element = null,
    _resourceType: Element = null,
    _started: Element = null,
    _uid: Element = null,
    accession: Identifier = null,
    availability: code = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    description: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    interpreter: js.Array[Reference] = null,
    language: code = null,
    meta: Meta = null,
    modalityList: js.Array[Coding] = null,
    modifierExtension: js.Array[Extension] = null,
    numberOfInstances: js.UndefOr[unsignedInt] = js.undefined,
    numberOfSeries: js.UndefOr[unsignedInt] = js.undefined,
    procedureCode: js.Array[CodeableConcept] = null,
    procedureReference: js.Array[Reference] = null,
    reason: CodeableConcept = null,
    referrer: Reference = null,
    resourceType: code = null,
    series: js.Array[ImagingStudySeries] = null,
    started: dateTime = null,
    text: Narrative = null
  ): ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient, uid = uid)
    if (_availability != null) __obj.updateDynamic("_availability")(_availability)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_numberOfInstances != null) __obj.updateDynamic("_numberOfInstances")(_numberOfInstances)
    if (_numberOfSeries != null) __obj.updateDynamic("_numberOfSeries")(_numberOfSeries)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_started != null) __obj.updateDynamic("_started")(_started)
    if (_uid != null) __obj.updateDynamic("_uid")(_uid)
    if (accession != null) __obj.updateDynamic("accession")(accession)
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modalityList != null) __obj.updateDynamic("modalityList")(modalityList)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(numberOfInstances)) __obj.updateDynamic("numberOfInstances")(numberOfInstances)
    if (!js.isUndefined(numberOfSeries)) __obj.updateDynamic("numberOfSeries")(numberOfSeries)
    if (procedureCode != null) __obj.updateDynamic("procedureCode")(procedureCode)
    if (procedureReference != null) __obj.updateDynamic("procedureReference")(procedureReference)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (series != null) __obj.updateDynamic("series")(series)
    if (started != null) __obj.updateDynamic("started")(started)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ImagingStudy]
  }
}

