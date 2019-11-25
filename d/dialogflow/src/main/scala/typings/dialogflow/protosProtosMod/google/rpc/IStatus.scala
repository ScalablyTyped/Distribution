package typings.dialogflow.protosProtosMod.google.rpc

import typings.dialogflow.protosProtosMod.google.protobuf.IAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Status. */
trait IStatus extends js.Object {
  /** Status code */
  var code: js.UndefOr[Double | Null] = js.undefined
  /** Status details */
  var details: js.UndefOr[js.Array[IAny] | Null] = js.undefined
  /** Status message */
  var message: js.UndefOr[String | Null] = js.undefined
}

object IStatus {
  @scala.inline
  def apply(code: Int | Double = null, details: js.Array[IAny] = null, message: String = null): IStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatus]
  }
}

