package typings.formstate.formstateMod

import typings.formstate.libCoreFormStateLazyMod.ValidatableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", "FormStateLazy")
@js.native
class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
  extends typings.formstate.libCoreFormStateLazyMod.FormStateLazy[TValue] {
  def this(/** It is a function as fields can change over time */
  getFields: js.Function0[TValue]) = this()
}

