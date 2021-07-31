package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.GaxCall
import typings.googleGax.apitypesMod.RequestType
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageDescriptorMod {
  
  @JSImport("google-gax/build/src/paginationCalls/pageDescriptor", "PageDescriptor")
  @js.native
  class PageDescriptor protected ()
    extends StObject
       with Descriptor {
    def this(requestPageTokenField: String, responsePageTokenField: String, resourceField: String) = this()
    
    /**
      * Create an async iterable which can be recursively called for data on-demand.
      */
    def asyncIterate(apiCall: GaxCall, request: RequestType): AsyncIterable[js.UndefOr[js.Object]] = js.native
    def asyncIterate(apiCall: GaxCall, request: RequestType, options: CallSettings): AsyncIterable[js.UndefOr[js.Object]] = js.native
    
    def createIterator(apiCall: GaxCall, request: RequestType, options: CallSettings): AsyncIterable[js.UndefOr[js.Object]] = js.native
    
    /**
      * Creates a new object Stream which emits the resource on 'data' event.
      */
    def createStream(apiCall: GaxCall, request: js.Object, options: CallSettings): Transform = js.native
    
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
    
    var requestPageSizeField: js.UndefOr[String] = js.native
    
    var requestPageTokenField: String = js.native
    
    var resourceField: String = js.native
    
    var responsePageTokenField: String = js.native
  }
  
  type ResponseType = StringDictionary[String]
}
