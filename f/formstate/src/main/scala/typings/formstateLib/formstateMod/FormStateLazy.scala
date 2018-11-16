package typings
package formstateLib.formstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", "FormStateLazy")
@js.native
class FormStateLazy[TValue /* <: formstateLib.libCoreFormStateLazyMod.ValidatableArray */] protected ()
  extends formstateLib.libCoreFormStateLazyMod.FormStateLazy[TValue] {
  def this(/** It is a function as fields can change over time */
  getFields: js.Function0[TValue]) = this()
}

