package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFieldEnabled extends js.Object {
  var dataField: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
}

object DataFieldEnabled {
  @scala.inline
  def apply(
    dataField: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: typings.devextreme.mod.DevExpress.viz.Font = null
  ): DataFieldEnabled = {
    val __obj = js.Dynamic.literal()
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFieldEnabled]
  }
}

