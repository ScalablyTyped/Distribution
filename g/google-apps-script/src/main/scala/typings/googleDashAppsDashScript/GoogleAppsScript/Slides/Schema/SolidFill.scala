package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolidFill extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
}

object SolidFill {
  @scala.inline
  def apply(alpha: Int | Double = null, color: OpaqueColor = null): SolidFill = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[SolidFill]
  }
}

