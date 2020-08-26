package typings.dwt.webTwainAcquireMod

import typings.dwt.anon.CurrentPageNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var bScanCompleted: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[String] = js.native
  var result: js.UndefOr[CurrentPageNum] = js.native
}

object Status {
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
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
    def setBScanCompleted(value: Boolean): Self = this.set("bScanCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBScanCompleted: Self = this.set("bScanCompleted", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setResult(value: CurrentPageNum): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

