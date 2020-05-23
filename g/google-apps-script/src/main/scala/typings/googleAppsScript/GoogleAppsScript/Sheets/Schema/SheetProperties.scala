package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    index: js.UndefOr[Double] = js.undefined,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined,
    sheetType: String = null,
    tabColor: Color = null,
    title: String = null
  ): SheetProperties = {
    val __obj = js.Dynamic.literal()
    if (gridProperties != null) __obj.updateDynamic("gridProperties")(gridProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (sheetType != null) __obj.updateDynamic("sheetType")(sheetType.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProperties]
  }
}

