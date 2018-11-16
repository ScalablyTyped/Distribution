package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Status extends js.Object {
  /** The status code, which should be an enum value of [google.rpc.Code][]. */
  var code: js.UndefOr[scala.Double] = js.undefined
  /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
  var details: js.UndefOr[js.Array[Any]] = js.undefined
  /**
               * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the
               * [google.rpc.Status.details][] field, or localized by the client.
               */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

