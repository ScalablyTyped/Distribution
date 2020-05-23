package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFieldArea extends js.Object {
  var columnFieldArea: js.UndefOr[String] = js.undefined
  var dataFieldArea: js.UndefOr[String] = js.undefined
  var filterFieldArea: js.UndefOr[String] = js.undefined
  var rowFieldArea: js.UndefOr[String] = js.undefined
}

object ColumnFieldArea {
  @scala.inline
  def apply(
    columnFieldArea: String = null,
    dataFieldArea: String = null,
    filterFieldArea: String = null,
    rowFieldArea: String = null
  ): ColumnFieldArea = {
    val __obj = js.Dynamic.literal()
    if (columnFieldArea != null) __obj.updateDynamic("columnFieldArea")(columnFieldArea.asInstanceOf[js.Any])
    if (dataFieldArea != null) __obj.updateDynamic("dataFieldArea")(dataFieldArea.asInstanceOf[js.Any])
    if (filterFieldArea != null) __obj.updateDynamic("filterFieldArea")(filterFieldArea.asInstanceOf[js.Any])
    if (rowFieldArea != null) __obj.updateDynamic("rowFieldArea")(rowFieldArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFieldArea]
  }
}

