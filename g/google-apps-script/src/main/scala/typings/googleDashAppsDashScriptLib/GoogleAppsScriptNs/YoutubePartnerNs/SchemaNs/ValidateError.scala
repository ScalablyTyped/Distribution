package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateError extends js.Object {
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var messageCode: js.UndefOr[scala.Double] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
}

object ValidateError {
  @scala.inline
  def apply(
    columnName: java.lang.String = null,
    columnNumber: scala.Int | scala.Double = null,
    lineNumber: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    messageCode: scala.Int | scala.Double = null,
    severity: java.lang.String = null
  ): ValidateError = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageCode != null) __obj.updateDynamic("messageCode")(messageCode.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity)
    __obj.asInstanceOf[ValidateError]
  }
}

