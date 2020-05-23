package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllFields extends js.Object {
  var allFields: js.UndefOr[String] = js.undefined
  var columnFields: js.UndefOr[String] = js.undefined
  var dataFields: js.UndefOr[String] = js.undefined
  var filterFields: js.UndefOr[String] = js.undefined
  var rowFields: js.UndefOr[String] = js.undefined
}

object AllFields {
  @scala.inline
  def apply(
    allFields: String = null,
    columnFields: String = null,
    dataFields: String = null,
    filterFields: String = null,
    rowFields: String = null
  ): AllFields = {
    val __obj = js.Dynamic.literal()
    if (allFields != null) __obj.updateDynamic("allFields")(allFields.asInstanceOf[js.Any])
    if (columnFields != null) __obj.updateDynamic("columnFields")(columnFields.asInstanceOf[js.Any])
    if (dataFields != null) __obj.updateDynamic("dataFields")(dataFields.asInstanceOf[js.Any])
    if (filterFields != null) __obj.updateDynamic("filterFields")(filterFields.asInstanceOf[js.Any])
    if (rowFields != null) __obj.updateDynamic("rowFields")(rowFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFields]
  }
}

