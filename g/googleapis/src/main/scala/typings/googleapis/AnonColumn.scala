package typings.googleapis

import typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn extends js.Object {
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.native
  var operator: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object AnonColumn {
  @scala.inline
  def apply(column: SchemaReportApiColumnSpec = null, operator: String = null, values: js.Array[_] = null): AnonColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

