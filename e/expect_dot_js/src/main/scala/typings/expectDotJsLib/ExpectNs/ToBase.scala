package typings
package expectDotJsLib.ExpectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToBase extends Assertion {
  @JSName("be")
  var be_Original: Be = js.native
  var have: Have = js.native
  var include: Assertion = js.native
  var only: Only = js.native
  /**
           * Checks if the obj exactly equals another.
           */
  def be(obj: js.Any): Assertion = js.native
}

