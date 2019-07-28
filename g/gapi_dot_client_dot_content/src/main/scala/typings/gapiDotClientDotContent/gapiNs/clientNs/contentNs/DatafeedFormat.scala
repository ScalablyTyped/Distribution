package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFormat extends js.Object {
  /**
    * Delimiter for the separation of values in a delimiter-separated values feed. If not specified, the delimiter will be auto-detected. Ignored for non-DSV
    * data feeds.
    */
  var columnDelimiter: js.UndefOr[String] = js.undefined
  /** Character encoding scheme of the data feed. If not specified, the encoding will be auto-detected. */
  var fileEncoding: js.UndefOr[String] = js.undefined
  /** Specifies how double quotes are interpreted. If not specified, the mode will be auto-detected. Ignored for non-DSV data feeds. */
  var quotingMode: js.UndefOr[String] = js.undefined
}

object DatafeedFormat {
  @scala.inline
  def apply(columnDelimiter: String = null, fileEncoding: String = null, quotingMode: String = null): DatafeedFormat = {
    val __obj = js.Dynamic.literal()
    if (columnDelimiter != null) __obj.updateDynamic("columnDelimiter")(columnDelimiter)
    if (fileEncoding != null) __obj.updateDynamic("fileEncoding")(fileEncoding)
    if (quotingMode != null) __obj.updateDynamic("quotingMode")(quotingMode)
    __obj.asInstanceOf[DatafeedFormat]
  }
}

