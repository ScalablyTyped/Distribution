package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProperties extends js.Object {
  var gridProperties: js.UndefOr[GridProperties] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  var sheetType: js.UndefOr[java.lang.String] = js.undefined
  var tabColor: js.UndefOr[Color] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SheetProperties {
  @scala.inline
  def apply(
    gridProperties: GridProperties = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    rightToLeft: js.UndefOr[scala.Boolean] = js.undefined,
    sheetId: scala.Int | scala.Double = null,
    sheetType: java.lang.String = null,
    tabColor: Color = null,
    title: java.lang.String = null
  ): SheetProperties = {
    val __obj = js.Dynamic.literal()
    if (gridProperties != null) __obj.updateDynamic("gridProperties")(gridProperties)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (sheetType != null) __obj.updateDynamic("sheetType")(sheetType)
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SheetProperties]
  }
}

