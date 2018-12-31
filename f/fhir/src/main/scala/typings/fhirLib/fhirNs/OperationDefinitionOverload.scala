package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define overloaded variants for when  generating code
  */
trait OperationDefinitionOverload extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'parameterName'.
    */
  var _parameterName: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Comments to go on overload
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of parameter to include in overload
    */
  var parameterName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

