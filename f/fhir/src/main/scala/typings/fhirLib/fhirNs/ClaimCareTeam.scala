package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Members of the care team
  */
trait ClaimCareTeam extends BackboneElement {
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Provider individual or organization
    */
  var provider: Reference
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Billing provider
    */
  var responsible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Number to covey order of careTeam
    */
  var sequence: positiveInt
}

object ClaimCareTeam {
  @scala.inline
  def apply(
    provider: Reference,
    sequence: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _responsible: Element = null,
    _sequence: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    qualification: CodeableConcept = null,
    responsible: js.UndefOr[scala.Boolean] = js.undefined,
    role: CodeableConcept = null
  ): ClaimCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider, sequence = sequence)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_responsible != null) __obj.updateDynamic("_responsible")(_responsible)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (qualification != null) __obj.updateDynamic("qualification")(qualification)
    if (!js.isUndefined(responsible)) __obj.updateDynamic("responsible")(responsible)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[ClaimCareTeam]
  }
}

