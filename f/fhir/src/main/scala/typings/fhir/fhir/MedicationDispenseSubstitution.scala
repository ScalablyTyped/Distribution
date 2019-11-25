package typings.fhir.fhir

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
  var wasSubstituted: Boolean
}

object MedicationDispenseSubstitution {
  @scala.inline
  def apply(
    wasSubstituted: Boolean,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _wasSubstituted: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: js.Array[CodeableConcept] = null,
    responsibleParty: js.Array[Reference] = null,
    `type`: CodeableConcept = null
  ): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_wasSubstituted != null) __obj.updateDynamic("_wasSubstituted")(_wasSubstituted.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (responsibleParty != null) __obj.updateDynamic("responsibleParty")(responsibleParty.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
}

