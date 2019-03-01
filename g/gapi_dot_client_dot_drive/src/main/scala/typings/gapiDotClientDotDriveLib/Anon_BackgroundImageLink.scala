package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundImageLink extends js.Object {
  /** A link to this Team Drive theme's background image. */
  var backgroundImageLink: js.UndefOr[java.lang.String] = js.undefined
  /** The color of this Team Drive theme as an RGB hex string. */
  var colorRgb: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the theme. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundImageLink {
  @scala.inline
  def apply(
    backgroundImageLink: java.lang.String = null,
    colorRgb: java.lang.String = null,
    id: java.lang.String = null
  ): Anon_BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink)
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_BackgroundImageLink]
  }
}

