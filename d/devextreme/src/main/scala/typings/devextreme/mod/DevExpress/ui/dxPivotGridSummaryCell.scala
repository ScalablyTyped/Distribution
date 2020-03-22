package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridSummaryCell extends js.Object {
  def child(direction: String, fieldValue: String): dxPivotGridSummaryCell = js.native
  /** Gets the child cell in a specified direction. */
  def child(direction: String, fieldValue: Double): dxPivotGridSummaryCell = js.native
  /** Gets all child cells in a specified direction. */
  def children(direction: String): js.Array[dxPivotGridSummaryCell] = js.native
  /** Gets a pivot grid field that corresponds to the summary cell. */
  def field(area: String): PivotGridDataSourceField = js.native
  /** Gets the Grand Total of the entire pivot grid. */
  def grandTotal(): dxPivotGridSummaryCell = js.native
  /** Gets a partial Grand Total cell of a row or column. */
  def grandTotal(direction: String): dxPivotGridSummaryCell = js.native
  def isPostProcessed(field: String): Boolean = js.native
  /** Indicates whether the summaryDisplayMode or calculateSummaryValue post-processed the summary value. */
  def isPostProcessed(field: PivotGridDataSourceField): Boolean = js.native
  /** Gets the cell next to the current one in a specified direction. */
  def next(direction: String): dxPivotGridSummaryCell = js.native
  /** Gets the cell next to current in a specified direction. */
  def next(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  /** Gets the parent cell in a specified direction. */
  def parent(direction: String): dxPivotGridSummaryCell = js.native
  /** Gets the cell prior to the current one in a specified direction. */
  def prev(direction: String): dxPivotGridSummaryCell = js.native
  /** Gets the cell previous to current in a specified direction. */
  def prev(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  def slice(field: PivotGridDataSourceField, value: String): dxPivotGridSummaryCell = js.native
  /** Gets the cell located by the path of the source cell with one field value changed. */
  def slice(field: PivotGridDataSourceField, value: Double): dxPivotGridSummaryCell = js.native
  /** Gets the summary cell value. */
  def value(): js.Any = js.native
  def value(field: String): js.Any = js.native
  def value(field: String, postProcessed: Boolean): js.Any = js.native
  /** Gets the value of any field associated with the summary cell. */
  def value(field: PivotGridDataSourceField): js.Any = js.native
  /** Gets the value of any field associated with the summary cell. */
  def value(field: PivotGridDataSourceField, postProcessed: Boolean): js.Any = js.native
  /** Gets the summary cell value. */
  def value(postProcessed: Boolean): js.Any = js.native
}

