package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.GaxCall
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/paginationCalls/pageDescriptor", JSImport.Namespace)
@js.native
object pageDescriptorMod extends js.Object {
  @js.native
  class PageDescriptor protected () extends Descriptor {
    def this(requestPageTokenField: String, responsePageTokenField: String, resourceField: String) = this()
    var requestPageSizeField: js.UndefOr[String] = js.native
    var requestPageTokenField: String = js.native
    var resourceField: String = js.native
    var responsePageTokenField: String = js.native
    /**
      * Creates a new object Stream which emits the resource on 'data' event.
      */
    def createStream(apiCall: GaxCall, request: js.Object, options: CallSettings): Transform = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

