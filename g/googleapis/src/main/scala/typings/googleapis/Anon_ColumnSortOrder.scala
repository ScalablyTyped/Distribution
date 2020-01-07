package typings.googleapis

import typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Schema$ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ColumnSortOrder extends js.Object {
  var column: js.UndefOr[Schema$ReportApiColumnSpec] = js.native
  var sortOrder: js.UndefOr[String] = js.native
}

object Anon_ColumnSortOrder {
  @scala.inline
  def apply(column: Schema$ReportApiColumnSpec = null, sortOrder: String = null): Anon_ColumnSortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnSortOrder]
  }
}

