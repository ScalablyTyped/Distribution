package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLogEntry extends js.Object {
  /** A list of messages that carry the error details. */
  var errorDetails: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A URL that refers to the target (a data source, a data sink,
    * or an object) with which the error is associated.
    * Required.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ErrorLogEntry {
  @scala.inline
  def apply(errorDetails: js.Array[String] = null, url: String = null): ErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLogEntry]
  }
}

