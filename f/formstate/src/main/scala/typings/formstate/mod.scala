package typings.formstate

import typings.formstate.formStateLazyMod.ValidatableArray
import typings.formstate.formStateMod.ValidatableMapOrArray
import typings.formstate.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formstate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
  
  @js.native
  class FieldState[TValue] protected ()
    extends typings.formstate.fieldStateMod.FieldState[TValue] {
    def this(_initValue: TValue) = this()
  }
  
  @js.native
  class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
    extends typings.formstate.formStateMod.FormState[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
  }
  
  @js.native
  class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
    extends typings.formstate.formStateLazyMod.FormStateLazy[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
  }
}
