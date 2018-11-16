package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Insurer added line items
     */

trait ExplanationOfBenefitAddItem extends BackboneElement {
  /**
           * Contains extended information for property 'noteNumber'.
           */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'sequenceLinkId'.
           */
  var _sequenceLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Added items adjudication
           */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  /**
           * Type of service or product
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Added items details
           */
  var detail: js.UndefOr[js.Array[ExplanationOfBenefitAddItemDetail]] = js.undefined
  /**
           * Professional fee or Product charge
           */
  var fee: js.UndefOr[Money] = js.undefined
  /**
           * Service/Product billing modifiers
           */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * List of note numbers which apply
           */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
           * Revenue or cost center code
           */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Service instances
           */
  var sequenceLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
           * Billing Code
           */
  var service: js.UndefOr[CodeableConcept] = js.undefined
}

