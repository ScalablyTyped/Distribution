package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Filter that can be used in a value set
     */

trait CodeSystemFilter extends BackboneElement {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'operator'.
           */
  var _operator: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'value'.
           */
  var _value: js.UndefOr[Element] = js.undefined
  /**
           * Code that identifies the filter
           */
  var code: code
  /**
           * How or why the filter is used
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Operators that can be used with filter
           */
  var operator: js.Array[code]
  /**
           * What to use for the value
           */
  var value: java.lang.String
}

