package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Whether or not the action is applicable
     */

trait PlanDefinitionActionCondition extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'expression'.
           */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'kind'.
           */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'language'.
           */
  var _language: js.UndefOr[Element] = js.undefined
  /**
           * Natural language description of the condition
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Boolean-valued expression
           */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
           * applicability | start | stop
           */
  var kind: code
  /**
           * Language of the expression
           */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

