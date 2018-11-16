package typings
package durandalLib.binderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/binder", JSImport.Namespace)
@js.native
object binderModMembers extends js.Object {
  var binding: js.Function3[
    /* data */ js.Any, 
    /* view */ stdLib.HTMLElement, 
    /* instruction */ BindingInstruction, 
    scala.Unit
  ] = js.native
  var bindingComplete: js.Function3[
    /* data */ js.Any, 
    /* view */ stdLib.HTMLElement, 
    /* instruction */ BindingInstruction, 
    scala.Unit
  ] = js.native
  var throwOnErrors: scala.Boolean = js.native
  def bind(obj: js.Any, view: stdLib.HTMLElement): BindingInstruction = js.native
  def bindContext(bindingContext: knockoutLib.KnockoutBindingContext, view: stdLib.HTMLElement): BindingInstruction = js.native
  def bindContext(bindingContext: knockoutLib.KnockoutBindingContext, view: stdLib.HTMLElement, obj: js.Any): BindingInstruction = js.native
  def bindContext(
    bindingContext: knockoutLib.KnockoutBindingContext,
    view: stdLib.HTMLElement,
    obj: js.Any,
    dataAlias: java.lang.String
  ): BindingInstruction = js.native
  def getBindingInstruction(view: stdLib.HTMLElement): BindingInstruction = js.native
}

