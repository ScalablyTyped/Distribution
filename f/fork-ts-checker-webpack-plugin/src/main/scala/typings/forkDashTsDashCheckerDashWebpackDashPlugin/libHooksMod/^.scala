package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libHooksMod

import typings.std.Record
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncHook
import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val legacyHookMap: ForkTsCheckerLegacyHookMap = js.native
  def getForkTsCheckerWebpackPluginHooks(compiler: Compiler): Record[ForkTsCheckerHooks, (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])] = js.native
}

