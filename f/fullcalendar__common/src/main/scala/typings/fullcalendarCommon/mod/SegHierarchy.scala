package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "SegHierarchy")
@js.native
open class SegHierarchy () extends StObject {
  
  def addSegs(inputs: js.Array[SegEntry]): js.Array[SegEntry] = js.native
  
  var allowReslicing: Boolean = js.native
  
  var entriesByLevel: js.Array[js.Array[SegEntry]] = js.native
  
  def findInsertion(newEntry: SegEntry): SegInsertion = js.native
  
  def handleInvalidInsertion(insertion: SegInsertion, entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  def insertEntry(entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  def insertEntryAt(entry: SegEntry, insertion: SegInsertion): Unit = js.native
  
  def isInsertionValid(insertion: SegInsertion, entry: SegEntry): Boolean = js.native
  
  var levelCoords: js.Array[Double] = js.native
  
  var maxCoord: Double = js.native
  
  var maxStackCnt: Double = js.native
  
  def splitEntry(entry: SegEntry, barrier: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  var stackCnts: StringDictionary[Double] = js.native
  
  var strictOrder: Boolean = js.native
  
  def toRects(): js.Array[SegRect] = js.native
}
