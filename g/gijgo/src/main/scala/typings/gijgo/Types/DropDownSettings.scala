package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var icons: js.UndefOr[DropDownIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var selectedField: js.UndefOr[String] = js.undefined
  var textField: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var valueField: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DropDownSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => _ = null,
    dataBound: /* e */ js.Any => _ = null,
    dataSource: js.Any = null,
    icons: DropDownIcons = null,
    iconsLibrary: String = null,
    maxHeight: js.Any = null,
    placeholder: String = null,
    selectedField: String = null,
    textField: String = null,
    uiLibrary: String = null,
    valueField: String = null,
    width: Int | Double = null
  ): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
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

