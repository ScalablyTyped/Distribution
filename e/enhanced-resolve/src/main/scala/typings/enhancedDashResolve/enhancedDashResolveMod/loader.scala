package typings.enhancedDashResolve.enhancedDashResolveMod

import typings.enhancedDashResolve.libCommonDashTypesMod.LoggingCallbackWrapper
import typings.enhancedDashResolve.libCommonDashTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "loader")
@js.native
object loader extends js.Object {
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def sync(context: ResolveContext, path: String, request: String): String = js.native
  def sync(path: String, request: String): String = js.native
}

