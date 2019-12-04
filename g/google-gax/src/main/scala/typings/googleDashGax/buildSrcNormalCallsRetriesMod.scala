package typings.googleDashGax

import typings.googleDashGax.buildSrcApitypesMod.GRPCCall
import typings.googleDashGax.buildSrcApitypesMod.GRPCCallOtherArgs
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleDashGax.buildSrcGaxMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/retries", JSImport.Namespace)
@js.native
object buildSrcNormalCallsRetriesMod extends js.Object {
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
}

