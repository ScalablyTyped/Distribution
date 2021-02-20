package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GRPCCallOtherArgs
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.gaxMod.RetryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retriesMod {
  
  @JSImport("google-gax/build/src/normalCalls/retries", "retryable")
  @js.native
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
  @JSImport("google-gax/build/src/normalCalls/retries", "retryable")
  @js.native
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs, apiName: String): SimpleCallbackFunction = js.native
}
