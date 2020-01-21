package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStreamingbuffer extends js.Object {
  /**
    * [Output-only] A lower-bound estimate of the number of bytes currently in
    * the streaming buffer.
    */
  var estimatedBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] A lower-bound estimate of the number of rows currently in
    * the streaming buffer.
    */
  var estimatedRows: js.UndefOr[String] = js.native
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming
    * buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[String] = js.native
}

object SchemaStreamingbuffer {
  @scala.inline
  def apply(estimatedBytes: String = null, estimatedRows: String = null, oldestEntryTime: String = null): SchemaStreamingbuffer = {
    val __obj = js.Dynamic.literal()
    if (estimatedBytes != null) __obj.updateDynamic("estimatedBytes")(estimatedBytes.asInstanceOf[js.Any])
    if (estimatedRows != null) __obj.updateDynamic("estimatedRows")(estimatedRows.asInstanceOf[js.Any])
    if (oldestEntryTime != null) __obj.updateDynamic("oldestEntryTime")(oldestEntryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreamingbuffer]
  }
}

