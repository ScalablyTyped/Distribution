package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Element values that are used to distinguish the slices
  */
trait ElementDefinitionSlicingDiscriminator extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Path to element value
    */
  var path: java.lang.String
  /**
    * value | exists | pattern | type | profile
    */
  var `type`: code
}

