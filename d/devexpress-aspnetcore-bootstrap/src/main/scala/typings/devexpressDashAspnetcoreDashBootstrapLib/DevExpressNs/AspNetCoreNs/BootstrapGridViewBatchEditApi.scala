package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapGridViewBatchEditApi")
@js.native
class BootstrapGridViewBatchEditApi protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  def addNewRow(): scala.Unit = js.native
  def deleteRow(visibleIndex: scala.Double): scala.Unit = js.native
  def deleteRowByKey(key: js.Any): scala.Unit = js.native
  def endEdit(): scala.Unit = js.native
  def getCellTextContainer(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): js.Any = js.native
  def getCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String, initial: scala.Boolean): js.Any = js.native
  def getColumnDisplayText(columnFieldNameOrId: java.lang.String, value: js.Any): java.lang.String = js.native
  def getDeletedRowIndices(): js.Array[scala.Double] = js.native
  def getEditCellInfo(): BootstrapGridViewCellInfo | scala.Null = js.native
  def getInsertedRowIndices(): js.Array[scala.Double] = js.native
  def getRowVisibleIndices(includeDeleted: scala.Boolean): js.Array[scala.Double] = js.native
  def hasChanges(): scala.Boolean = js.native
  def isDeletedRow(visibleIndex: scala.Double): scala.Boolean = js.native
  def isNewRow(visibleIndex: scala.Double): scala.Boolean = js.native
  def moveFocusBackward(): scala.Boolean = js.native
  def moveFocusForward(): scala.Boolean = js.native
  def recoverRow(visibleIndex: scala.Double): scala.Unit = js.native
  def recoverRowByKey(key: js.Any): scala.Unit = js.native
  def resetChanges(visibleIndex: scala.Double): scala.Unit = js.native
  def resetChanges(visibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String, value: js.Any): scala.Unit = js.native
  def setCellValue(
    visibleIndex: scala.Double,
    columnFieldNameOrId: java.lang.String,
    value: js.Any,
    displayText: java.lang.String,
    cancelCellHighlighting: scala.Boolean
  ): scala.Unit = js.native
  def startEdit(visibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def validateRow(visibleIndex: scala.Double): scala.Boolean = js.native
  def validateRows(validateOnlyModified: scala.Boolean): scala.Boolean = js.native
}

