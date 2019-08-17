package typings.atEmberTestDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/setup-application-context", JSImport.Namespace)
@js.native
object setupDashApplicationDashContextMod extends js.Object {
  def currentRouteName(): String = js.native
  def currentURL(): String = js.native
  def default[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  def visit(url: String): js.Promise[Unit] = js.native
}

