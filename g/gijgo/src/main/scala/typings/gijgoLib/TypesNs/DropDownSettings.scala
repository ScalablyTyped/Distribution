package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var icons: js.UndefOr[DropDownIcons] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var selectedField: js.UndefOr[java.lang.String] = js.undefined
  var textField: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var valueField: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DropDownSettings {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ js.Any, _] = null,
    dataBound: js.Function1[/* e */ js.Any, _] = null,
    dataSource: js.Any = null,
    icons: DropDownIcons = null,
    iconsLibrary: java.lang.String = null,
    maxHeight: js.Any = null,
    placeholder: java.lang.String = null,
    selectedField: java.lang.String = null,
    textField: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    valueField: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (selectedField != null) __obj.updateDynamic("selectedField")(selectedField)
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownSettings]
  }
}

