package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access conditional formatting rules. To create a new rule, use SpreadsheetApp.newConditionalFormatRule() and ConditionalFormatRuleBuilder.
  * You can use Sheet.setConditionalFormatRules(rules) to set the
  * rules for a given sheet.
  */
@js.native
trait ConditionalFormatRule extends js.Object {
  
  def copy(): ConditionalFormatRuleBuilder = js.native
  
  def getBooleanCondition(): BooleanCondition | Null = js.native
  
  def getGradientCondition(): GradientCondition | Null = js.native
  
  def getRanges(): js.Array[Range] = js.native
}
object ConditionalFormatRule {
  
  @scala.inline
  def apply(
    copy: () => ConditionalFormatRuleBuilder,
    getBooleanCondition: () => BooleanCondition | Null,
    getGradientCondition: () => GradientCondition | Null,
    getRanges: () => js.Array[Range]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getBooleanCondition = js.Any.fromFunction0(getBooleanCondition), getGradientCondition = js.Any.fromFunction0(getGradientCondition), getRanges = js.Any.fromFunction0(getRanges))
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  @scala.inline
  implicit class ConditionalFormatRuleOps[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopy(value: () => ConditionalFormatRuleBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBooleanCondition(value: () => BooleanCondition | Null): Self = this.set("getBooleanCondition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGradientCondition(value: () => GradientCondition | Null): Self = this.set("getGradientCondition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRanges(value: () => js.Array[Range]): Self = this.set("getRanges", js.Any.fromFunction0(value))
  }
}
