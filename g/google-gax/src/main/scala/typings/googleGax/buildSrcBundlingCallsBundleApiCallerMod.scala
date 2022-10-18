package typings.googleGax

import typings.googleGax.buildSrcApiCallerMod.APICaller
import typings.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleGax.buildSrcBundlingCallsBundleExecutorMod.BundleExecutor
import typings.googleGax.buildSrcCallMod.OngoingCallPromise
import typings.googleGax.buildSrcGaxMod.CallSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBundlingCallsBundleApiCallerMod {
  
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
