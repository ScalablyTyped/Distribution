package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Care Team members
  */
trait ExplanationOfBenefitCareTeam extends BackboneElement {
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Member of the Care Team
    */
  var provider: Reference
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Billing practitioner
    */
  var responsible: js.UndefOr[Boolean] = js.undefined
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Number to covey order of careteam
    */
  var sequence: positiveInt
}

object ExplanationOfBenefitCareTeam {
  @scala.inline
  def apply(
    provider: Reference,
    sequence: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _responsible: Element = null,
    _sequence: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    qualification: CodeableConcept = null,
    responsible: js.UndefOr[Boolean] = js.undefined,
    role: CodeableConcept = null
  ): ExplanationOfBenefitCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_responsible != null) __obj.updateDynamic("_responsible")(_responsible.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (qualification != null) __obj.updateDynamic("qualification")(qualification.asInstanceOf[js.Any])
    if (!js.isUndefined(responsible)) __obj.updateDynamic("responsible")(responsible.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitCareTeam]
  }
}

