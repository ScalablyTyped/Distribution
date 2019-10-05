package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libHooksMod.ForkTsCheckerHooks
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libHooksMod.ForkTsCheckerLegacyHookMap
import typings.std.Record
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncHook
import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks", JSImport.Namespace)
@js.native
object libHooksMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.serviceBeforeStart
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.cancel
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.serviceStartError
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.waiting
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.serviceStart
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.receive
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.serviceOutOfMemory
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.emit
    - typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.done
  */
  trait ForkTsCheckerHooks extends js.Object
  
  val legacyHookMap: ForkTsCheckerLegacyHookMap = js.native
  def getForkTsCheckerWebpackPluginHooks(compiler: Compiler): Record[ForkTsCheckerHooks, (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])] = js.native
  type ForkTsCheckerLegacyHookMap = Record[ForkTsCheckerHooks, String]
}

