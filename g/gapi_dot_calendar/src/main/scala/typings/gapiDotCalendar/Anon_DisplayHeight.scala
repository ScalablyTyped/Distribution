package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiDotCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayHeight extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  var height: js.UndefOr[integer] = js.undefined
  var iconLink: String
  var link: String
  var title: String
  var `type`: String
  var width: js.UndefOr[integer] = js.undefined
  def preferences(key: String): String
}

object Anon_DisplayHeight {
  @scala.inline
  def apply(
    iconLink: String,
    link: String,
    preferences: String => String,
    title: String,
    `type`: String,
    display: GadgetDisplayMode = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): Anon_DisplayHeight = {
    val __obj = js.Dynamic.literal(iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayHeight]
  }
}

