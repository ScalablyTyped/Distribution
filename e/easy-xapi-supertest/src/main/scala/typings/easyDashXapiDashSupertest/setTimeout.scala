package typings.easyDashXapiDashSupertest

import typings.easyDashXapiDashSupertest.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
}

