package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who should participate in the action
  */
trait ActivityDefinitionParticipant extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * E.g. Nurse, Surgeon, Parent, etc
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * patient | practitioner | related-person
    */
  var `type`: code
}

object ActivityDefinitionParticipant {
  @scala.inline
  def apply(
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    role: CodeableConcept = null
  ): ActivityDefinitionParticipant = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[ActivityDefinitionParticipant]
  }
}

