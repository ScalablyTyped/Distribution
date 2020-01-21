package typings.dialogflow.mod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CancelOperationRequest. */
trait ICancelOperationRequest extends js.Object {
  /** CancelOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object ICancelOperationRequest {
  @scala.inline
  def apply(name: String = null): ICancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICancelOperationRequest]
  }
}

