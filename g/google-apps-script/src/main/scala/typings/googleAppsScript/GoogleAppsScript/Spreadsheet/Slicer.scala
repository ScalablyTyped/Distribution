package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a slicer, which is used
  * to filter ranges, charts and pivot tables in a non-collaborative manner. This class contains
  * methods to access and modify existing slicers. To create a new slicer, use Sheet.insertSlicer(range, anchorRowPos, anchorColPos).
  */
@js.native
trait Slicer extends StObject {
  
  def getBackgroundColor(): String | Null = js.native
  
  def getColumnPosition(): Integer | Null = js.native
  
  def getContainerInfo(): ContainerInfo = js.native
  
  def getFilterCriteria(): FilterCriteria | Null = js.native
  
  def getRange(): Range = js.native
  
  def getTitle(): String = js.native
  
  def getTitleHorizontalAlignment(): String = js.native
  
  def getTitleTextStyle(): TextStyle = js.native
  
  def isAppliedToPivotTables(): Boolean = js.native
  
  def remove(): Unit = js.native
  
  def setApplyToPivotTables(applyToPivotTables: Boolean): Slicer = js.native
  
  def setBackgroundColor(): Slicer = js.native
  def setBackgroundColor(color: String): Slicer = js.native
  
  def setColumnFilterCriteria(columnPosition: Integer): Slicer = js.native
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria): Slicer = js.native
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer = js.native
  
  def setRange(rangeApi: Range): Slicer = js.native
  
  def setTitle(title: String): Slicer = js.native
  
  def setTitleHorizontalAlignment(): Slicer = js.native
  def setTitleHorizontalAlignment(horizontalAlignment: String): Slicer = js.native
  
  def setTitleTextStyle(textStyle: TextStyle): Slicer = js.native
}
