package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details about packaged medications
     */

trait MedicationPackage extends BackboneElement {
  /**
           * Identifies a single production run
           */
  var batch: js.UndefOr[js.Array[MedicationPackageBatch]] = js.undefined
  /**
           * E.g. box, vial, blister-pack
           */
  var container: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * What is  in the package
           */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.undefined
}

