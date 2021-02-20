package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait standardSettings extends StObject {
  
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
  implicit class standardSettingsMutableBuilder[Self <: standardSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAM(value: js.Array[String]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAMVarargs(value: String*): Self = StObject.set(x, "AM", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: daySettings): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: monthSettings): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPM(value: js.Array[String]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPMVarargs(value: String*): Self = StObject.set(x, "PM", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: patternSettings): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
