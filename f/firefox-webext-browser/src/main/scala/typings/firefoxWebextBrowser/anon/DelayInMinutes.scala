package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayInMinutes extends js.Object {
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[Double] = js.native
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[Double] = js.native
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[Double] = js.native
}

object DelayInMinutes {
  @scala.inline
  def apply(): DelayInMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayInMinutes]
  }
  @scala.inline
  implicit class DelayInMinutesOps[Self <: DelayInMinutes] (val x: Self) extends AnyVal {
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
    def setDelayInMinutes(value: Double): Self = this.set("delayInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayInMinutes: Self = this.set("delayInMinutes", js.undefined)
    @scala.inline
    def setPeriodInMinutes(value: Double): Self = this.set("periodInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodInMinutes: Self = this.set("periodInMinutes", js.undefined)
    @scala.inline
    def setWhen(value: Double): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

