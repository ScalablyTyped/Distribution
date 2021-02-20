package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the current active selection in the active sheet. A selection is the set of cells the user
  * has highlighted in the sheet, which can be non-adjacent ranges. One cell in the selection is the
  * current cell, where the user's current focus is. The current cell is highlighted with a
  * darker border in the Google Sheets UI.
  *
  *     var activeSheet = SpreadsheetApp.getActiveSheet();
  *     var rangeList = activeSheet.getRangeList(['A1:B4', 'D1:E4']);
  *     rangeList.activate();
  *
  *     var selection = activeSheet.getSelection();
  *     // Current Cell: D1
  *     Logger.log('Current Cell: ' + selection.getCurrentCell().getA1Notation());
  *     // Active Range: D1:E4
  *     Logger.log('Active Range: ' + selection.getActiveRange().getA1Notation());
  *     // Active Ranges: A1:B4, D1:E4
  *     var ranges =  selection.getActiveRangeList().getRanges();
  *     for (var i = 0; i < ranges.length; i++) {
  *       Logger.log('Active Ranges: ' + ranges[i].getA1Notation());
  *     }
  *     Logger.log('Active Sheet: ' + selection.getActiveSheet().getName());
  */
@js.native
trait Selection extends StObject {
  
  def getActiveRange(): Range | Null = js.native
  
  def getActiveRangeList(): RangeList | Null = js.native
  
  def getActiveSheet(): Sheet = js.native
  
  def getCurrentCell(): Range | Null = js.native
  
  def getNextDataRange(direction: Direction): Range | Null = js.native
}
object Selection {
  
  @scala.inline
  def apply(
    getActiveRange: () => Range | Null,
    getActiveRangeList: () => RangeList | Null,
    getActiveSheet: () => Sheet,
    getCurrentCell: () => Range | Null,
    getNextDataRange: Direction => Range | Null
  ): Selection = {
    val __obj = js.Dynamic.literal(getActiveRange = js.Any.fromFunction0(getActiveRange), getActiveRangeList = js.Any.fromFunction0(getActiveRangeList), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getCurrentCell = js.Any.fromFunction0(getCurrentCell), getNextDataRange = js.Any.fromFunction1(getNextDataRange))
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetActiveRange(value: () => Range | Null): Self = StObject.set(x, "getActiveRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveRangeList(value: () => RangeList | Null): Self = StObject.set(x, "getActiveRangeList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveSheet(value: () => Sheet): Self = StObject.set(x, "getActiveSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentCell(value: () => Range | Null): Self = StObject.set(x, "getCurrentCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextDataRange(value: Direction => Range | Null): Self = StObject.set(x, "getNextDataRange", js.Any.fromFunction1(value))
  }
}
