package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.bundleExecutorMod.BundleExecutor
import typings.googleGax.callMod.OngoingCallPromise
import typings.googleGax.gaxMod.CallSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleApiCallerMod {
  
  @JSImport("google-gax/build/src/bundlingCalls/bundleApiCaller", "BundleApiCaller")
  @js.native
  open class BundleApiCaller protected ()
    extends StObject
       with APICaller {
    def this(bundler: BundleExecutor) = this()
    
    var bundler: BundleExecutor = js.native
    
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallSettings,
      status: OngoingCallPromise
    ): Unit = js.native
  }
}
