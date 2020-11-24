package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait standardSettings extends js.Object {
  
  var AM: js.Array[String] = js.native
  
  var PM: js.Array[String] = js.native
  
  var days: daySettings = js.native
  
  var firstDay: Double = js.native
  
  var months: monthSettings = js.native
  
  var patterns: patternSettings = js.native
  
  var twoDigitYearMax: Double = js.native
}
object standardSettings {
  
  @scala.inline
  def apply(
    AM: js.Array[String],
    PM: js.Array[String],
    days: daySettings,
    firstDay: Double,
    months: monthSettings,
    patterns: patternSettings,
    twoDigitYearMax: Double
  ): standardSettings = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[standardSettings]
  }
  
  @scala.inline
  implicit class standardSettingsOps[Self <: standardSettings] (val x: Self) extends AnyVal {
    
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
    def setAMVarargs(value: String*): Self = this.set("AM", js.Array(value :_*))
    
    @scala.inline
    def setAM(value: js.Array[String]): Self = this.set("AM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPMVarargs(value: String*): Self = this.set("PM", js.Array(value :_*))
    
    @scala.inline
    def setPM(value: js.Array[String]): Self = this.set("PM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: daySettings): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: monthSettings): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: patternSettings): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = this.set("twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
