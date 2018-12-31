package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test operation or assert to perform
  */
trait TestScriptTestAction extends BackboneElement {
  /**
    * The setup assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.undefined
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.undefined
}

