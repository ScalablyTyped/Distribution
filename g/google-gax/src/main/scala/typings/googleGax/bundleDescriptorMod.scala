package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundlingCalls/bundleDescriptor", JSImport.Namespace)
@js.native
object bundleDescriptorMod extends js.Object {
  @js.native
  class BundleDescriptor protected () extends Descriptor {
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
    var bundledField: String = js.native
    var byteLengthFunction: js.Function = js.native
    var requestDiscriminatorFields: js.Array[String] = js.native
    var subresponseField: String | Null = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

