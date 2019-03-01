package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLogEntry extends js.Object {
  /** A list of messages that carry the error details. */
  var errorDetails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A URL that refers to the target (a data source, a data sink,
    * or an object) with which the error is associated.
    * Required.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorLogEntry {
  @scala.inline
  def apply(errorDetails: js.Array[java.lang.String] = null, url: java.lang.String = null): ErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ErrorLogEntry]
  }
}

