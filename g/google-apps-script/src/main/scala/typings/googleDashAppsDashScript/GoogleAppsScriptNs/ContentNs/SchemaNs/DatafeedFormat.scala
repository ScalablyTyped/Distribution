package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFormat extends js.Object {
  var columnDelimiter: js.UndefOr[String] = js.undefined
  var fileEncoding: js.UndefOr[String] = js.undefined
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

