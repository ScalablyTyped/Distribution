package typings.googleDashGax

import typings.googleDashGax.buildSrcApitypesMod.GRPCCall
import typings.googleDashGax.buildSrcApitypesMod.GRPCCallOtherArgs
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/timeout", JSImport.Namespace)
@js.native
object buildSrcNormalCallsTimeoutMod extends js.Object {
  def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
  def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs, abTests: js.Object): SimpleCallbackFunction = js.native
}

