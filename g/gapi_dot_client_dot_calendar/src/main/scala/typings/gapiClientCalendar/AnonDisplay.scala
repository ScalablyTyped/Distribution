package typings.gapiClientCalendar

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplay extends js.Object {
  /**
    * The gadget's display mode. Optional. Possible values are:
    * - "icon" - The gadget displays next to the event's title in the calendar view.
    * - "chip" - The gadget displays when the event is clicked.
    */
  var display: js.UndefOr[String] = js.undefined
  /** The gadget's height in pixels. The height must be an integer greater than 0. Optional. */
  var height: js.UndefOr[Double] = js.undefined
  /** The gadget's icon URL. The URL scheme must be HTTPS. */
  var iconLink: js.UndefOr[String] = js.undefined
  /** The gadget's URL. The URL scheme must be HTTPS. */
  var link: js.UndefOr[String] = js.undefined
  /** Preferences. */
  var preferences: js.UndefOr[Record[String, String]] = js.undefined
  /** The gadget's title. */
  var title: js.UndefOr[String] = js.undefined
  /** The gadget's type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The gadget's width in pixels. The width must be an integer greater than 0. Optional. */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonDisplay {
  @scala.inline
  def apply(
    display: String = null,
    height: Int | Double = null,
    iconLink: String = null,
    link: String = null,
    preferences: Record[String, String] = null,
    title: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): AnonDisplay = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (preferences != null) __obj.updateDynamic("preferences")(preferences.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplay]
  }
}

