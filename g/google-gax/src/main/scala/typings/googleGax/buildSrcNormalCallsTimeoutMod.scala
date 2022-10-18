package typings.googleGax

import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GRPCCallOtherArgs
import typings.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalCallsTimeoutMod {
  
  @JSImport("google-gax/build/src/normalCalls/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("addTimeoutArg")(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[SimpleCallbackFunction]
  inline def addTimeoutArg(func: GRPCCall, timeout: Double, otherArgs: GRPCCallOtherArgs, abTests: js.Object): SimpleCallbackFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("addTimeoutArg")(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any], abTests.asInstanceOf[js.Any])).asInstanceOf[SimpleCallbackFunction]
}
