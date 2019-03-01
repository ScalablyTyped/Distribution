package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorIcon extends js.Object {
  /** The color of the contextual identity. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** The icon of the contextual identity. */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the contextual identity. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorIcon {
  @scala.inline
  def apply(color: java.lang.String = null, icon: java.lang.String = null, name: java.lang.String = null): Anon_ColorIcon = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_ColorIcon]
  }
}

