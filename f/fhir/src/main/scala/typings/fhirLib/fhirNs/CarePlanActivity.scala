package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action to occur as part of plan
  */
trait CarePlanActivity extends BackboneElement {
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.undefined
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
}

object CarePlanActivity {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    detail: CarePlanActivityDetail = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    outcomeCodeableConcept: js.Array[CodeableConcept] = null,
    outcomeReference: js.Array[Reference] = null,
    progress: js.Array[Annotation] = null,
    reference: Reference = null
  ): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (outcomeCodeableConcept != null) __obj.updateDynamic("outcomeCodeableConcept")(outcomeCodeableConcept)
    if (outcomeReference != null) __obj.updateDynamic("outcomeReference")(outcomeReference)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[CarePlanActivity]
  }
}

