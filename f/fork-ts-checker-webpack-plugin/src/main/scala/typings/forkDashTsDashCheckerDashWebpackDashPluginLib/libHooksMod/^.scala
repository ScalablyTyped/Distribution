package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.libHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val legacyHookMap: ForkTsCheckerLegacyHookMap = js.native
  def getForkTsCheckerWebpackPluginHooks(compiler: webpackLib.webpackMod.Compiler): stdLib.Record[
    ForkTsCheckerHooks, 
    (tapableLib.tapableMod.SyncHook[_, _, _]) | (tapableLib.tapableMod.AsyncSeriesHook[_, _, _])
  ] = js.native
}

