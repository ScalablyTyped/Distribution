package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSpec extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[Properties] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var sourceColumn: js.UndefOr[Double] = js.undefined
  var `type`: String
  def calc(dataTable: DataTable, row: Double): js.Any
}

object ColumnSpec {
  @scala.inline
  def apply(
    calc: (DataTable, Double) => js.Any,
    `type`: String,
    id: String = null,
    label: String = null,
    properties: Properties = null,
    role: String = null,
    sourceColumn: Int | Double = null
  ): ColumnSpec = {
    val __obj = js.Dynamic.literal(calc = js.Any.fromFunction2(calc))
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (role != null) __obj.updateDynamic("role")(role)
    if (sourceColumn != null) __obj.updateDynamic("sourceColumn")(sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSpec]
  }
}

