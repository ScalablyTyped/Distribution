package typings.googleGax

import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.GRPCCallResult
import typings.googleGax.apitypesMod.RequestType
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/paginationCalls/resourceCollector", JSImport.Namespace)
@js.native
object resourceCollectorMod extends js.Object {
  @js.native
  class ResourceCollector protected () extends js.Object {
    def this(apiCall: SimpleCallbackFunction) = this()
    def this(apiCall: SimpleCallbackFunction, maxResults: Double) = this()
    @JSName("apiCall")
    var apiCall_Original: SimpleCallbackFunction = js.native
    var callback: js.Any = js.native
    var maxResults: Double = js.native
    var rejectCallback: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
    var resolveCallback: js.UndefOr[js.Function1[/* resources */ js.Array[js.Object], Unit]] = js.native
    var resources: js.Array[js.Object] = js.native
    def apiCall(request: RequestType, callback: APICallback): GRPCCallResult = js.native
    def processAllPages(firstRequest: RequestType): js.Promise[js.Array[js.Object]] = js.native
  }
  
}

