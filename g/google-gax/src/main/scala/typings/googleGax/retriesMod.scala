package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GRPCCallOtherArgs
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.gaxMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/retries", JSImport.Namespace)
@js.native
object retriesMod extends js.Object {
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
}

