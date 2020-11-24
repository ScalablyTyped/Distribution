package typings.durandal.compositionMod

import typings.durandal.DurandalPromise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionContext extends js.Object {
  
  var activate: js.UndefOr[Boolean] = js.native
  
  var activeView: HTMLElement = js.native
  
  var area: js.UndefOr[String] = js.native
  
  var attached: js.UndefOr[
    js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
  ] = js.native
  
  var binding: js.UndefOr[
    js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
  ] = js.native
  
  var bindingContext: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ] = js.native
  
  var cacheViews: js.UndefOr[Boolean] = js.native
  
  var child: HTMLElement = js.native
  
  var composingNewView: Boolean = js.native
  
  var compositionComplete: js.UndefOr[
    js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
  ] = js.native
  
  var mode: String = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var parent: HTMLElement = js.native
  
  var preserveContext: js.UndefOr[Boolean] = js.native
  
  var strategy: js.UndefOr[js.Function1[/* context */ this.type, DurandalPromise[HTMLElement]]] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  def triggerAttach(): Unit = js.native
  
  var view: js.UndefOr[js.Any] = js.native
  
  var viewElements: js.UndefOr[js.Array[HTMLElement]] = js.native
}
object CompositionContext {
  
  @scala.inline
  def apply(
    activeView: HTMLElement,
    child: HTMLElement,
    composingNewView: Boolean,
    mode: String,
    parent: HTMLElement,
    triggerAttach: () => Unit
  ): CompositionContext = {
    val __obj = js.Dynamic.literal(activeView = activeView.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], composingNewView = composingNewView.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], triggerAttach = js.Any.fromFunction0(triggerAttach))
    __obj.asInstanceOf[CompositionContext]
  }
  
  @scala.inline
  implicit class CompositionContextOps[Self <: CompositionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveView(value: HTMLElement): Self = this.set("activeView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChild(value: HTMLElement): Self = this.set("child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposingNewView(value: Boolean): Self = this.set("composingNewView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: HTMLElement): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerAttach(value: () => Unit): Self = this.set("triggerAttach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setAttached(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = this.set("attached", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setBinding(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = this.set("binding", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    
    @scala.inline
    def setBindingContext(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
    ): Self = this.set("bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingContext: Self = this.set("bindingContext", js.undefined)
    
    @scala.inline
    def setCacheViews(value: Boolean): Self = this.set("cacheViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheViews: Self = this.set("cacheViews", js.undefined)
    
    @scala.inline
    def setCompositionComplete(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = this.set("compositionComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCompositionComplete: Self = this.set("compositionComplete", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreserveContext(value: Boolean): Self = this.set("preserveContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveContext: Self = this.set("preserveContext", js.undefined)
    
    @scala.inline
    def setStrategy(value: CompositionContext => DurandalPromise[HTMLElement]): Self = this.set("strategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setView(value: js.Any): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewElementsVarargs(value: HTMLElement*): Self = this.set("viewElements", js.Array(value :_*))
    
    @scala.inline
    def setViewElements(value: js.Array[HTMLElement]): Self = this.set("viewElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewElements: Self = this.set("viewElements", js.undefined)
  }
}
