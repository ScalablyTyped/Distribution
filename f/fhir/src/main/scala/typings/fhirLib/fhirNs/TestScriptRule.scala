package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assert rule used within the test script
  */
trait TestScriptRule extends BackboneElement {
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRuleParam]] = js.undefined
  /**
    * Assert rule resource reference
    */
  var resource: Reference
}

