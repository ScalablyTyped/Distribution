package typings.devextreme.anon

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var alignment: js.UndefOr[center | left | right] = js.undefined
  var column: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.undefined
  var displayFormat: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var showInColumn: js.UndefOr[String] = js.undefined
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  var valueFormat: js.UndefOr[format] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    column: String = null,
    cssClass: String = null,
    customizeText: /* itemInfo */ Value => String = null,
    displayFormat: String = null,
    name: String = null,
    showInColumn: String = null,
    skipEmptyValues: js.UndefOr[Boolean] = js.undefined,
    summaryType: avg | count | custom | max | min | sum | String = null,
    valueFormat: format = null
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (showInColumn != null) __obj.updateDynamic("showInColumn")(showInColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyValues)) __obj.updateDynamic("skipEmptyValues")(skipEmptyValues.get.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

