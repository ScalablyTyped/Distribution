package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of participants involved in the encounter
  */
trait EncounterParticipant extends BackboneElement {
  /**
    * Persons involved in the encounter other than the patient
    */
  var individual: js.UndefOr[Reference] = js.undefined
  /**
    * Period of time during the encounter that the participant participated
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Role of participant in encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object EncounterParticipant {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    individual: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    `type`: js.Array[CodeableConcept] = null
  ): EncounterParticipant = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (individual != null) __obj.updateDynamic("individual")(individual)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EncounterParticipant]
  }
}

