package typings.durandal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The composition module encapsulates all functionality related to visual composition.
  * @requires system
  * @requires viewLocator
  * @requires binder
  * @requires viewEngine
  * @requires activator
  * @requires jquery
  * @requires knockout
  */
object compositionMod {
  
  @JSImport("durandal/composition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("durandal/composition", "addBindingHandler")
  @js.native
  def addBindingHandler(name: String): Unit = js.native
  @JSImport("durandal/composition", "addBindingHandler")
  @js.native
  def addBindingHandler(
    name: String,
    config: js.UndefOr[scala.Nothing],
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  @JSImport("durandal/composition", "addBindingHandler")
  @js.native
  def addBindingHandler(
    name: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): Unit = js.native
  @JSImport("durandal/composition", "addBindingHandler")
  @js.native
  def addBindingHandler(
    name: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  
  @JSImport("durandal/composition", "compose")
  @js.native
  def compose(
    element: HTMLElement,
    settings: CompositionContext,
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ): Unit = js.native
  
  @JSImport("durandal/composition", "convertTransitionToModuleId")
  @js.native
  def convertTransitionToModuleId(name: String): String = js.native
  
  @JSImport("durandal/composition", "current")
  @js.native
  def current: CompositionTransation = js.native
  @scala.inline
  def current_=(x: CompositionTransation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  @JSImport("durandal/composition", "defaultStrategy")
  @js.native
  def defaultStrategy: js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]] = js.native
  @scala.inline
  def defaultStrategy_=(x: js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStrategy")(x.asInstanceOf[js.Any])
  
  @JSImport("durandal/composition", "defaultTransitionName")
  @js.native
  def defaultTransitionName: String = js.native
  @scala.inline
  def defaultTransitionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransitionName")(x.asInstanceOf[js.Any])
  
  @JSImport("durandal/composition", "getParts")
  @js.native
  def getParts(elements: js.Array[HTMLElement]): js.Any = js.native
  @JSImport("durandal/composition", "getParts")
  @js.native
  def getParts(element: HTMLElement): js.Any = js.native
  
  @js.native
  trait CompositionContext extends StObject {
    
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
    implicit class CompositionContextMutableBuilder[Self <: CompositionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      @scala.inline
      def setActiveView(value: HTMLElement): Self = StObject.set(x, "activeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setAttached(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBinding(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = StObject.set(x, "binding", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBindingContext(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
      ): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
      
      @scala.inline
      def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      @scala.inline
      def setCacheViews(value: Boolean): Self = StObject.set(x, "cacheViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheViewsUndefined: Self = StObject.set(x, "cacheViews", js.undefined)
      
      @scala.inline
      def setChild(value: HTMLElement): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposingNewView(value: Boolean): Self = StObject.set(x, "composingNewView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositionComplete(value: (/* child */ HTMLElement, /* parent */ HTMLElement, CompositionContext) => Unit): Self = StObject.set(x, "compositionComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCompositionCompleteUndefined: Self = StObject.set(x, "compositionComplete", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParent(value: HTMLElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveContext(value: Boolean): Self = StObject.set(x, "preserveContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveContextUndefined: Self = StObject.set(x, "preserveContext", js.undefined)
      
      @scala.inline
      def setStrategy(value: CompositionContext => DurandalPromise[HTMLElement]): Self = StObject.set(x, "strategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTriggerAttach(value: () => Unit): Self = StObject.set(x, "triggerAttach", js.Any.fromFunction0(value))
      
      @scala.inline
      def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "viewElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewElementsUndefined: Self = StObject.set(x, "viewElements", js.undefined)
      
      @scala.inline
      def setViewElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "viewElements", js.Array(value :_*))
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait CompositionTransation extends StObject {
    
    /**
      * Registers a callback which will be invoked when the current composition transaction has completed. The transaction includes all parent and children compositions.
      * @param {function} callback The callback to be invoked when composition is complete.
      */
    def complete(callback: js.Function): Unit = js.native
  }
  object CompositionTransation {
    
    @scala.inline
    def apply(complete: js.Function => Unit): CompositionTransation = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.asInstanceOf[CompositionTransation]
    }
    
    @scala.inline
    implicit class CompositionTransationMutableBuilder[Self <: CompositionTransation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: js.Function => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    }
  }
}
