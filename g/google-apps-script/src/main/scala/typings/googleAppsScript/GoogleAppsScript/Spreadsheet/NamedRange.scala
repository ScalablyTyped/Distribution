package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create, access and modify named ranges in a spreadsheet. Named ranges are ranges that have
  * associated string aliases. They can be viewed and edited via the Sheets UI under the Data >
  * Named ranges... menu.
  */
trait NamedRange extends StObject {
  
  def getName(): String
  
  def getRange(): Range
  
  def remove(): Unit
  
  def setName(name: String): NamedRange
  
  def setRange(range: Range): NamedRange
}
object NamedRange {
  
  inline def apply(
    getName: () => String,
    getRange: () => Range,
    remove: () => Unit,
    setName: String => NamedRange,
    setRange: Range => NamedRange
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), setName = js.Any.fromFunction1(setName), setRange = js.Any.fromFunction1(setRange))
    __obj.asInstanceOf[NamedRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedRange] (val x: Self) extends AnyVal {
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetRange(value: () => Range): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => NamedRange): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetRange(value: Range => NamedRange): Self = StObject.set(x, "setRange", js.Any.fromFunction1(value))
  }
}
