package typings
package googleDashGaxLib.buildSrcLongrunningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longrunning", "LongrunningDescriptor")
@js.native
class LongrunningDescriptor protected () extends js.Object {
  /**
    * Describes the structure of a page-streaming call.
    *
    * @property {OperationsClient} operationsClient
    * @property {anyDecoder} responseDecoder
    * @property {anyDecoder} metadataDecoder
    *
    * @param {OperationsClient} operationsClient - The client used to poll or
    *   cancel an operation.
    * @param {anyDecoder=} responseDecoder - The decoder to unpack
    *   the response message.
    * @param {anyDecoder=} metadataDecoder - The decoder to unpack
    *   the metadata message.
    *
    * @constructor
    */
  def this(operationsClient: googleDashGaxLib.buildSrcOperationsClientMod.OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
  @JSName("metadataDecoder")
  var metadataDecoder_Original: AnyDecoder = js.native
  var operationsClient: googleDashGaxLib.buildSrcOperationsClientMod.OperationsClient = js.native
  @JSName("responseDecoder")
  var responseDecoder_Original: AnyDecoder = js.native
  def apiCaller(): LongrunningApiCaller = js.native
  def metadataDecoder(message: js.Object): googleDashGaxLib.buildSrcGrpcMod.Metadata = js.native
  def responseDecoder(message: js.Object): googleDashGaxLib.buildSrcGrpcMod.Metadata = js.native
}

