package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataFieldEnabled extends js.Object {
  var dataField: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
}

object AnonDataFieldEnabled {
  @scala.inline
  def apply(dataField: String = null, enabled: js.UndefOr[Boolean] = js.undefined, font: Font = null): AnonDataFieldEnabled = {
    val __obj = js.Dynamic.literal()
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataFieldEnabled]
  }
}

