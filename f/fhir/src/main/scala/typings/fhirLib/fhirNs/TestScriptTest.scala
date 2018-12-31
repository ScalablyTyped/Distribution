package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test in this script
  */
trait TestScriptTest extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * A test operation or assert to perform
    */
  var action: js.Array[TestScriptTestAction]
  /**
    * Tracking/reporting short description of the test
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tracking/logging name of this test
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

