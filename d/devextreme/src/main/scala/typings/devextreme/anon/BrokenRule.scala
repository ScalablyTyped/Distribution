package typings.devextreme.anon

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.DevExpress.ui.AsyncRule
import typings.devextreme.mod.DevExpress.ui.CompareRule
import typings.devextreme.mod.DevExpress.ui.CustomRule
import typings.devextreme.mod.DevExpress.ui.EmailRule
import typings.devextreme.mod.DevExpress.ui.NumericRule
import typings.devextreme.mod.DevExpress.ui.PatternRule
import typings.devextreme.mod.DevExpress.ui.RangeRule
import typings.devextreme.mod.DevExpress.ui.RequiredRule
import typings.devextreme.mod.DevExpress.ui.StringLengthRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokenRule extends StObject {
  
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.undefined
  
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object BrokenRule {
  
  @scala.inline
  def apply(): BrokenRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokenRule]
  }
  
  @scala.inline
  implicit class BrokenRuleMutableBuilder[Self <: BrokenRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokenRule(
      value: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ): Self = StObject.set(x, "brokenRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokenRuleUndefined: Self = StObject.set(x, "brokenRule", js.undefined)
    
    @scala.inline
    def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
    
    @scala.inline
    def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "brokenRules", js.Array(value :_*))
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: valid | invalid | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    @scala.inline
    def setValidationRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
