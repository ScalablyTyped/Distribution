package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A setup operation or assert to perform
     */

trait TestScriptSetupAction extends BackboneElement {
  /**
           * The assertion to perform
           */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.undefined
  /**
           * The setup operation to perform
           */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.undefined
}

