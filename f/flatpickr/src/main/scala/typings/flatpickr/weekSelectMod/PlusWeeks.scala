package typings.flatpickr.weekSelectMod

import typings.flatpickr.globalsMod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlusWeeks extends js.Object {
  var weekEndDay: Date
  var weekStartDay: Date
}

object PlusWeeks {
  @scala.inline
  def apply(weekEndDay: Date, weekStartDay: Date): PlusWeeks = {
    val __obj = js.Dynamic.literal(weekEndDay = weekEndDay.asInstanceOf[js.Any], weekStartDay = weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWeeks]
  }
}

