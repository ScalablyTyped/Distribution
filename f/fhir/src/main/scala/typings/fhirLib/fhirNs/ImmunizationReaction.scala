package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details of a reaction that follows immunization
     */

trait ImmunizationReaction extends BackboneElement {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'reported'.
           */
  var _reported: js.UndefOr[Element] = js.undefined
  /**
           * When reaction started
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Additional information on reaction
           */
  var detail: js.UndefOr[Reference] = js.undefined
  /**
           * Indicates self-reported reaction
           */
  var reported: js.UndefOr[scala.Boolean] = js.undefined
}

