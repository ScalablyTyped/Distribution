package typings.enhancedDashResolve.enhancedDashResolveMod

import typings.enhancedDashResolve.Fn_Callback
import typings.enhancedDashResolve.enhancedDashResolveMod.ResolverFactoryNs.ResolverOption
import typings.enhancedDashResolve.libCommonDashTypesMod.LoggingCallbackWrapper
import typings.enhancedDashResolve.libCommonDashTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def context(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def context(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def create(options: ResolverOption): Fn_Callback = js.native
  def loader(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def loader(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def sync(context: ResolveContext, path: String, request: String): String = js.native
  def sync(path: String, request: String): String = js.native
}

