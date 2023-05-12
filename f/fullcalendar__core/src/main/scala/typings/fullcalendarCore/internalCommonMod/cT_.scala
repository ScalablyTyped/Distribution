package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "cT")
@js.native
open class cT_ ()
  extends StObject
     with SegHierarchy {
  
  /* CompleteClass */
  override def addSegs(inputs: js.Array[SegEntry]): js.Array[SegEntry] = js.native
  
  /* CompleteClass */
  var allowReslicing: Boolean = js.native
  
  /* CompleteClass */
  var entriesByLevel: js.Array[js.Array[SegEntry]] = js.native
  
  /* CompleteClass */
  override def findInsertion(newEntry: SegEntry): SegInsertion = js.native
  
  /* CompleteClass */
  override def handleInvalidInsertion(insertion: SegInsertion, entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  /* CompleteClass */
  override def insertEntry(entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  /* CompleteClass */
  override def insertEntryAt(entry: SegEntry, insertion: SegInsertion): Unit = js.native
  
  /* CompleteClass */
  override def isInsertionValid(insertion: SegInsertion, entry: SegEntry): Boolean = js.native
  
  /* CompleteClass */
  var levelCoords: js.Array[Double] = js.native
  
  /* CompleteClass */
  var maxCoord: Double = js.native
  
  /* CompleteClass */
  var maxStackCnt: Double = js.native
  
  /* CompleteClass */
  override def splitEntry(entry: SegEntry, barrier: SegEntry, hiddenEntries: js.Array[SegEntry]): Double = js.native
  
  /* CompleteClass */
  var stackCnts: StringDictionary[Double] = js.native
  
  /* CompleteClass */
  var strictOrder: Boolean = js.native
  
  /* CompleteClass */
  override def toRects(): js.Array[SegRect] = js.native
}
