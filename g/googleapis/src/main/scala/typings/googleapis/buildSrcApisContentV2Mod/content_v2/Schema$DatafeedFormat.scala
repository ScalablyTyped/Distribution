package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DatafeedFormat extends js.Object {
  /**
    * Delimiter for the separation of values in a delimiter-separated values
    * feed. If not specified, the delimiter will be auto-detected. Ignored for
    * non-DSV data feeds.
    */
  var columnDelimiter: js.UndefOr[String] = js.native
  /**
    * Character encoding scheme of the data feed. If not specified, the
    * encoding will be auto-detected.
    */
  var fileEncoding: js.UndefOr[String] = js.native
  /**
    * Specifies how double quotes are interpreted. If not specified, the mode
    * will be auto-detected. Ignored for non-DSV data feeds.
    */
  var quotingMode: js.UndefOr[String] = js.native
}

object Schema$DatafeedFormat {
  @scala.inline
  def apply(columnDelimiter: String = null, fileEncoding: String = null, quotingMode: String = null): Schema$DatafeedFormat = {
    val __obj = js.Dynamic.literal()
    if (columnDelimiter != null) __obj.updateDynamic("columnDelimiter")(columnDelimiter.asInstanceOf[js.Any])
    if (fileEncoding != null) __obj.updateDynamic("fileEncoding")(fileEncoding.asInstanceOf[js.Any])
    if (quotingMode != null) __obj.updateDynamic("quotingMode")(quotingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatafeedFormat]
  }
}

