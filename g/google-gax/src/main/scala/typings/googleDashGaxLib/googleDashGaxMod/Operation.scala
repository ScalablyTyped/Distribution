package typings
package googleDashGaxLib.googleDashGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "Operation")
@js.native
class Operation protected ()
  extends googleDashGaxLib.buildSrcLongrunningMod.Operation {
  /**
    * Wrapper for a google.longrunnung.Operation.
    *
    * @constructor
    *
    * @param {google.longrunning.Operation} grpcOp - The operation to be wrapped.
    * @param {LongrunningDescriptor} longrunningDescriptor - This defines the
    * operations service client and unpacking mechanisms for the operation.
    * @param {BackoffSettings} backoffSettings - The backoff settings used in
    * in polling the operation.
    * @param {CallOptions=} callOptions - CallOptions used in making get operation
    * requests.
    */
  def this(grpcOp: googleDashGaxLib.buildSrcLongrunningMod.Operation, longrunningDescriptor: googleDashGaxLib.buildSrcLongrunningMod.LongrunningDescriptor, backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings) = this()
  def this(grpcOp: googleDashGaxLib.buildSrcLongrunningMod.Operation, longrunningDescriptor: googleDashGaxLib.buildSrcLongrunningMod.LongrunningDescriptor, backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings, callOptions: googleDashGaxLib.buildSrcGaxMod.CallOptions) = this()
}

