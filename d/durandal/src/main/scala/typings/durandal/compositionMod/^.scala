package typings.durandal.compositionMod

import typings.durandal.DurandalPromise
import typings.knockout.KnockoutBindingContext
import typings.knockout.KnockoutBindingHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/composition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var current: CompositionTransation = js.native
  var defaultStrategy: js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]] = js.native
  var defaultTransitionName: String = js.native
  def addBindingHandler(name: String): Unit = js.native
  def addBindingHandler(name: String, config: KnockoutBindingHandler[_, _, _]): Unit = js.native
  def addBindingHandler(
    name: String,
    config: KnockoutBindingHandler[_, _, _],
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      _
    ]
  ): Unit = js.native
  def compose(element: HTMLElement, settings: CompositionContext, bindingContext: KnockoutBindingContext): Unit = js.native
  def convertTransitionToModuleId(name: String): String = js.native
  def getParts(elements: js.Array[HTMLElement]): js.Any = js.native
  def getParts(element: HTMLElement): js.Any = js.native
}

