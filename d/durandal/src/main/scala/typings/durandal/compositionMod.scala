package typings.durandal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def addBindingHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBindingHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addBindingHandler(
    name: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBindingHandler")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBindingHandler")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any], initOptionsFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBindingHandler(
    name: String,
    config: Unit,
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
      ], 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBindingHandler")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any], initOptionsFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def compose(
    element: HTMLElement,
    settings: CompositionContext,
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(element.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], bindingContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def convertTransitionToModuleId(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTransitionToModuleId")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  @scala.inline
  def getParts(elements: js.Array[HTMLElement]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParts")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getParts(element: HTMLElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParts")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait CompositionContext extends StObject {
    
    var activate: js.UndefOr[Boolean] = js.undefined
    
    var activeView: HTMLElement
    
    var area: js.UndefOr[String] = js.undefined
    
    var attached: js.UndefOr[
        js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
      ] = js.undefined
    
    var binding: js.UndefOr[
        js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
      ] = js.undefined
    
    var bindingContext: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
      ] = js.undefined
    
    var cacheViews: js.UndefOr[Boolean] = js.undefined
    
    var child: HTMLElement
    
    var composingNewView: Boolean
    
    var compositionComplete: js.UndefOr[
        js.Function3[/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ this.type, Unit]
      ] = js.undefined
    
    var mode: String
    
    var model: js.UndefOr[js.Any] = js.undefined
    
    var parent: HTMLElement
    
    var preserveContext: js.UndefOr[Boolean] = js.undefined
    
    var strategy: js.UndefOr[js.Function1[/* context */ this.type, DurandalPromise[HTMLElement]]] = js.undefined
    
    var transition: js.UndefOr[String] = js.undefined
    
    def triggerAttach(): Unit
    
    var view: js.UndefOr[js.Any] = js.undefined
    
    var viewElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
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
  
  trait CompositionTransation extends StObject {
    
    /**
      * Registers a callback which will be invoked when the current composition transaction has completed. The transaction includes all parent and children compositions.
      * @param {function} callback The callback to be invoked when composition is complete.
      */
    def complete(callback: js.Function): Unit
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
