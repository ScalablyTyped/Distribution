package typings.googleAdwordsScripts

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
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdWordsDate]
  }
}

