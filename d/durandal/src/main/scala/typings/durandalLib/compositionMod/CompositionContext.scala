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

