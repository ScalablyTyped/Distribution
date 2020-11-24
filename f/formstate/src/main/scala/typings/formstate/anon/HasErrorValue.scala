package typings.formstate.anon

import typings.formstate.formStateMod.ValidatableMapOrArray
import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasErrorValue[TValue /* <: ValidatableMapOrArray */] extends js.Object {
  
  var hasError: `false` = js.native
  
  var value: TValue = js.native
}
object HasErrorValue {
  
  @scala.inline
  def apply[TValue /* <: ValidatableMapOrArray */](hasError: `false`, value: TValue): HasErrorValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrorValue[TValue]]
  }
  
  @scala.inline
  implicit class HasErrorValueOps[Self <: HasErrorValue[_], TValue /* <: ValidatableMapOrArray */] (val x: Self with HasErrorValue[TValue]) extends AnyVal {
    
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
    def setHasError(value: `false`): Self = this.set("hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
