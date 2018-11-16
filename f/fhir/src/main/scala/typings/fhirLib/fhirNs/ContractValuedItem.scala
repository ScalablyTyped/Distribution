package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contract Valued Item List
     */

trait ContractValuedItem extends BackboneElement {
  /**
           * Contains extended information for property 'effectiveTime'.
           */
  var _effectiveTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'factor'.
           */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'points'.
           */
  var _points: js.UndefOr[Element] = js.undefined
  /**
           * Contract Valued Item Effective Tiem
           */
  var effectiveTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Contract Valued Item Type
           */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Contract Valued Item Type
           */
  var entityReference: js.UndefOr[Reference] = js.undefined
  /**
           * Contract Valued Item Price Scaling Factor
           */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
           * Contract Valued Item Number
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Total Contract Valued Item Value
           */
  var net: js.UndefOr[Money] = js.undefined
  /**
           * Contract Valued Item Difficulty Scaling Factor
           */
  var points: js.UndefOr[decimal] = js.undefined
  /**
           * Count of Contract Valued Items
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Contract Valued Item fee, charge, or cost
           */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

