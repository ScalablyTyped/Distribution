package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.ScopeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: ScopeType
  var value: String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: ScopeType, value: String): Anon_Type = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

