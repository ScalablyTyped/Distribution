package typings.googleapis

import typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSortOrder extends js.Object {
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.native
  var sortOrder: js.UndefOr[String] = js.native
}

object AnonSortOrder {
  @scala.inline
  def apply(column: SchemaReportApiColumnSpec = null, sortOrder: String = null): AnonSortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortOrder]
  }
}

