package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each operation can have one or more header elements
  */
trait TestScriptSetupActionOperationRequestHeader extends BackboneElement {
  /**
    * Contains extended information for property 'field'.
    */
  var _field: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * HTTP header field name
    */
  var field: java.lang.String
  /**
    * HTTP headerfield value
    */
  var value: java.lang.String
}

