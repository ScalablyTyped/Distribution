package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.gaxMod.CallSettings
import typings.googleGax.longRunningDescriptorMod.AnyDecoder
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.operationsClientMod.OperationsClient
import typings.googleGax.streamingMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptorMod {
  
  @JSImport("google-gax/build/src/descriptor", "BundleDescriptor")
  @js.native
  class BundleDescriptor protected ()
    extends typings.googleGax.bundleDescriptorMod.BundleDescriptor {
    /**
      * Describes the structure of bundled call.
      *
      * requestDiscriminatorFields may include '.' as a separator, which is used to
      * indicate object traversal. This allows fields in nested objects to be used
      * to determine what request to bundle.
      *
      * @property {String} bundledField
      * @property {String} requestDiscriminatorFields
      * @property {String} subresponseField
      * @property {Function} byteLengthFunction
      *
      * @param {String} bundledField - the repeated field in the request message
      *   that will have its elements aggregated by bundling.
      * @param {String} requestDiscriminatorFields - a list of fields in the
      *   target request message class that are used to detemrine which request
      *   messages should be bundled together.
      * @param {String} subresponseField - an optional field, when present it
      *   indicates the field in the response message that should be used to
      *   demultiplex the response into multiple response messages.
      * @param {Function} byteLengthFunction - a function to obtain the byte
      *   length to be consumed for the bundled field messages. Because Node.JS
      *   protobuf.js/gRPC uses builtin Objects for the user-visible data and
      *   internally they are encoded/decoded in protobuf manner, this function
      *   is actually necessary to calculate the byte length.
      * @constructor
      */
    def this(
      bundledField: String,
      requestDiscriminatorFields: js.Array[String],
      subresponseField: String,
      byteLengthFunction: js.Function
    ) = this()
    def this(
      bundledField: String,
      requestDiscriminatorFields: js.Array[String],
      subresponseField: Null,
      byteLengthFunction: js.Function
    ) = this()
  }
  
  @JSImport("google-gax/build/src/descriptor", "LongrunningDescriptor")
  @js.native
  class LongrunningDescriptor protected () extends LongRunningDescriptor {
    def this(operationsClient: OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
  }
  
  @JSImport("google-gax/build/src/descriptor", "PageDescriptor")
  @js.native
  class PageDescriptor protected ()
    extends typings.googleGax.pageDescriptorMod.PageDescriptor {
    def this(requestPageTokenField: String, responsePageTokenField: String, resourceField: String) = this()
  }
  
  @JSImport("google-gax/build/src/descriptor", "StreamDescriptor")
  @js.native
  class StreamDescriptor protected ()
    extends typings.googleGax.streamDescriptorMod.StreamDescriptor {
    def this(streamType: StreamType) = this()
  }
  
  trait Descriptor extends StObject {
    
    def getApiCaller(settings: CallSettings): APICaller
  }
  object Descriptor {
    
    @scala.inline
    def apply(getApiCaller: CallSettings => APICaller): Descriptor = {
      val __obj = js.Dynamic.literal(getApiCaller = js.Any.fromFunction1(getApiCaller))
      __obj.asInstanceOf[Descriptor]
    }
    
    @scala.inline
    implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetApiCaller(value: CallSettings => APICaller): Self = StObject.set(x, "getApiCaller", js.Any.fromFunction1(value))
    }
  }
}
