package typings
package durandalLib.binderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/binder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var binding: js.Function3[
    /* data */ js.Any, 
    /* view */ stdLib.HTMLElement, 
    /* instruction */ durandalLib.binderMod.BindingInstruction, 
    scala.Unit
  ] = js.native
  var bindingComplete: js.Function3[
    /* data */ js.Any, 
    /* view */ stdLib.HTMLElement, 
    /* instruction */ durandalLib.binderMod.BindingInstruction, 
    scala.Unit
  ] = js.native
  var throwOnErrors: scala.Boolean = js.native
  def bind(obj: js.Any, view: stdLib.HTMLElement): durandalLib.binderMod.BindingInstruction = js.native
  def bindContext(bindingContext: knockoutLib.KnockoutBindingContext, view: stdLib.HTMLElement): durandalLib.binderMod.BindingInstruction = js.native
  def bindContext(bindingContext: knockoutLib.KnockoutBindingContext, view: stdLib.HTMLElement, obj: js.Any): durandalLib.binderMod.BindingInstruction = js.native
  def bindContext(
    bindingContext: knockoutLib.KnockoutBindingContext,
    view: stdLib.HTMLElement,
    obj: js.Any,
    dataAlias: java.lang.String
  ): durandalLib.binderMod.BindingInstruction = js.native
  def getBindingInstruction(view: stdLib.HTMLElement): durandalLib.binderMod.BindingInstruction = js.native
}

