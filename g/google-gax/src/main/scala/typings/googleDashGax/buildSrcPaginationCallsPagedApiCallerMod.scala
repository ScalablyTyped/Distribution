package typings.googleDashGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashGax.buildSrcApiCallerMod.APICaller
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleDashGax.buildSrcCallMod.OngoingCall
import typings.googleDashGax.buildSrcGaxMod.CallOptions
import typings.googleDashGax.buildSrcPaginationCallsPageDescriptorMod.PageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/paginationCalls/pagedApiCaller", JSImport.Namespace)
@js.native
object buildSrcPaginationCallsPagedApiCallerMod extends js.Object {
  @js.native
  class PagedApiCaller protected () extends APICaller {
    /**
      * Creates an API caller that returns a stream to performs page-streaming.
      *
      * @private
      * @constructor
      * @param {PageDescriptor} pageDescriptor - indicates the structure
      *   of page streaming to be performed.
      */
    def this(pageDescriptor: PageDescriptor) = this()
    var createActualCallback: js.Any = js.native
    var pageDescriptor: PageDescriptor = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: StringDictionary[js.Object],
      settings: CallOptions,
      canceller: OngoingCall
    ): Unit = js.native
  }
  
}

