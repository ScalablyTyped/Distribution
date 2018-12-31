package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Systems/Versions to be exclude
  */
trait ExpansionProfileExcludedSystem extends BackboneElement {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * The specific code system to be excluded
    */
  var system: uri
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

