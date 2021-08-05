package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCardViewCellInfo extends StObject {
  
  val cardVisibleIndex: Double = js.native
  
  def endEdit(): Unit = js.native
  
  def getCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  
  def getCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  
  def getColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  
  def getEditCellInfo(): BootstrapCardViewCellInfo | Null = js.native
  
  def hasChanges(): Boolean = js.native
  
  /* protected */ val instance: js.Any = js.native
  
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
