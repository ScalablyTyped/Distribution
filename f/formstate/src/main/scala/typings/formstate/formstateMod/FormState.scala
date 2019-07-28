package typings.formstate.formstateMod

import typings.formstate.libCoreFormStateMod.ValidatableMapOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", "FormState")
@js.native
class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
  extends typings.formstate.libCoreFormStateMod.FormState[TValue] {
  def this(/**
    * SubItems can be any Validatable
    */
  $: TValue) = this()
}

