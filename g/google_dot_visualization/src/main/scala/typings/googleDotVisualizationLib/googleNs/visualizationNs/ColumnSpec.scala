package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSpec extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[Properties] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var sourceColumn: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
  def calc(dataTable: DataTable, row: scala.Double): js.Any
}

object ColumnSpec {
  @scala.inline
  def apply(
    calc: (DataTable, scala.Double) => js.Any,
    `type`: java.lang.String,
    id: java.lang.String = null,
    label: java.lang.String = null,
    properties: Properties = null,
    role: java.lang.String = null,
    sourceColumn: scala.Int | scala.Double = null
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

