package typings.finalForm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableState[FormValues, InitialFormValues] extends js.Object {
  
  var fieldSubscribers: StringDictionary[Subscribers[FieldState[_]]] = js.native
  
  var fields: StringDictionary[InternalFieldState[_]] = js.native
  
  var formState: InternalFormState = js.native
  
  var lastFormState: js.UndefOr[FormState[FormValues, InitialFormValues]] = js.native
}
object MutableState {
  
  @scala.inline
  def apply[FormValues, InitialFormValues](
    fieldSubscribers: StringDictionary[Subscribers[FieldState[_]]],
    fields: StringDictionary[InternalFieldState[_]],
    formState: InternalFormState
  ): MutableState[FormValues, InitialFormValues] = {
    val __obj = js.Dynamic.literal(fieldSubscribers = fieldSubscribers.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableState[FormValues, InitialFormValues]]
  }
  
  @scala.inline
  implicit class MutableStateOps[Self <: MutableState[_, _], FormValues, InitialFormValues] (val x: Self with (MutableState[FormValues, InitialFormValues])) extends AnyVal {
    
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
    def setFieldSubscribers(value: StringDictionary[Subscribers[FieldState[_]]]): Self = this.set("fieldSubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[InternalFieldState[_]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormState(value: InternalFormState): Self = this.set("formState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFormState(value: FormState[FormValues, InitialFormValues]): Self = this.set("lastFormState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFormState: Self = this.set("lastFormState", js.undefined)
  }
}
