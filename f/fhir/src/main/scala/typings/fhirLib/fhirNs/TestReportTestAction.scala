package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test operation or assert that was performed
  */
trait TestReportTestAction extends BackboneElement {
  /**
    * The assertion performed
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.undefined
  /**
    * The operation performed
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.undefined
}

