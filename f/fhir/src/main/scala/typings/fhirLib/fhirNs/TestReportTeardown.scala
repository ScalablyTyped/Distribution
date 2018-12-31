package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of running the series of required clean up steps
  */
trait TestReportTeardown extends BackboneElement {
  /**
    * One or more teardown operations performed
    */
  var action: js.Array[TestReportTeardownAction]
}

