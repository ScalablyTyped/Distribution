package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  var alpha: js.UndefOr[stdLib.Number] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
  var position: js.UndefOr[stdLib.Number] = js.undefined
}

object ColorStop {
  @scala.inline
  def apply(alpha: stdLib.Number = null, color: OpaqueColor = null, position: stdLib.Number = null): ColorStop = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (color != null) __obj.updateDynamic("color")(color)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ColorStop]
  }
}

