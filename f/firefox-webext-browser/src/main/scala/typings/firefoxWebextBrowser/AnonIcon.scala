package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  /** The color of the contextual identity. */
  var color: js.UndefOr[String] = js.undefined
  /** The icon of the contextual identity. */
  var icon: js.UndefOr[String] = js.undefined
  /** The name of the contextual identity. */
  var name: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(color: String = null, icon: String = null, name: String = null): AnonIcon = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

