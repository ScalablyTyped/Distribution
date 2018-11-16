package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * One or more teardown operations to perform
     */

trait TestScriptTeardownAction extends BackboneElement {
  /**
           * The teardown operation to perform
           */
  var operation: TestScriptSetupActionOperation
}

