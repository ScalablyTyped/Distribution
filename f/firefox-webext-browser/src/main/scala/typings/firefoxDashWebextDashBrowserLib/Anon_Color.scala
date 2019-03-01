package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /** The color of the contextual identity. */
  var color: java.lang.String
  /** The icon of the contextual identity. */
  var icon: java.lang.String
  /** The name of the contextual identity. */
  var name: java.lang.String
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String, icon: java.lang.String, name: java.lang.String): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Color]
  }
}

