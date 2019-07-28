package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Streamingbuffer extends js.Object {
  /** [Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer. */
  var estimatedBytes: js.UndefOr[String] = js.undefined
  /** [Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer. */
  var estimatedRows: js.UndefOr[String] = js.undefined
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[String] = js.undefined
}

object Streamingbuffer {
  @scala.inline
  def apply(estimatedBytes: String = null, estimatedRows: String = null, oldestEntryTime: String = null): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    if (estimatedBytes != null) __obj.updateDynamic("estimatedBytes")(estimatedBytes)
    if (estimatedRows != null) __obj.updateDynamic("estimatedRows")(estimatedRows)
    if (oldestEntryTime != null) __obj.updateDynamic("oldestEntryTime")(oldestEntryTime)
    __obj.asInstanceOf[Streamingbuffer]
  }
}

