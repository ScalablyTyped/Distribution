package typings
package gamedigLib.gamedigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var attemptTimeout: js.UndefOr[scala.Double] = js.undefined
  var host: java.lang.String
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var notes: js.UndefOr[js.Object] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var socketTimeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: Type
}

object QueryOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    `type`: Type,
    attemptTimeout: scala.Int | scala.Double = null,
    maxAttempts: scala.Int | scala.Double = null,
    notes: js.Object = null,
    port: scala.Int | scala.Double = null,
    socketTimeout: scala.Int | scala.Double = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(host = host)
    __obj.updateDynamic("type")(`type`)
    if (attemptTimeout != null) __obj.updateDynamic("attemptTimeout")(attemptTimeout.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

