package typings.firefoxWebextBrowser.browser.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided). Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the alarm recurs repeatedly after that many minutes.
  */
@js.native
trait CreateAlarmInfo extends js.Object {
  
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[Double] = js.native
  
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[Double] = js.native
  
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[Double] = js.native
}
object CreateAlarmInfo {
  
  @scala.inline
  def apply(): CreateAlarmInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAlarmInfo]
  }
  
  @scala.inline
  implicit class CreateAlarmInfoOps[Self <: CreateAlarmInfo] (val x: Self) extends AnyVal {
    
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
