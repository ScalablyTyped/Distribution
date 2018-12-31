package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base definition information for tools
  */
trait ElementDefinitionBase extends Element {
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
    * Max cardinality of the base element
    */
  var max: java.lang.String
  /**
    * Min cardinality of the base element
    */
  var min: unsignedInt
  /**
    * Path that identifies the base element
    */
  var path: java.lang.String
}

