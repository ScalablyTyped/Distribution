package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewCellInfo")
@js.native
class BootstrapCardViewCellInfo protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val cardVisibleIndex: Double = js.native
  val instance: js.Any = js.native
  def endEdit(): Unit = js.native
  def getCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  def getCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  def getColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  def getEditCellInfo(): BootstrapCardViewCellInfo | Null = js.native
  def hasChanges(): Boolean = js.native
  def moveFocusBackward(): Boolean = js.native
  def moveFocusForward(): Boolean = js.native
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
}

