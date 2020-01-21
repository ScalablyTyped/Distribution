package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  def `private`(key: String): String
  def shared(key: String): String
}

object AnonKey {
  @scala.inline
  def apply(`private`: String => String, shared: String => String): AnonKey = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[AnonKey]
  }
}

