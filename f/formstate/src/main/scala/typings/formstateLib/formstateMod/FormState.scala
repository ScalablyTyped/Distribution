package typings
package formstateLib.formstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", "FormState")
@js.native
class FormState[TValue /* <: formstateLib.libCoreFormStateMod.ValidatableMapOrArray */] protected ()
  extends formstateLib.libCoreFormStateMod.FormState[TValue] {
  def this(/**
           * SubItems can be any Validatable
           */
  $: TValue) = this()
}

