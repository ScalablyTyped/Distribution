package typings.durandal.compositionMod

import typings.durandal.DurandalPromise
import typings.knockout.KnockoutBindingContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionContext extends js.Object {
  var activate: js.UndefOr[Boolean] = js.undefined
  var activeView: HTMLElement
  var area: js.UndefOr[String] = js.undefined
  var attached: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var binding: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var bindingContext: js.UndefOr[KnockoutBindingContext] = js.undefined
  var cacheViews: js.UndefOr[Boolean] = js.undefined
  var child: HTMLElement
  var composingNewView: Boolean
  var compositionComplete: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var mode: String
  var model: js.UndefOr[js.Any] = js.undefined
  var parent: HTMLElement
  var preserveContext: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]]] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
  var viewElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  def triggerAttach(): Unit
}

object CompositionContext {
  @scala.inline
  def apply(
    activeView: HTMLElement,
    child: HTMLElement,
    composingNewView: Boolean,
    mode: String,
    parent: HTMLElement,
    triggerAttach: () => Unit,
    activate: js.UndefOr[Boolean] = js.undefined,
    area: String = null,
    attached: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit = null,
    binding: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit = null,
    bindingContext: KnockoutBindingContext = null,
    cacheViews: js.UndefOr[Boolean] = js.undefined,
    compositionComplete: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit = null,
    model: js.Any = null,
    preserveContext: js.UndefOr[Boolean] = js.undefined,
    strategy: /* context */ CompositionContext => DurandalPromise[HTMLElement] = null,
    transition: String = null,
    view: js.Any = null,
    viewElements: js.Array[HTMLElement] = null
  ): CompositionContext = {
    val __obj = js.Dynamic.literal(activeView = activeView, child = child, composingNewView = composingNewView, mode = mode, parent = parent, triggerAttach = js.Any.fromFunction0(triggerAttach))
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    if (area != null) __obj.updateDynamic("area")(area)
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction3(attached))
    if (binding != null) __obj.updateDynamic("binding")(js.Any.fromFunction3(binding))
    if (bindingContext != null) __obj.updateDynamic("bindingContext")(bindingContext)
    if (!js.isUndefined(cacheViews)) __obj.updateDynamic("cacheViews")(cacheViews)
    if (compositionComplete != null) __obj.updateDynamic("compositionComplete")(js.Any.fromFunction3(compositionComplete))
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(preserveContext)) __obj.updateDynamic("preserveContext")(preserveContext)
    if (strategy != null) __obj.updateDynamic("strategy")(js.Any.fromFunction1(strategy))
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewElements != null) __obj.updateDynamic("viewElements")(viewElements)
    __obj.asInstanceOf[CompositionContext]
  }
}

