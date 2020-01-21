package typings.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundImageLink extends js.Object {
  /** A link to this Team Drive theme's background image. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  /** The color of this Team Drive theme as an RGB hex string. */
  var colorRgb: js.UndefOr[String] = js.undefined
  /** The ID of the theme. */
  var id: js.UndefOr[String] = js.undefined
}

object AnonBackgroundImageLink {
  @scala.inline
  def apply(backgroundImageLink: String = null, colorRgb: String = null, id: String = null): AnonBackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundImageLink]
  }
}

