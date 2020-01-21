package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait standardSettings extends js.Object {
  var AM: js.Array[String]
  var PM: js.Array[String]
  var days: daySettings
  var firstDay: Double
  var months: monthSettings
  var patterns: patternSettings
  var twoDigitYearMax: Double
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
}

