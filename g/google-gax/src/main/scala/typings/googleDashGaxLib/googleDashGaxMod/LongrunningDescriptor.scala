package typings
package googleDashGaxLib.googleDashGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "LongrunningDescriptor")
@js.native
class LongrunningDescriptor protected ()
  extends googleDashGaxLib.buildSrcLongrunningMod.LongrunningDescriptor {
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
  def this(operationsClient: googleDashGaxLib.buildSrcOperationsClientMod.OperationsClient, responseDecoder: googleDashGaxLib.buildSrcLongrunningMod.AnyDecoder, metadataDecoder: googleDashGaxLib.buildSrcLongrunningMod.AnyDecoder) = this()
}

