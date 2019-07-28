package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapGridViewBatchEditApi")
@js.native
class BootstrapGridViewBatchEditApi protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  def addNewRow(): Unit = js.native
  def deleteRow(visibleIndex: Double): Unit = js.native
  def deleteRowByKey(key: js.Any): Unit = js.native
  def endEdit(): Unit = js.native
  def getCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  def getCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  def getColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  def getDeletedRowIndices(): js.Array[Double] = js.native
  def getEditCellInfo(): BootstrapGridViewCellInfo | Null = js.native
  def getInsertedRowIndices(): js.Array[Double] = js.native
  def getRowVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  def hasChanges(): Boolean = js.native
  def isDeletedRow(visibleIndex: Double): Boolean = js.native
  def isNewRow(visibleIndex: Double): Boolean = js.native
  def moveFocusBackward(): Boolean = js.native
  def moveFocusForward(): Boolean = js.native
  def recoverRow(visibleIndex: Double): Unit = js.native
  def recoverRowByKey(key: js.Any): Unit = js.native
  def resetChanges(visibleIndex: Double): Unit = js.native
  def resetChanges(visibleIndex: Double, columnIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Any): Unit = js.native
  def setCellValue(
    visibleIndex: Double,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def startEdit(visibleIndex: Double, columnIndex: Double): Unit = js.native
  def validateRow(visibleIndex: Double): Boolean = js.native
  def validateRows(validateOnlyModified: Boolean): Boolean = js.native
}

