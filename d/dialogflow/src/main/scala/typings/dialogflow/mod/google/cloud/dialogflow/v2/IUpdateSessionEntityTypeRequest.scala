package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateSessionEntityTypeRequest. */
trait IUpdateSessionEntityTypeRequest extends js.Object {
  /** UpdateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.undefined
  /** UpdateSessionEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateSessionEntityTypeRequest {
  @scala.inline
  def apply(
    sessionEntityType: js.UndefOr[Null | ISessionEntityType] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sessionEntityType)) __obj.updateDynamic("sessionEntityType")(sessionEntityType.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSessionEntityTypeRequest]
  }
}

