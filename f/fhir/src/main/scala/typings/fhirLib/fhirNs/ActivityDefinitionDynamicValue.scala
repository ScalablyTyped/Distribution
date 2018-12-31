package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic aspects of the definition
  */
trait ActivityDefinitionDynamicValue extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Natural language description of the dynamic value
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An expression that provides the dynamic value for the customization
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Language of the expression
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the element to be set dynamically
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

