package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Types
trait AdWordsDate extends js.Object {
  var day: Double
  var month: Double
  var year: Double
}

object AdWordsDate {
  @scala.inline
  def apply(day: Double, month: Double, year: Double): AdWordsDate = {
    val __obj = js.Dynamic.literal(day = day, month = month, year = year)
  
    __obj.asInstanceOf[AdWordsDate]
  }
}

