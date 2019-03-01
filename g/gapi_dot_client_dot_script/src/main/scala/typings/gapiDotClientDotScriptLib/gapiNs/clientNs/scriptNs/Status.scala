package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  /** The status code. For this API, this value will always be 3, corresponding to an <code>INVALID_ARGUMENT</code> error. */
  var code: js.UndefOr[scala.Double] = js.undefined
  /** An array that contains a single `ExecutionError` object that provides information about the nature of the error. */
  var details: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
  /**
    * A developer-facing error message, which is in English. Any user-facing error message is localized and sent in the
    * [`google.rpc.Status.details`](google.rpc.Status.details) field, or localized by the client.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    details: js.Array[stdLib.Record[java.lang.String, _]] = null,
    message: java.lang.String = null
  ): Status = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Status]
  }
}

