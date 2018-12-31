package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How a resource is related to the compartment
  */
trait CompartmentDefinitionResource extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'param'.
    */
  var _param: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Name of resource type
    */
  var code: code
  /**
    * Additional documentation about the resource and compartment
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Search Parameter Name, or chained parameters
    */
  var param: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

