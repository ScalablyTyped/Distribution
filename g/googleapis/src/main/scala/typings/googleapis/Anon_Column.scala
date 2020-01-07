package typings.googleapis

import typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Schema$ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Column extends js.Object {
  var column: js.UndefOr[Schema$ReportApiColumnSpec] = js.native
  var operator: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object Anon_Column {
  @scala.inline
  def apply(column: Schema$ReportApiColumnSpec = null, operator: String = null, values: js.Array[_] = null): Anon_Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Column]
  }
}

