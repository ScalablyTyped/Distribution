package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing and processing step details
  */
trait SpecimenProcessing extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timeDateTime'.
    */
  var _timeDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Material used in the processing step
    */
  var additive: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Textual description of procedure
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Indicates the treatment step  applied to the specimen
    */
  var procedure: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Date and time of specimen processing
    */
  var timeDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Date and time of specimen processing
    */
  var timePeriod: js.UndefOr[Period] = js.undefined
}

object SpecimenProcessing {
  @scala.inline
  def apply(
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _timeDateTime: Element = null,
    additive: js.Array[Reference] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    procedure: CodeableConcept = null,
    timeDateTime: dateTime = null,
    timePeriod: Period = null
  ): SpecimenProcessing = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_timeDateTime != null) __obj.updateDynamic("_timeDateTime")(_timeDateTime.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (procedure != null) __obj.updateDynamic("procedure")(procedure.asInstanceOf[js.Any])
    if (timeDateTime != null) __obj.updateDynamic("timeDateTime")(timeDateTime.asInstanceOf[js.Any])
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenProcessing]
  }
}

