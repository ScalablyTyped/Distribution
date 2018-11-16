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

