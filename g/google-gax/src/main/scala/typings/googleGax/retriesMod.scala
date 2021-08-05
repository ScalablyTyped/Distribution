package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GRPCCallOtherArgs
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.gaxMod.RetryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retriesMod {
  
  @JSImport("google-gax/build/src/normalCalls/retries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(func.asInstanceOf[js.Any], retry.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[SimpleCallbackFunction]
  inline def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs, apiName: String): SimpleCallbackFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(func.asInstanceOf[js.Any], retry.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any], apiName.asInstanceOf[js.Any])).asInstanceOf[SimpleCallbackFunction]
}
