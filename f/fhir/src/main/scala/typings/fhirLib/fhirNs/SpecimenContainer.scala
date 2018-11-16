package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Direct container of specimen (tube/slide, etc.)
     */

trait SpecimenContainer extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Additive associated with container
           */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Additive associated with container
           */
  var additiveReference: js.UndefOr[Reference] = js.undefined
  /**
           * Container volume or size
           */
  var capacity: js.UndefOr[Quantity] = js.undefined
  /**
           * Textual description of the container
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Id for the container
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Quantity of specimen within container
           */
  var specimenQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Kind of container directly associated with specimen
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

