package typings.electronNotarize.helpersMod

import typings.electronNotarize.electronNotarizeNumbers.`0`
import typings.electronNotarize.electronNotarizeNumbers.`2`
import typings.electronNotarize.electronNotarizeStrings.`in progress`
import typings.electronNotarize.electronNotarizeStrings.invalid
import typings.electronNotarize.electronNotarizeStrings.success
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotarizationInfo extends js.Object {
  var date: Date
  var logFileUrl: String | Null
  var status: invalid | (`in progress`) | success
  var statusCode: js.UndefOr[`0` | `2`] = js.undefined
  var statusMessage: js.UndefOr[String] = js.undefined
  var uuid: String
}

object NotarizationInfo {
  @scala.inline
  def apply(
    date: Date,
    status: invalid | (`in progress`) | success,
    uuid: String,
    logFileUrl: String = null,
    statusCode: `0` | `2` = null,
    statusMessage: String = null
  ): NotarizationInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], logFileUrl = logFileUrl.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizationInfo]
  }
}

