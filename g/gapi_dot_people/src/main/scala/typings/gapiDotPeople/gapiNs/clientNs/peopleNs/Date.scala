package typings.gapiDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var day: Double
  var month: Double
  var year: Double
}

object Date {
  @scala.inline
  def apply(day: Double, month: Double, year: Double): Date = {
    val __obj = js.Dynamic.literal(day = day, month = month, year = year)
  
    __obj.asInstanceOf[Date]
  }
}

