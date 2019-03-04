package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whether a substitution was performed on the dispense
  */
trait MedicationDispenseSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'wasSubstituted'.
    */
  var _wasSubstituted: js.UndefOr[Element] = js.undefined
  /**
    * Why was substitution made
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who is responsible for the substitution
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Code signifying whether a different drug was dispensed from what was prescribed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Whether a substitution was or was not performed on the dispense
    */
  var wasSubstituted: scala.Boolean
}

object MedicationDispenseSubstitution {
  @scala.inline
  def apply(
    wasSubstituted: scala.Boolean,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _wasSubstituted: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: js.Array[CodeableConcept] = null,
    responsibleParty: js.Array[Reference] = null,
    `type`: CodeableConcept = null
  ): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_wasSubstituted != null) __obj.updateDynamic("_wasSubstituted")(_wasSubstituted)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (responsibleParty != null) __obj.updateDynamic("responsibleParty")(responsibleParty)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
}

