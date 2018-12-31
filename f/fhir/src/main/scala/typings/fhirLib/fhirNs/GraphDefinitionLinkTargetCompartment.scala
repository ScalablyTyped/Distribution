package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compartment Consistency Rules
  */
trait GraphDefinitionLinkTargetCompartment extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rule'.
    */
  var _rule: js.UndefOr[Element] = js.undefined
  /**
    * Identifies the compartment
    */
  var code: code
  /**
    * Documentation for FHIRPath expression
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom rule, as a FHIRPath expression
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * identical | matching | different | custom
    */
  var rule: code
}

