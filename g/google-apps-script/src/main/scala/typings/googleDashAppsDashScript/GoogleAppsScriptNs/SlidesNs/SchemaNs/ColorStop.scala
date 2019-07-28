package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object ColorStop {
  @scala.inline
  def apply(alpha: Int | Double = null, color: OpaqueColor = null, position: Int | Double = null): ColorStop = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStop]
  }
}

