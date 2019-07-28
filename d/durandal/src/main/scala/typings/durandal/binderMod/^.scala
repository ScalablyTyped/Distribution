package typings.durandal.binderMod

import typings.knockout.KnockoutBindingContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/binder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var binding: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  var bindingComplete: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  var throwOnErrors: Boolean = js.native
  def bind(obj: js.Any, view: HTMLElement): BindingInstruction = js.native
  def bindContext(bindingContext: KnockoutBindingContext, view: HTMLElement): BindingInstruction = js.native
  def bindContext(bindingContext: KnockoutBindingContext, view: HTMLElement, obj: js.Any): BindingInstruction = js.native
  def bindContext(bindingContext: KnockoutBindingContext, view: HTMLElement, obj: js.Any, dataAlias: String): BindingInstruction = js.native
  def getBindingInstruction(view: HTMLElement): BindingInstruction = js.native
}

