package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a slicer, which is used
  * to filter ranges, charts and pivot tables in a non-collaborative manner. This class contains
  * methods to access and modify existing slicers. To create a new slicer, use Sheet.insertSlicer(range, anchorRowPos, anchorColPos).
  */
trait Slicer extends js.Object {
  def getBackgroundColor(): String
  def getColumnPosition(): Integer
  def getContainerInfo(): ContainerInfo
  def getFilterCriteria(): FilterCriteria
  def getRange(): Range
  def getTitle(): String
  def getTitleHorizontalAlignment(): String
  def getTitleTextStyle(): TextStyle
  def isAppliedToPivotTables(): Boolean
  def remove(): Unit
  def setApplyToPivotTables(applyToPivotTables: Boolean): Slicer
  def setBackgroundColor(color: String): Slicer
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria): Slicer
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer
  def setRange(rangeApi: Range): Slicer
  def setTitle(title: String): Slicer
  def setTitleHorizontalAlignment(horizontalAlignment: String): Slicer
  def setTitleTextStyle(textStyle: TextStyle): Slicer
}

object Slicer {
  @scala.inline
  def apply(
    getBackgroundColor: () => String,
    getColumnPosition: () => Integer,
    getContainerInfo: () => ContainerInfo,
    getFilterCriteria: () => FilterCriteria,
    getRange: () => Range,
    getTitle: () => String,
    getTitleHorizontalAlignment: () => String,
    getTitleTextStyle: () => TextStyle,
    isAppliedToPivotTables: () => Boolean,
    remove: () => Unit,
    setApplyToPivotTables: Boolean => Slicer,
    setBackgroundColor: String => Slicer,
    setColumnFilterCriteria: (Integer, FilterCriteria) => Slicer,
    setPosition: (Integer, Integer, Integer, Integer) => Slicer,
    setRange: Range => Slicer,
    setTitle: String => Slicer,
    setTitleHorizontalAlignment: String => Slicer,
    setTitleTextStyle: TextStyle => Slicer
  ): Slicer = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getColumnPosition = js.Any.fromFunction0(getColumnPosition), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getFilterCriteria = js.Any.fromFunction0(getFilterCriteria), getRange = js.Any.fromFunction0(getRange), getTitle = js.Any.fromFunction0(getTitle), getTitleHorizontalAlignment = js.Any.fromFunction0(getTitleHorizontalAlignment), getTitleTextStyle = js.Any.fromFunction0(getTitleTextStyle), isAppliedToPivotTables = js.Any.fromFunction0(isAppliedToPivotTables), remove = js.Any.fromFunction0(remove), setApplyToPivotTables = js.Any.fromFunction1(setApplyToPivotTables), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setColumnFilterCriteria = js.Any.fromFunction2(setColumnFilterCriteria), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction1(setRange), setTitle = js.Any.fromFunction1(setTitle), setTitleHorizontalAlignment = js.Any.fromFunction1(setTitleHorizontalAlignment), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle))
  
    __obj.asInstanceOf[Slicer]
  }
}

