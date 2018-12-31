package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named instance provided when invoking the map
  */
trait StructureMapGroupInput extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * source | target
    */
  var mode: code
  /**
    * Name for this instance of data
    */
  var name: id
  /**
    * Type for this instance of data
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

