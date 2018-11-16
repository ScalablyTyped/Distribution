package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewCellInfo")
@js.native
class BootstrapCardViewCellInfo protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val cardVisibleIndex: scala.Double = js.native
  val instance: js.Any = js.native
  def endEdit(): scala.Unit = js.native
  def getCellTextContainer(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): js.Any = js.native
  def getCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String, initial: scala.Boolean): js.Any = js.native
  def getColumnDisplayText(columnFieldNameOrId: java.lang.String, value: js.Any): java.lang.String = js.native
  def getEditCellInfo(): BootstrapCardViewCellInfo | scala.Null = js.native
  def hasChanges(): scala.Boolean = js.native
  def moveFocusBackward(): scala.Boolean = js.native
  def moveFocusForward(): scala.Boolean = js.native
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
}

