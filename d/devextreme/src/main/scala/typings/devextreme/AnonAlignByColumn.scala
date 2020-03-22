package typings.devextreme

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignByColumn extends js.Object {
  var alignByColumn: js.UndefOr[Boolean] = js.undefined
  var column: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ AnonValue, String]] = js.undefined
  var displayFormat: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var showInColumn: js.UndefOr[String] = js.undefined
  var showInGroupFooter: js.UndefOr[Boolean] = js.undefined
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  var valueFormat: js.UndefOr[format] = js.undefined
}

object AnonAlignByColumn {
  @scala.inline
  def apply(
    alignByColumn: js.UndefOr[Boolean] = js.undefined,
    column: String = null,
    customizeText: /* itemInfo */ AnonValue => String = null,
    displayFormat: String = null,
    name: String = null,
    showInColumn: String = null,
    showInGroupFooter: js.UndefOr[Boolean] = js.undefined,
    skipEmptyValues: js.UndefOr[Boolean] = js.undefined,
    summaryType: avg | count | custom | max | min | sum | String = null,
    valueFormat: format = null
  ): AnonAlignByColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignByColumn)) __obj.updateDynamic("alignByColumn")(alignByColumn.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (showInColumn != null) __obj.updateDynamic("showInColumn")(showInColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(showInGroupFooter)) __obj.updateDynamic("showInGroupFooter")(showInGroupFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyValues)) __obj.updateDynamic("skipEmptyValues")(skipEmptyValues.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignByColumn]
  }
}

