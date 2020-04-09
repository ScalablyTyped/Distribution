package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridSummaryCell extends js.Object {
  def child(direction: String, fieldValue: String): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.child(direction, fieldValue) */
  def child(direction: String, fieldValue: Double): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.children(direction) */
  def children(direction: String): js.Array[dxPivotGridSummaryCell] = js.native
  /** @name dxPivotGridSummaryCell.field(area) */
  def field(area: String): PivotGridDataSourceField = js.native
  /** @name dxPivotGridSummaryCell.grandTotal() */
  def grandTotal(): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.grandTotal(direction) */
  def grandTotal(direction: String): dxPivotGridSummaryCell = js.native
  def isPostProcessed(field: String): Boolean = js.native
  /** @name dxPivotGridSummaryCell.isPostProcessed(field) */
  def isPostProcessed(field: PivotGridDataSourceField): Boolean = js.native
  /** @name dxPivotGridSummaryCell.next(direction) */
  def next(direction: String): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.next(direction, allowCrossGroup) */
  def next(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.parent(direction) */
  def parent(direction: String): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.prev(direction) */
  def prev(direction: String): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.prev(direction, allowCrossGroup) */
  def prev(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  def slice(field: PivotGridDataSourceField, value: String): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.slice(field, value) */
  def slice(field: PivotGridDataSourceField, value: Double): dxPivotGridSummaryCell = js.native
  /** @name dxPivotGridSummaryCell.value() */
  def value(): js.Any = js.native
  def value(field: String): js.Any = js.native
  def value(field: String, postProcessed: Boolean): js.Any = js.native
  /** @name dxPivotGridSummaryCell.value(field) */
  def value(field: PivotGridDataSourceField): js.Any = js.native
  /** @name dxPivotGridSummaryCell.value(field, postProcessed) */
  def value(field: PivotGridDataSourceField, postProcessed: Boolean): js.Any = js.native
  /** @name dxPivotGridSummaryCell.value(postProcessed) */
  def value(postProcessed: Boolean): js.Any = js.native
}

