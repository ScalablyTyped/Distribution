package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Members of the team
  */
trait CareTeamParticipant extends BackboneElement {
  /**
    * Who is involved
    */
  var member: js.UndefOr[Reference] = js.undefined
  /**
    * Organization of the practitioner
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  /**
    * Time period of participant
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Type of involvement
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

object CareTeamParticipant {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    member: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    onBehalfOf: Reference = null,
    period: Period = null,
    role: CodeableConcept = null
  ): CareTeamParticipant = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (member != null) __obj.updateDynamic("member")(member)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (onBehalfOf != null) __obj.updateDynamic("onBehalfOf")(onBehalfOf)
    if (period != null) __obj.updateDynamic("period")(period)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[CareTeamParticipant]
  }
}

