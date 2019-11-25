package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiDotCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Display extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  var height: integer
  var iconLink: String
  var link: String
  var title: String
  var `type`: String
  var width: integer
  def preferences(key: String): String
}

object Anon_Display {
  @scala.inline
  def apply(
    height: integer,
    iconLink: String,
    link: String,
    preferences: String => String,
    title: String,
    `type`: String,
    width: integer,
    display: GadgetDisplayMode = null
  ): Anon_Display = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Display]
  }
}

