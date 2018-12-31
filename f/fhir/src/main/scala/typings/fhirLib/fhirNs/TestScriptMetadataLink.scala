package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links to the FHIR specification
  */
trait TestScriptMetadataLink extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Short description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to the specification
    */
  var url: uri
}

