package typings.gapiClientCalendar.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  /**
    * The gadget's display mode. Optional. Possible values are:
    * - "icon" - The gadget displays next to the event's title in the calendar view.
    * - "chip" - The gadget displays when the event is clicked.
    */
  var display: js.UndefOr[String] = js.native
  /** The gadget's height in pixels. The height must be an integer greater than 0. Optional. */
  var height: js.UndefOr[Double] = js.native
  /** The gadget's icon URL. The URL scheme must be HTTPS. */
  var iconLink: js.UndefOr[String] = js.native
  /** The gadget's URL. The URL scheme must be HTTPS. */
  var link: js.UndefOr[String] = js.native
  /** Preferences. */
  var preferences: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.Display with TopLevel[js.Any]
  ] = js.native
  /** The gadget's title. */
  var title: js.UndefOr[String] = js.native
  /** The gadget's type. */
  var `type`: js.UndefOr[String] = js.native
  /** The gadget's width in pixels. The width must be an integer greater than 0. Optional. */
  var width: js.UndefOr[Double] = js.native
}

object Display {
  @scala.inline
  def apply(): Display = {
    val __obj = js.Dynamic.literal()
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setPreferences(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.gapiClientCalendar.gapiClientCalendarStrings.Display with TopLevel[js.Any]
    ): Self = this.set("preferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferences: Self = this.set("preferences", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

