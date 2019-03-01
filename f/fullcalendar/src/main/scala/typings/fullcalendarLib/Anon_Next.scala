package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: java.lang.String
  var nextYear: java.lang.String
  var prev: java.lang.String
  var prevYear: java.lang.String
}

object Anon_Next {
  @scala.inline
  def apply(
    next: java.lang.String,
    nextYear: java.lang.String,
    prev: java.lang.String,
    prevYear: java.lang.String
  ): Anon_Next = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextYear")(nextYear)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("prevYear")(prevYear)
    __obj.asInstanceOf[Anon_Next]
  }
}

