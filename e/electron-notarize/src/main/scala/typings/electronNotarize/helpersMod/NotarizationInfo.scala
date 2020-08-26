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

@js.native
trait NotarizationInfo extends js.Object {
  var date: Date = js.native
  var logFileUrl: String | Null = js.native
  var status: invalid | (`in progress`) | success = js.native
  var statusCode: js.UndefOr[`0` | `2`] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var uuid: String = js.native
}

object NotarizationInfo {
  @scala.inline
  def apply(date: Date, status: invalid | (`in progress`) | success, uuid: String): NotarizationInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizationInfo]
  }
  @scala.inline
  implicit class NotarizationInfoOps[Self <: NotarizationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: invalid | (`in progress`) | success): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogFileUrl(value: String): Self = this.set("logFileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogFileUrlNull: Self = this.set("logFileUrl", null)
    @scala.inline
    def setStatusCode(value: `0` | `2`): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
  
}

