package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access boolean conditions in ConditionalFormatRules. Each
  * conditional format rule may contain a single boolean condition. The boolean condition itself
  * contains a boolean criteria (with values) and formatting settings. The criteria is evaluated
  * against the content of a cell resulting in either a true or false value. If the
  * criteria evaluates to true, the condition's formatting settings are applied to the cell.
  */
@js.native
trait BooleanCondition extends StObject {
  
  def getBackground(): String | Null = js.native
  
  def getBold(): Boolean | Null = js.native
  
  def getCriteriaType(): BooleanCriteria = js.native
  
  def getCriteriaValues(): js.Array[_] = js.native
  
  def getFontColor(): String | Null = js.native
  
  def getItalic(): Boolean | Null = js.native
  
  def getStrikethrough(): Boolean | Null = js.native
  
  def getUnderline(): Boolean | Null = js.native
}
object BooleanCondition {
  
  @scala.inline
  def apply(
    getBackground: () => String | Null,
    getBold: () => Boolean | Null,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getFontColor: () => String | Null,
    getItalic: () => Boolean | Null,
    getStrikethrough: () => Boolean | Null,
    getUnderline: () => Boolean | Null
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
    __obj.asInstanceOf[BooleanCondition]
  }
  
  @scala.inline
  implicit class BooleanConditionMutableBuilder[Self <: BooleanCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBackground(value: () => String | Null): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBold(value: () => Boolean | Null): Self = StObject.set(x, "getBold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaType(value: () => BooleanCriteria): Self = StObject.set(x, "getCriteriaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaValues(value: () => js.Array[_]): Self = StObject.set(x, "getCriteriaValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontColor(value: () => String | Null): Self = StObject.set(x, "getFontColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItalic(value: () => Boolean | Null): Self = StObject.set(x, "getItalic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrikethrough(value: () => Boolean | Null): Self = StObject.set(x, "getStrikethrough", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUnderline(value: () => Boolean | Null): Self = StObject.set(x, "getUnderline", js.Any.fromFunction0(value))
  }
}
