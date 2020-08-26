package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  var display: js.UndefOr[GadgetDisplayMode] = js.native
  var height: integer = js.native
  var iconLink: String = js.native
  var link: String = js.native
  var title: String = js.native
  var `type`: String = js.native
  var width: integer = js.native
  def preferences(key: String): String = js.native
}

object Display {
  @scala.inline
  def apply(
    height: integer,
    iconLink: String,
    link: String,
    preferences: String => String,
    title: String,
    `type`: String,
    width: integer
  ): Display = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  @scala.inline
  implicit class DisplayOps[Self <: Display] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferences(value: String => String): Self = this.set("preferences", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: GadgetDisplayMode): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

