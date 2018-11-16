package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Condition that must evaluate to true
     */

trait ElementDefinitionConstraint extends Element {
  /**
           * Contains extended information for property 'expression'.
           */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'human'.
           */
  var _human: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'key'.
           */
  var _key: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'requirements'.
           */
  var _requirements: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'severity'.
           */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'source'.
           */
  var _source: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'xpath'.
           */
  var _xpath: js.UndefOr[Element] = js.undefined
  /**
           * FHIRPath expression of constraint
           */
  var expression: java.lang.String
  /**
           * Human description of constraint
           */
  var human: java.lang.String
  /**
           * Target of 'condition' reference above
           */
  var key: id
  /**
           * Why this constraint is necessary or appropriate
           */
  var requirements: js.UndefOr[java.lang.String] = js.undefined
  /**
           * error | warning
           */
  var severity: code
  /**
           * Reference to original source of constraint
           */
  var source: js.UndefOr[uri] = js.undefined
  /**
           * XPath expression of constraint
           */
  var xpath: js.UndefOr[java.lang.String] = js.undefined
}

