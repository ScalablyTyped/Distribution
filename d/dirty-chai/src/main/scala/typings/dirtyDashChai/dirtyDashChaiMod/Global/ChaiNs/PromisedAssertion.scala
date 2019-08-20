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
  var ensure_Original: PromisedAssertion = js.native
  def apply(): PromisedAssertion = js.native
  def ensure(): PromisedAssertion = js.native
  def ensure(`type`: String): typings.chaiDashAsDashPromised.ChaiNs.PromisedAssertion = js.native
  def ensure(`type`: String, message: String): typings.chaiDashAsDashPromised.ChaiNs.PromisedAssertion = js.native
  @JSName("ensure")
  def ensure_PromisedAssertion(message: String): PromisedAssertion = js.native
}

