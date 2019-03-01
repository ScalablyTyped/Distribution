package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorSummary extends js.Object {
  /** Required. */
  var errorCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Count of this type of error.
    * Required.
    */
  var errorCount: js.UndefOr[java.lang.String] = js.undefined
  /** Error samples. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.undefined
}

object ErrorSummary {
  @scala.inline
  def apply(
    errorCode: java.lang.String = null,
    errorCount: java.lang.String = null,
    errorLogEntries: js.Array[ErrorLogEntry] = null
  ): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount)
    if (errorLogEntries != null) __obj.updateDynamic("errorLogEntries")(errorLogEntries)
    __obj.asInstanceOf[ErrorSummary]
  }
}

