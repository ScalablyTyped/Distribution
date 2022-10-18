package typings.googleGax

import typings.googleGax.buildSrcApitypesMod.APICallback
import typings.googleGax.buildSrcApitypesMod.GRPCCallResult
import typings.googleGax.buildSrcApitypesMod.RequestType
import typings.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPaginationCallsResourceCollectorMod {
  
  @JSImport("google-gax/build/src/paginationCalls/resourceCollector", "ResourceCollector")
  @js.native
  open class ResourceCollector protected () extends StObject {
    def this(apiCall: SimpleCallbackFunction) = this()
    def this(apiCall: SimpleCallbackFunction, maxResults: Double) = this()
    
    def apiCall(request: RequestType, callback: APICallback): GRPCCallResult = js.native
    @JSName("apiCall")
    var apiCall_Original: SimpleCallbackFunction = js.native
    
    /* private */ var callback: Any = js.native
    
    var maxResults: Double = js.native
    
    def processAllPages(firstRequest: RequestType): js.Promise[js.Array[js.Object]] = js.native
    
    var rejectCallback: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    var resolveCallback: js.UndefOr[js.Function1[/* resources */ js.Array[js.Object], Unit]] = js.native
    
    var resources: js.Array[js.Object] = js.native
  }
}
