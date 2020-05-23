package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Private extends js.Object {
  def `private`(key: String): String
  def shared(key: String): String
}

object Private {
  @scala.inline
  def apply(`private`: String => String, shared: String => String): Private = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[Private]
  }
}

