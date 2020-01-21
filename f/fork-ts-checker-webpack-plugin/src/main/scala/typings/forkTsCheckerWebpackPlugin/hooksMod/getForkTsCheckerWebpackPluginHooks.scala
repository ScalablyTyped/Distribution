package typings.forkTsCheckerWebpackPlugin.hooksMod

import typings.std.Record
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncHook
import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks", "getForkTsCheckerWebpackPluginHooks")
@js.native
object getForkTsCheckerWebpackPluginHooks extends js.Object {
  def apply(compiler: Compiler_): Record[ForkTsCheckerHooks, (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])] = js.native
}

