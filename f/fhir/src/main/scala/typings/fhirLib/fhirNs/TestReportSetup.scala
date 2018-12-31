package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of the series of required setup operations before the tests were executed
  */
trait TestReportSetup extends BackboneElement {
  /**
    * A setup operation or assert that was executed
    */
  var action: js.Array[TestReportSetupAction]
}

