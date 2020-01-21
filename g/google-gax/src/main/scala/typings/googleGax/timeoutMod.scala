package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GRPCCallOtherArgs
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/timeout", JSImport.Namespace)
@js.native
object timeoutMod extends js.Object {
  def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
  def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs, abTests: js.Object): SimpleCallbackFunction = js.native
}

