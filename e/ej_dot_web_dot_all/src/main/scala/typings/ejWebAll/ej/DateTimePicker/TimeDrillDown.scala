package typings.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeDrillDown extends js.Object {
  /** After choosing the time, the popup will close automatically if we set it as true, otherwise we focus out the DateTimePicker or choose timeNow button for closing the popup.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
  /** This is the field to show/hide the timeDrillDown in DateTimePicker.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Sets the interval time of minutes on selected date.
    */
  var interval: js.UndefOr[Double] = js.native
  /** Allows the user to show or hide the meridian with time in DateTimePicker.
    */
  var showMeridian: js.UndefOr[Boolean] = js.native
}

object TimeDrillDown {
  @scala.inline
  def apply(): TimeDrillDown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDrillDown]
  }
  @scala.inline
  implicit class TimeDrillDownOps[Self <: TimeDrillDown] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setShowMeridian(value: Boolean): Self = this.set("showMeridian", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeridian: Self = this.set("showMeridian", js.undefined)
  }
  
}

