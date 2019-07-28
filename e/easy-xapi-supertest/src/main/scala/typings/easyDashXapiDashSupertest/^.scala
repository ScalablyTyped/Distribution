package typings.easyDashXapiDashSupertest

import typings.easyDashXapiDashSupertest.NodeJSNs.Global
import typings.easyDashXapiDashSupertest.NodeJSNs.Process
import typings.easyDashXapiDashSupertest.NodeJSNs.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var __dirname: String = js.native
  var __filename: String = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  var global: Global = js.native
  var process: Process = js.native
  def clearImmediate(immediateId: js.Any): Unit = js.native
  def clearInterval(intervalId: Timer): Unit = js.native
  def clearTimeout(timeoutId: Timer): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): js.Any = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
}

