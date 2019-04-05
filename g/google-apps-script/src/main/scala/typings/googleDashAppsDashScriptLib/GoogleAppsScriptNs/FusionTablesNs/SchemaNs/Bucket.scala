package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[stdLib.Number] = js.undefined
  var min: js.UndefOr[stdLib.Number] = js.undefined
  var opacity: js.UndefOr[stdLib.Number] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    icon: java.lang.String = null,
    max: stdLib.Number = null,
    min: stdLib.Number = null,
    opacity: stdLib.Number = null,
    weight: scala.Int | scala.Double = null
  ): Bucket = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

