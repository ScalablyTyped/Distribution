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

