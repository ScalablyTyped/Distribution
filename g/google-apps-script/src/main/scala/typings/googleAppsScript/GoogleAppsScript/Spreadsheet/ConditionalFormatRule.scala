package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access conditional formatting rules. To create a new rule, use SpreadsheetApp.newConditionalFormatRule() and ConditionalFormatRuleBuilder.
  * You can use Sheet.setConditionalFormatRules(rules) to set the
  * rules for a given sheet.
  */
trait ConditionalFormatRule extends StObject {
  
  def copy(): ConditionalFormatRuleBuilder
  
  def getBooleanCondition(): BooleanCondition | Null
  
  def getGradientCondition(): GradientCondition | Null
  
  def getRanges(): js.Array[Range]
}
object ConditionalFormatRule {
  
  inline def apply(
    copy: () => ConditionalFormatRuleBuilder,
    getBooleanCondition: () => BooleanCondition | Null,
    getGradientCondition: () => GradientCondition | Null,
    getRanges: () => js.Array[Range]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getBooleanCondition = js.Any.fromFunction0(getBooleanCondition), getGradientCondition = js.Any.fromFunction0(getGradientCondition), getRanges = js.Any.fromFunction0(getRanges))
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: () => ConditionalFormatRuleBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setGetBooleanCondition(value: () => BooleanCondition | Null): Self = StObject.set(x, "getBooleanCondition", js.Any.fromFunction0(value))
    
    inline def setGetGradientCondition(value: () => GradientCondition | Null): Self = StObject.set(x, "getGradientCondition", js.Any.fromFunction0(value))
    
    inline def setGetRanges(value: () => js.Array[Range]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
  }
}
