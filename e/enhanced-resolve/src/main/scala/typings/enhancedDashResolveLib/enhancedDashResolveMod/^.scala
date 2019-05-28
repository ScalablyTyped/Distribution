package typings
package enhancedDashResolveLib.enhancedDashResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def apply(
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def context(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def context(
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def create(options: enhancedDashResolveLib.enhancedDashResolveMod.ResolverFactoryNs.ResolverOption): enhancedDashResolveLib.Fn_Callback = js.native
  def loader(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def loader(
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): scala.Unit = js.native
  def sync(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String
  ): java.lang.String = js.native
  def sync(path: java.lang.String, request: java.lang.String): java.lang.String = js.native
}

