package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.AsyncRule
import typings.devextreme.mod.DevExpress.ui.CompareRule
import typings.devextreme.mod.DevExpress.ui.CustomRule
import typings.devextreme.mod.DevExpress.ui.EmailRule
import typings.devextreme.mod.DevExpress.ui.NumericRule
import typings.devextreme.mod.DevExpress.ui.PatternRule
import typings.devextreme.mod.DevExpress.ui.RangeRule
import typings.devextreme.mod.DevExpress.ui.RequiredRule
import typings.devextreme.mod.DevExpress.ui.StringLengthRule
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokenRules[T] extends js.Object {
  
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var errorText: js.UndefOr[String] = js.native
  
  var isValid: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var newData: js.UndefOr[js.Any] = js.native
  
  var oldData: js.UndefOr[js.Any] = js.native
  
  var promise: js.UndefOr[typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.native
}
object BrokenRules {
  
  @scala.inline
  def apply[T](): BrokenRules[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokenRules[T]]
  }
  
  @scala.inline
  implicit class BrokenRulesOps[Self <: BrokenRules[_], T] (val x: Self with BrokenRules[T]) extends AnyVal {
    
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
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorText: Self = this.set("errorText", js.undefined)
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNewData(value: js.Any): Self = this.set("newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    
    @scala.inline
    def setOldData(value: js.Any): Self = this.set("oldData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldData: Self = this.set("oldData", js.undefined)
    
    @scala.inline
    def setPromise(value: typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
  }
}
