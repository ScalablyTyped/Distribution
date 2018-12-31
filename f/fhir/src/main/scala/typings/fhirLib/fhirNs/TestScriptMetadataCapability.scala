package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities  that are assumed to function correctly on the FHIR server being tested
  */
trait TestScriptMetadataCapability extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'link'.
    */
  var _link: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'validated'.
    */
  var _validated: js.UndefOr[Element] = js.undefined
  /**
    * Required Capability Statement
    */
  var capabilities: Reference
  /**
    * The expected capabilities of the server
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Which server these requirements apply to
    */
  var destination: js.UndefOr[integer] = js.undefined
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Which origin server these requirements apply to
    */
  var origin: js.UndefOr[js.Array[integer]] = js.undefined
  /**
    * Are the capabilities required?
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Are the capabilities validated?
    */
  var validated: js.UndefOr[scala.Boolean] = js.undefined
}

