package typings.gamedig.gamedigMod

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
    attemptTimeout: Int | Double = null,
    maxAttempts: Int | Double = null,
    notes: js.Object = null,
    port: Int | Double = null,
    socketTimeout: Int | Double = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attemptTimeout != null) __obj.updateDynamic("attemptTimeout")(attemptTimeout.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

