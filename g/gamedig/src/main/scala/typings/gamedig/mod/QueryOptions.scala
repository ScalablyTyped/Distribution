package typings.gamedig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var attemptTimeout: js.UndefOr[Double] = js.undefined
  var host: String
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var notes: js.UndefOr[js.Object] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var socketTimeout: js.UndefOr[Double] = js.undefined
  var `type`: Type
}

object QueryOptions {
  @scala.inline
  def apply(
    host: String,
    `type`: Type,
    attemptTimeout: js.UndefOr[Double] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    notes: js.Object = null,
    port: js.UndefOr[Double] = js.undefined,
    socketTimeout: js.UndefOr[Double] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(attemptTimeout)) __obj.updateDynamic("attemptTimeout")(attemptTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

