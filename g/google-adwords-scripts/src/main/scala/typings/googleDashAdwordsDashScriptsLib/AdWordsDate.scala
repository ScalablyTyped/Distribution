package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Types
trait AdWordsDate extends js.Object {
  var day: scala.Double
  var month: scala.Double
  var year: scala.Double
}

object AdWordsDate {
  @scala.inline
  def apply(day: scala.Double, month: scala.Double, year: scala.Double): AdWordsDate = {
    val __obj = js.Dynamic.literal(day = day, month = month, year = year)
  
    __obj.asInstanceOf[AdWordsDate]
  }
}

