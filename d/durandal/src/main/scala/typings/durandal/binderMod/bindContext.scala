package typings.durandal.binderMod

import typings.knockout.KnockoutBindingContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/binder", "bindContext")
@js.native
object bindContext extends js.Object {
  def apply(bindingContext: KnockoutBindingContext, view: HTMLElement): BindingInstruction = js.native
  def apply(bindingContext: KnockoutBindingContext, view: HTMLElement, obj: js.Any): BindingInstruction = js.native
  def apply(bindingContext: KnockoutBindingContext, view: HTMLElement, obj: js.Any, dataAlias: String): BindingInstruction = js.native
}

