package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProperties extends js.Object {
  var gridProperties: js.UndefOr[GridProperties] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
  var sheetType: js.UndefOr[String] = js.undefined
  var tabColor: js.UndefOr[Color] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SheetProperties {
  @scala.inline
  def apply(
    gridProperties: GridProperties = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    sheetId: Int | Double = null,
    sheetType: String = null,
    tabColor: Color = null,
    title: String = null
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

