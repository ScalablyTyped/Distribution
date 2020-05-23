package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  var height: js.UndefOr[integer] = js.undefined
  var iconLink: String
  var link: String
  var title: String
  var `type`: String
  var width: js.UndefOr[integer] = js.undefined
  def preferences(key: String): String
}

object Height {
  @scala.inline
  def apply(
    iconLink: String,
    link: String,
    preferences: String => String,
    title: String,
    `type`: String,
    display: GadgetDisplayMode = null,
    height: js.UndefOr[integer] = js.undefined,
    width: js.UndefOr[integer] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal(iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

