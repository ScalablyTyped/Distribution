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

