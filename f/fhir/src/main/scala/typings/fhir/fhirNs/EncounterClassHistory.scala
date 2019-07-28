package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of past encounter classes
  */
trait EncounterClassHistory extends BackboneElement {
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: Coding
  /**
    * The time that the episode was in the specified class
    */
  var period: Period
}

object EncounterClassHistory {
  @scala.inline
  def apply(
    `class`: Coding,
    period: Period,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): EncounterClassHistory = {
    val __obj = js.Dynamic.literal(period = period)
    __obj.updateDynamic("class")(`class`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[EncounterClassHistory]
  }
}

