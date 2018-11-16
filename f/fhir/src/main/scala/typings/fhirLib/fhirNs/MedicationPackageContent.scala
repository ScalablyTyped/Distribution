package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * What is  in the package
     */

trait MedicationPackageContent extends BackboneElement {
  /**
           * Quantity present in the package
           */
  var amount: js.UndefOr[Quantity] = js.undefined
  /**
           * The item in the package
           */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The item in the package
           */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

