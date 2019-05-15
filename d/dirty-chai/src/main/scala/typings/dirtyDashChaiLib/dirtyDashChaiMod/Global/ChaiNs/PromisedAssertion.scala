package typings
package dirtyDashChaiLib.dirtyDashChaiMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedAssertion
  extends chaiDashAsDashPromisedLib.ChaiNs.Eventually
     with stdLib.PromiseLike[js.Any] {
  @JSName("ensure")
  var ensure_Original: Assertion = js.native
  def apply(): Assertion = js.native
  def ensure(): Assertion = js.native
  def ensure(message: java.lang.String): Assertion = js.native
}

