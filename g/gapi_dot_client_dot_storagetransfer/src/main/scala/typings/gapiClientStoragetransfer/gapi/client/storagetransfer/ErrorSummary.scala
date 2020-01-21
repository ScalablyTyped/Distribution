package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorSummary extends js.Object {
  /** Required. */
  var errorCode: js.UndefOr[String] = js.undefined
  /**
    * Count of this type of error.
    * Required.
    */
  var errorCount: js.UndefOr[String] = js.undefined
  /** Error samples. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.undefined
}

object ErrorSummary {
  @scala.inline
  def apply(
    errorCode: String = null,
    errorCount: String = null,
    errorLogEntries: js.Array[ErrorLogEntry] = null
  ): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (errorLogEntries != null) __obj.updateDynamic("errorLogEntries")(errorLogEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSummary]
  }
}

