package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Display extends js.Object {
  /**
    * The gadget's display mode. Optional. Possible values are:
    * - "icon" - The gadget displays next to the event's title in the calendar view.
    * - "chip" - The gadget displays when the event is clicked.
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /** The gadget's height in pixels. The height must be an integer greater than 0. Optional. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The gadget's icon URL. The URL scheme must be HTTPS. */
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  /** The gadget's URL. The URL scheme must be HTTPS. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** Preferences. */
  var preferences: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The gadget's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The gadget's type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The gadget's width in pixels. The width must be an integer greater than 0. Optional. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Display {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    iconLink: java.lang.String = null,
    link: java.lang.String = null,
    preferences: stdLib.Record[java.lang.String, java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_Display = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink)
    if (link != null) __obj.updateDynamic("link")(link)
    if (preferences != null) __obj.updateDynamic("preferences")(preferences)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Display]
  }
}

