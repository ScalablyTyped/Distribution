package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of required setup operations before tests are executed
  */
trait TestScriptSetup extends BackboneElement {
  /**
    * A setup operation or assert to perform
    */
  var action: js.Array[TestScriptSetupAction]
}

