package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This patient is known to be an animal (non-human)
  */
trait PatientAnimal extends BackboneElement {
  /**
    * E.g. Poodle, Angus
    */
  var breed: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * E.g. Neutered, Intact
    */
  var genderStatus: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * E.g. Dog, Cow
    */
  var species: CodeableConcept
}

object PatientAnimal {
  @scala.inline
  def apply(
    species: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    breed: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    genderStatus: CodeableConcept = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): PatientAnimal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("species")(species)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (breed != null) __obj.updateDynamic("breed")(breed)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (genderStatus != null) __obj.updateDynamic("genderStatus")(genderStatus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[PatientAnimal]
  }
}

