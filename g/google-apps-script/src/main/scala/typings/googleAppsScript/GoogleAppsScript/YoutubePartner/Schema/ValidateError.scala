package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateError extends js.Object {
  var columnName: js.UndefOr[String] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var messageCode: js.UndefOr[Double] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
}

object ValidateError {
  @scala.inline
  def apply(
    columnName: String = null,
    columnNumber: js.UndefOr[Double] = js.undefined,
    lineNumber: js.UndefOr[Double] = js.undefined,
    message: String = null,
    messageCode: js.UndefOr[Double] = js.undefined,
    severity: String = null
  ): ValidateError = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(messageCode)) __obj.updateDynamic("messageCode")(messageCode.get.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateError]
  }
}

