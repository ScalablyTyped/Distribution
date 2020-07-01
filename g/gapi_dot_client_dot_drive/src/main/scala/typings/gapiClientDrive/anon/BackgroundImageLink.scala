package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundImageLink extends js.Object {
  /** Deprecated - use driveThemes/backgroundImageLink instead. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  /** Deprecated - use driveThemes/colorRgb instead. */
  var colorRgb: js.UndefOr[String] = js.undefined
  /** Deprecated - use driveThemes/id instead. */
  var id: js.UndefOr[String] = js.undefined
}

object BackgroundImageLink {
  @scala.inline
  def apply(backgroundImageLink: String = null, colorRgb: String = null, id: String = null): BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageLink]
  }
}

