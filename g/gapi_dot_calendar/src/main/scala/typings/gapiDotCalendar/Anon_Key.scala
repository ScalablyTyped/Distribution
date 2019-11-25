package typings.gapiDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  def `private`(key: String): String
  def shared(key: String): String
}

object Anon_Key {
  @scala.inline
  def apply(`private`: String => String, shared: String => String): Anon_Key = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[Anon_Key]
  }
}

