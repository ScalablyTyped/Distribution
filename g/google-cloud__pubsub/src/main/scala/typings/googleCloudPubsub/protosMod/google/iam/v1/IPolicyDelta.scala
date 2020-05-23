package typings.googleCloudPubsub.protosMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PolicyDelta. */
trait IPolicyDelta extends js.Object {
  /** PolicyDelta auditConfigDeltas */
  var auditConfigDeltas: js.UndefOr[js.Array[IAuditConfigDelta] | Null] = js.undefined
  /** PolicyDelta bindingDeltas */
  var bindingDeltas: js.UndefOr[js.Array[IBindingDelta] | Null] = js.undefined
}

object IPolicyDelta {
  @scala.inline
  def apply(
    auditConfigDeltas: js.UndefOr[Null | js.Array[IAuditConfigDelta]] = js.undefined,
    bindingDeltas: js.UndefOr[Null | js.Array[IBindingDelta]] = js.undefined
  ): IPolicyDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auditConfigDeltas)) __obj.updateDynamic("auditConfigDeltas")(auditConfigDeltas.asInstanceOf[js.Any])
    if (!js.isUndefined(bindingDeltas)) __obj.updateDynamic("bindingDeltas")(bindingDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicyDelta]
  }
}

