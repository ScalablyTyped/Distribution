package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A measured or measurable amount
     */

trait Quantity extends Element {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'comparator'.
           */
  var _comparator: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'system'.
           */
  var _system: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'unit'.
           */
  var _unit: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'value'.
           */
  var _value: js.UndefOr[Element] = js.undefined
  /**
           * Coded form of the unit
           */
  var code: js.UndefOr[code] = js.undefined
  /**
           * < | <= | >= | > - how to understand the value
           */
  var comparator: js.UndefOr[code] = js.undefined
  /**
           * System that defines coded unit form
           */
  var system: js.UndefOr[uri] = js.undefined
  /**
           * Unit representation
           */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Numerical value (with implicit precision)
           */
  var value: js.UndefOr[decimal] = js.undefined
}

