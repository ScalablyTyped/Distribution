package typings
package durandalLib.compositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionContext extends js.Object {
  var activate: js.UndefOr[scala.Boolean] = js.undefined
  var activeView: stdLib.HTMLElement
  var area: js.UndefOr[java.lang.String] = js.undefined
  var attached: js.UndefOr[
    js.Function3[
      /* child */ stdLib.HTMLElement, 
      /* parent */ stdLib.HTMLElement, 
      /* context */ CompositionContext, 
      scala.Unit
    ]
  ] = js.undefined
  var binding: js.UndefOr[
    js.Function3[
      /* child */ stdLib.HTMLElement, 
      /* parent */ stdLib.HTMLElement, 
      /* context */ CompositionContext, 
      scala.Unit
    ]
  ] = js.undefined
  var bindingContext: js.UndefOr[knockoutLib.KnockoutBindingContext] = js.undefined
  var cacheViews: js.UndefOr[scala.Boolean] = js.undefined
  var child: stdLib.HTMLElement
  var composingNewView: scala.Boolean
  var compositionComplete: js.UndefOr[
    js.Function3[
      /* child */ stdLib.HTMLElement, 
      /* parent */ stdLib.HTMLElement, 
      /* context */ CompositionContext, 
      scala.Unit
    ]
  ] = js.undefined
  var mode: java.lang.String
  var model: js.UndefOr[js.Any] = js.undefined
  var parent: stdLib.HTMLElement
  var preserveContext: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[
    js.Function1[/* context */ CompositionContext, durandalLib.DurandalPromise[stdLib.HTMLElement]]
  ] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
  var viewElements: js.UndefOr[js.Array[stdLib.HTMLElement]] = js.undefined
  def triggerAttach(): scala.Unit
}

object CompositionContext {
  @scala.inline
  def apply(
    activeView: stdLib.HTMLElement,
    child: stdLib.HTMLElement,
    composingNewView: scala.Boolean,
    mode: java.lang.String,
    parent: stdLib.HTMLElement,
    triggerAttach: () => scala.Unit,
    activate: js.UndefOr[scala.Boolean] = js.undefined,
    area: java.lang.String = null,
    attached: (/* child */ stdLib.HTMLElement, /* parent */ stdLib.HTMLElement, /* context */ CompositionContext) => scala.Unit = null,
    binding: (/* child */ stdLib.HTMLElement, /* parent */ stdLib.HTMLElement, /* context */ CompositionContext) => scala.Unit = null,
    bindingContext: knockoutLib.KnockoutBindingContext = null,
    cacheViews: js.UndefOr[scala.Boolean] = js.undefined,
    compositionComplete: (/* child */ stdLib.HTMLElement, /* parent */ stdLib.HTMLElement, /* context */ CompositionContext) => scala.Unit = null,
    model: js.Any = null,
    preserveContext: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: /* context */ CompositionContext => durandalLib.DurandalPromise[stdLib.HTMLElement] = null,
    transition: java.lang.String = null,
    view: js.Any = null,
    viewElements: js.Array[stdLib.HTMLElement] = null
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

