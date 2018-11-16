package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Adjudication details
     */

trait ClaimResponseItemAdjudication extends BackboneElement {
  /**
           * Contains extended information for property 'value'.
           */
  var _value: js.UndefOr[Element] = js.undefined
  /**
           * Monetary amount
           */
  var amount: js.UndefOr[Money] = js.undefined
  /**
           * Adjudication category such as co-pay, eligible, benefit, etc.
           */
  var category: CodeableConcept
  /**
           * Explanation of Adjudication outcome
           */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Non-monetary value
           */
  var value: js.UndefOr[decimal] = js.undefined
}

