package typings
package fhirLib.fhirNs

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
  var description: js.UndefOr[java.lang.String] = js.undefined
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
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    procedure: CodeableConcept = null,
    timeDateTime: dateTime = null,
    timePeriod: Period = null
  ): SpecimenProcessing = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_timeDateTime != null) __obj.updateDynamic("_timeDateTime")(_timeDateTime)
    if (additive != null) __obj.updateDynamic("additive")(additive)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (procedure != null) __obj.updateDynamic("procedure")(procedure)
    if (timeDateTime != null) __obj.updateDynamic("timeDateTime")(timeDateTime)
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod)
    __obj.asInstanceOf[SpecimenProcessing]
  }
}

