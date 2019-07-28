package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.GadgetDisplayMode
import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Display extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.native
  var height: integer = js.native
  var iconLink: String = js.native
  var link: String = js.native
  @JSName("preferences")
  var preferences_Original: Fn_KeyString = js.native
  var title: String = js.native
  var `type`: String = js.native
  var width: integer = js.native
  def preferences(key: String): String = js.native
}

