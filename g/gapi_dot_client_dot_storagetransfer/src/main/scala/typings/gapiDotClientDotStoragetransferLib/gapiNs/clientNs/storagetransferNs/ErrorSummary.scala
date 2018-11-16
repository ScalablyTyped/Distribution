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

