package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of required clean up steps
  */
trait TestScriptTeardown extends BackboneElement {
  /**
    * One or more teardown operations to perform
    */
  var action: js.Array[TestScriptTeardownAction]
}

