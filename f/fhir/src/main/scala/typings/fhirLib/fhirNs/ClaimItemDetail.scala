package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Additional items
     */

trait ClaimItemDetail extends BackboneElement {
  /**
           * Contains extended information for property 'factor'.
           */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sequence'.
           */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
           * Type of service or product
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Price scaling factor
           */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
           * Service/Product billing modifiers
           */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Total additional item cost
           */
  var net: js.UndefOr[Money] = js.undefined
  /**
           * Program specific reason for item inclusion
           */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Count of Products or Services
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Revenue or cost center code
           */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Service instance
           */
  var sequence: positiveInt
  /**
           * Billing Code
           */
  var service: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Additional items
           */
  var subDetail: js.UndefOr[js.Array[ClaimItemDetailSubDetail]] = js.undefined
  /**
           * Unique Device Identifier
           */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Fee, charge or cost per point
           */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

