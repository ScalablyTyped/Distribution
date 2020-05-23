package typings.googleGax.operationsMod.google.rpc

import typings.googleGax.operationsMod.google.protobuf.IAny
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
  def apply(
    code: js.UndefOr[Null | Double] = js.undefined,
    details: js.UndefOr[Null | js.Array[IAny]] = js.undefined,
    message: js.UndefOr[Null | String] = js.undefined
  ): IStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatus]
  }
}

