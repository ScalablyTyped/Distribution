package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Trait of group members
     */

trait GroupCharacteristic extends BackboneElement {
  /**
           * Contains extended information for property 'exclude'.
           */
  var _exclude: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueBoolean'.
           */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Kind of characteristic
           */
  var code: CodeableConcept
  /**
           * Group includes or excludes
           */
  var exclude: scala.Boolean
  /**
           * Period over which characteristic is tested
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Value held by characteristic
           */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value held by characteristic
           */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Value held by characteristic
           */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Value held by characteristic
           */
  var valueRange: js.UndefOr[Range] = js.undefined
}

