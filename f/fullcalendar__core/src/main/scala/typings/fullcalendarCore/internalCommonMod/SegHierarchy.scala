package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegHierarchy extends StObject {
  
  def addSegs(inputs: js.Array[SegEntry]): js.Array[SegEntry]
  
  var allowReslicing: Boolean
  
  var entriesByLevel: js.Array[js.Array[SegEntry]]
  
  def findInsertion(newEntry: SegEntry): SegInsertion
  
  def handleInvalidInsertion(insertion: SegInsertion, entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double
  
  def insertEntry(entry: SegEntry, hiddenEntries: js.Array[SegEntry]): Double
  
  def insertEntryAt(entry: SegEntry, insertion: SegInsertion): Unit
  
  def isInsertionValid(insertion: SegInsertion, entry: SegEntry): Boolean
  
  var levelCoords: js.Array[Double]
  
  var maxCoord: Double
  
  var maxStackCnt: Double
  
  def splitEntry(entry: SegEntry, barrier: SegEntry, hiddenEntries: js.Array[SegEntry]): Double
  
  var stackCnts: StringDictionary[Double]
  
  var strictOrder: Boolean
  
  def toRects(): js.Array[SegRect]
}
object SegHierarchy {
  
  inline def apply(
    addSegs: js.Array[SegEntry] => js.Array[SegEntry],
    allowReslicing: Boolean,
    entriesByLevel: js.Array[js.Array[SegEntry]],
    findInsertion: SegEntry => SegInsertion,
    handleInvalidInsertion: (SegInsertion, SegEntry, js.Array[SegEntry]) => Double,
    insertEntry: (SegEntry, js.Array[SegEntry]) => Double,
    insertEntryAt: (SegEntry, SegInsertion) => Unit,
    isInsertionValid: (SegInsertion, SegEntry) => Boolean,
    levelCoords: js.Array[Double],
    maxCoord: Double,
    maxStackCnt: Double,
    splitEntry: (SegEntry, SegEntry, js.Array[SegEntry]) => Double,
    stackCnts: StringDictionary[Double],
    strictOrder: Boolean,
    toRects: () => js.Array[SegRect]
  ): SegHierarchy = {
    val __obj = js.Dynamic.literal(addSegs = js.Any.fromFunction1(addSegs), allowReslicing = allowReslicing.asInstanceOf[js.Any], entriesByLevel = entriesByLevel.asInstanceOf[js.Any], findInsertion = js.Any.fromFunction1(findInsertion), handleInvalidInsertion = js.Any.fromFunction3(handleInvalidInsertion), insertEntry = js.Any.fromFunction2(insertEntry), insertEntryAt = js.Any.fromFunction2(insertEntryAt), isInsertionValid = js.Any.fromFunction2(isInsertionValid), levelCoords = levelCoords.asInstanceOf[js.Any], maxCoord = maxCoord.asInstanceOf[js.Any], maxStackCnt = maxStackCnt.asInstanceOf[js.Any], splitEntry = js.Any.fromFunction3(splitEntry), stackCnts = stackCnts.asInstanceOf[js.Any], strictOrder = strictOrder.asInstanceOf[js.Any], toRects = js.Any.fromFunction0(toRects))
    __obj.asInstanceOf[SegHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegHierarchy] (val x: Self) extends AnyVal {
    
    inline def setAddSegs(value: js.Array[SegEntry] => js.Array[SegEntry]): Self = StObject.set(x, "addSegs", js.Any.fromFunction1(value))
    
    inline def setAllowReslicing(value: Boolean): Self = StObject.set(x, "allowReslicing", value.asInstanceOf[js.Any])
    
    inline def setEntriesByLevel(value: js.Array[js.Array[SegEntry]]): Self = StObject.set(x, "entriesByLevel", value.asInstanceOf[js.Any])
    
    inline def setEntriesByLevelVarargs(value: js.Array[SegEntry]*): Self = StObject.set(x, "entriesByLevel", js.Array(value*))
    
    inline def setFindInsertion(value: SegEntry => SegInsertion): Self = StObject.set(x, "findInsertion", js.Any.fromFunction1(value))
    
    inline def setHandleInvalidInsertion(value: (SegInsertion, SegEntry, js.Array[SegEntry]) => Double): Self = StObject.set(x, "handleInvalidInsertion", js.Any.fromFunction3(value))
    
    inline def setInsertEntry(value: (SegEntry, js.Array[SegEntry]) => Double): Self = StObject.set(x, "insertEntry", js.Any.fromFunction2(value))
    
    inline def setInsertEntryAt(value: (SegEntry, SegInsertion) => Unit): Self = StObject.set(x, "insertEntryAt", js.Any.fromFunction2(value))
    
    inline def setIsInsertionValid(value: (SegInsertion, SegEntry) => Boolean): Self = StObject.set(x, "isInsertionValid", js.Any.fromFunction2(value))
    
    inline def setLevelCoords(value: js.Array[Double]): Self = StObject.set(x, "levelCoords", value.asInstanceOf[js.Any])
    
    inline def setLevelCoordsVarargs(value: Double*): Self = StObject.set(x, "levelCoords", js.Array(value*))
    
    inline def setMaxCoord(value: Double): Self = StObject.set(x, "maxCoord", value.asInstanceOf[js.Any])
    
    inline def setMaxStackCnt(value: Double): Self = StObject.set(x, "maxStackCnt", value.asInstanceOf[js.Any])
    
    inline def setSplitEntry(value: (SegEntry, SegEntry, js.Array[SegEntry]) => Double): Self = StObject.set(x, "splitEntry", js.Any.fromFunction3(value))
    
    inline def setStackCnts(value: StringDictionary[Double]): Self = StObject.set(x, "stackCnts", value.asInstanceOf[js.Any])
    
    inline def setStrictOrder(value: Boolean): Self = StObject.set(x, "strictOrder", value.asInstanceOf[js.Any])
    
    inline def setToRects(value: () => js.Array[SegRect]): Self = StObject.set(x, "toRects", js.Any.fromFunction0(value))
  }
}
