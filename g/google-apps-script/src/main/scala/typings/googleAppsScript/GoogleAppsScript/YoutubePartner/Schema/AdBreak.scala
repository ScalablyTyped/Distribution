package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBreak extends js.Object {
  var midrollSeconds: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var slot: js.UndefOr[js.Array[AdSlot]] = js.native
}

object AdBreak {
  @scala.inline
  def apply(): AdBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBreak]
  }
  @scala.inline
  implicit class AdBreakOps[Self <: AdBreak] (val x: Self) extends AnyVal {
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
    def setMidrollSeconds(value: Double): Self = this.set("midrollSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidrollSeconds: Self = this.set("midrollSeconds", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSlotVarargs(value: AdSlot*): Self = this.set("slot", js.Array(value :_*))
    @scala.inline
    def setSlot(value: js.Array[AdSlot]): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
  }
  
}

