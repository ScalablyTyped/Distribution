package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libHooksMod

import typings.std.Record
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncHook
import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks", "getForkTsCheckerWebpackPluginHooks")
@js.native
object getForkTsCheckerWebpackPluginHooks extends js.Object {
  def apply(compiler: Compiler): Record[ForkTsCheckerHooks, (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])] = js.native
}

