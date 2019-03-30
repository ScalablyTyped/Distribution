package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderProperties extends js.Object {
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  var tableBorderFill: js.UndefOr[TableBorderFill] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object TableBorderProperties {
  @scala.inline
  def apply(
    dashStyle: java.lang.String = null,
    tableBorderFill: TableBorderFill = null,
    weight: Dimension = null
  ): TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (tableBorderFill != null) __obj.updateDynamic("tableBorderFill")(tableBorderFill)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[TableBorderProperties]
  }
}

