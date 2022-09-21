package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access boolean conditions in ConditionalFormatRules. Each
  * conditional format rule may contain a single boolean condition. The boolean condition itself
  * contains a boolean criteria (with values) and formatting settings. The criteria is evaluated
  * against the content of a cell resulting in either a true or false value. If the
  * criteria evaluates to true, the condition's formatting settings are applied to the cell.
  */
trait BooleanCondition extends StObject {
  
  def getBackground(): String | Null
  
  def getBold(): Boolean | Null
  
  def getCriteriaType(): BooleanCriteria
  
  def getCriteriaValues(): js.Array[Any]
  
  def getFontColor(): String | Null
  
  def getItalic(): Boolean | Null
  
  def getStrikethrough(): Boolean | Null
  
  def getUnderline(): Boolean | Null
}
object BooleanCondition {
  
  inline def apply(
    getBackground: () => String | Null,
    getBold: () => Boolean | Null,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[Any],
    getFontColor: () => String | Null,
    getItalic: () => Boolean | Null,
    getStrikethrough: () => Boolean | Null,
    getUnderline: () => Boolean | Null
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
    __obj.asInstanceOf[BooleanCondition]
  }
  
  extension [Self <: BooleanCondition](x: Self) {
    
    inline def setGetBackground(value: () => String | Null): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    inline def setGetBold(value: () => Boolean | Null): Self = StObject.set(x, "getBold", js.Any.fromFunction0(value))
    
    inline def setGetCriteriaType(value: () => BooleanCriteria): Self = StObject.set(x, "getCriteriaType", js.Any.fromFunction0(value))
    
    inline def setGetCriteriaValues(value: () => js.Array[Any]): Self = StObject.set(x, "getCriteriaValues", js.Any.fromFunction0(value))
    
    inline def setGetFontColor(value: () => String | Null): Self = StObject.set(x, "getFontColor", js.Any.fromFunction0(value))
    
    inline def setGetItalic(value: () => Boolean | Null): Self = StObject.set(x, "getItalic", js.Any.fromFunction0(value))
    
    inline def setGetStrikethrough(value: () => Boolean | Null): Self = StObject.set(x, "getStrikethrough", js.Any.fromFunction0(value))
    
    inline def setGetUnderline(value: () => Boolean | Null): Self = StObject.set(x, "getUnderline", js.Any.fromFunction0(value))
  }
}
