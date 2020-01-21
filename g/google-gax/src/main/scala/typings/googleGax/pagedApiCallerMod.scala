package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.callMod.OngoingCall
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.pageDescriptorMod.PageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/paginationCalls/pagedApiCaller", JSImport.Namespace)
@js.native
object pagedApiCallerMod extends js.Object {
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

