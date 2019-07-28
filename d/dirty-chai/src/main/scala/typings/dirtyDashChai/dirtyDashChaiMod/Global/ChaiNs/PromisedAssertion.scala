package typings.dirtyDashChai.dirtyDashChaiMod.Global.ChaiNs

import typings.chaiDashAsDashPromised.ChaiNs.Eventually
import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedAssertion
  extends Eventually
     with PromiseLike[js.Any] {
  @JSName("ensure")
  var ensure_Original: Assertion = js.native
  def apply(): Assertion = js.native
  def ensure(): Assertion = js.native
  def ensure(message: String): Assertion = js.native
}

