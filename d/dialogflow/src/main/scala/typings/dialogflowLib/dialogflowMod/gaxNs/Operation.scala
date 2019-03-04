package typings
package dialogflowLib.dialogflowMod.gaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var backoffSettings: BackoffSettings
  var callOptions: js.UndefOr[CallOptions] = js.undefined
  var grpcOp: dialogflowLib.dialogflowMod.longrunningNs.Operation
  var longrunningDescriptor: js.Any
}

object Operation {
  @scala.inline
  def apply(
    backoffSettings: BackoffSettings,
    grpcOp: dialogflowLib.dialogflowMod.longrunningNs.Operation,
    longrunningDescriptor: js.Any,
    callOptions: CallOptions = null
  ): Operation = {
    val __obj = js.Dynamic.literal(backoffSettings = backoffSettings, grpcOp = grpcOp, longrunningDescriptor = longrunningDescriptor)
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions)
    __obj.asInstanceOf[Operation]
  }
}

