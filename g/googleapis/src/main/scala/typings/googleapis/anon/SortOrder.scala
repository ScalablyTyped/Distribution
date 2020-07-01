package typings.googleapis.anon

import typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOrder extends js.Object {
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.native
  var sortOrder: js.UndefOr[String] = js.native
}

object SortOrder {
  @scala.inline
  def apply(column: SchemaReportApiColumnSpec = null, sortOrder: String = null): SortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOrder]
  }
}

