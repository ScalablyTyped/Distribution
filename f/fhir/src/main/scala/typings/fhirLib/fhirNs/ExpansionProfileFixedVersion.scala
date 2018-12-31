package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fix use of a code system to a particular version
  */
trait ExpansionProfileFixedVersion extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * default | check | override
    */
  var mode: code
  /**
    * System to have its version fixed
    */
  var system: uri
  /**
    * Specific version of the code system referred to
    */
  var version: java.lang.String
}

