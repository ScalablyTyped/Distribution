package typings
package googleDashGaxLib.buildSrcLongrunningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longrunning", "LongrunningApiCaller")
@js.native
class LongrunningApiCaller protected ()
  extends googleDashGaxLib.buildSrcApiCallableMod.NormalApiCaller {
  /**
    * Creates an API caller that performs polling on a long running operation.
    *
    * @private
    * @constructor
    * @param {LongrunningDescriptor} longrunningDescriptor - Holds the
    * decoders used for unpacking responses and the operationsClient
    * used for polling the operation.
    */
  def this(longrunningDescriptor: LongrunningDescriptor) = this()
  var longrunningDescriptor: LongrunningDescriptor = js.native
  def _wrapOperation(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    settings: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    argument: js.Object,
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Any = js.native
  def call(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    argument: js.Object,
    settings: googleDashGaxLib.buildSrcGaxMod.CallOptions,
    canceller: googleDashGaxLib.buildSrcApiCallableMod.PromiseCanceller[_]
  ): scala.Unit = js.native
}

