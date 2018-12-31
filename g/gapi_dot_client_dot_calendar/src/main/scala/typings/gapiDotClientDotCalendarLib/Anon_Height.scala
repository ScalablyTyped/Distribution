package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
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

