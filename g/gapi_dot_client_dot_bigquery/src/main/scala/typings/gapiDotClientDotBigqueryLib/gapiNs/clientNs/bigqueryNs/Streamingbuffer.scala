package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Streamingbuffer extends js.Object {
  /** [Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer. */
  var estimatedBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer. */
  var estimatedRows: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[java.lang.String] = js.undefined
}

