package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMapping extends js.Object {
  var dataField: js.UndefOr[String] = js.undefined
  var totalRecordsField: js.UndefOr[String] = js.undefined
}

object GridMapping {
  @scala.inline
  def apply(dataField: String = null, totalRecordsField: String = null): GridMapping = {
    val __obj = js.Dynamic.literal()
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (totalRecordsField != null) __obj.updateDynamic("totalRecordsField")(totalRecordsField.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridMapping]
  }
}

