package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each study has one or more series of instances
  */
trait ImagingStudySeries extends BackboneElement {
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.undefined
  /**
    * Body part examined
    */
  var bodySite: js.UndefOr[Coding] = js.undefined
  /**
    * A short human readable summary of the series
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * A single SOP instance from the series
    */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.undefined
  /**
    * Body part laterality
    */
  var laterality: js.UndefOr[Coding] = js.undefined
  /**
    * The modality of the instances in the series
    */
  var modality: Coding
  /**
    * Numeric identifier of this series
    */
  var number: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Number of Series Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Who performed the series
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * When the series started
    */
  var started: js.UndefOr[dateTime] = js.undefined
  /**
    * Formal DICOM identifier for this series
    */
  var uid: oid
}

object ImagingStudySeries {
  @scala.inline
  def apply(
    modality: Coding,
    uid: oid,
    _availability: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _number: Element = null,
    _numberOfInstances: Element = null,
    _started: Element = null,
    _uid: Element = null,
    availability: code = null,
    bodySite: Coding = null,
    description: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    instance: js.Array[ImagingStudySeriesInstance] = null,
    laterality: Coding = null,
    modifierExtension: js.Array[Extension] = null,
    number: Int | Double = null,
    numberOfInstances: Int | Double = null,
    performer: js.Array[Reference] = null,
    started: dateTime = null
  ): ImagingStudySeries = {
    val __obj = js.Dynamic.literal(modality = modality.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (_availability != null) __obj.updateDynamic("_availability")(_availability.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_number != null) __obj.updateDynamic("_number")(_number.asInstanceOf[js.Any])
    if (_numberOfInstances != null) __obj.updateDynamic("_numberOfInstances")(_numberOfInstances.asInstanceOf[js.Any])
    if (_started != null) __obj.updateDynamic("_started")(_started.asInstanceOf[js.Any])
    if (_uid != null) __obj.updateDynamic("_uid")(_uid.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (laterality != null) __obj.updateDynamic("laterality")(laterality.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (numberOfInstances != null) __obj.updateDynamic("numberOfInstances")(numberOfInstances.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeries]
  }
}

