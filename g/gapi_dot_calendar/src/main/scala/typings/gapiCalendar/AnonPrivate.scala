package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  def `private`(key: String): String
  def shared(key: String): String
}

object AnonPrivate {
  @scala.inline
  def apply(`private`: String => String, shared: String => String): AnonPrivate = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[AnonPrivate]
  }
}

