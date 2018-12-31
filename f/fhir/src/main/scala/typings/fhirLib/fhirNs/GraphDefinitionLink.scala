package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links this graph makes rules about
  */
trait GraphDefinitionLink extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sliceName'.
    */
  var _sliceName: js.UndefOr[Element] = js.undefined
  /**
    * Why this link is specified
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum occurrences for this link
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Minimum occurrences for this link
    */
  var min: js.UndefOr[integer] = js.undefined
  /**
    * Path in the resource that contains the link
    */
  var path: java.lang.String
  /**
    * Which slice (if profiled)
    */
  var sliceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Potential target for the link
    */
  var target: js.Array[GraphDefinitionLinkTarget]
}

