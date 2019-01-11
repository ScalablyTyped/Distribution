package typings
package durandalLib.compositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/composition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var current: durandalLib.compositionMod.CompositionTransation = js.native
  var defaultStrategy: js.Function1[
    /* context */ durandalLib.compositionMod.CompositionContext, 
    durandalLib.DurandalPromise[stdLib.HTMLElement]
  ] = js.native
  var defaultTransitionName: java.lang.String = js.native
  def addBindingHandler(name: java.lang.String): scala.Unit = js.native
  def addBindingHandler(name: java.lang.String, config: knockoutLib.KnockoutBindingHandler[_, _, _]): scala.Unit = js.native
  def addBindingHandler(
    name: java.lang.String,
    config: knockoutLib.KnockoutBindingHandler[_, _, _],
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[stdLib.HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[knockoutLib.KnockoutBindingContext], 
      _
    ]
  ): scala.Unit = js.native
  def compose(
    element: stdLib.HTMLElement,
    settings: durandalLib.compositionMod.CompositionContext,
    bindingContext: knockoutLib.KnockoutBindingContext
  ): scala.Unit = js.native
  def convertTransitionToModuleId(name: java.lang.String): java.lang.String = js.native
  def getParts(elements: js.Array[stdLib.HTMLElement]): js.Any = js.native
  def getParts(element: stdLib.HTMLElement): js.Any = js.native
}

