package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxValidationGroupResult extends js.Object {
  
  /**
    * [descr:dxValidationGroupResult.brokenRules]
    */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  
  /**
    * [descr:dxValidationGroupResult.complete]
    */
  var complete: js.UndefOr[Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult]] = js.native
  
  /**
    * [descr:dxValidationGroupResult.isValid]
    */
  var isValid: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxValidationGroupResult.status]
    */
  var status: js.UndefOr[valid | invalid | pending] = js.native
  
  /**
    * [descr:dxValidationGroupResult.validators]
    */
  var validators: js.UndefOr[js.Array[_]] = js.native
}
object dxValidationGroupResult {
  
  @scala.inline
  def apply(): dxValidationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationGroupResult]
  }
  
  @scala.inline
  implicit class dxValidationGroupResultOps[Self <: dxValidationGroupResult] (val x: Self) extends AnyVal {
    
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
    def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = this.set("brokenRules", js.Array(value :_*))
    
    @scala.inline
    def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = this.set("brokenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokenRules: Self = this.set("brokenRules", js.undefined)
    
    @scala.inline
    def setComplete(value: Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setStatus(value: valid | invalid | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: js.Any*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[_]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
}
