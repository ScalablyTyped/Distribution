package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationTokenData
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.run
import typings.forkTsCheckerWebpackPlugin.messageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/RpcTypes", JSImport.Namespace)
@js.native
object rpcTypesMod extends js.Object {
  val RUN: run = js.native
  type RunPayload = CancellationTokenData
  type RunResult = js.UndefOr[Message]
}

