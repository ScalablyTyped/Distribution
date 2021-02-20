package typings.emberComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/component", JSImport.Default)
  @js.native
  class default () extends Component
  /* static members */
  object default {
    
    @JSImport("@ember/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enables components to take a list of parameters as arguments.
      */
    @JSImport("@ember/component", "default.positionalParams")
    @js.native
    def positionalParams: js.Array[String] | String = js.native
    @scala.inline
    def positionalParams_=(x: js.Array[String] | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalParams")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreView.extend(ViewMixin, ActionSupport, ClassNamesSupport) * / any */ @js.native
  trait Component extends StObject {
    
    // properties
    /**
      * The WAI-ARIA role of the control represented by this view. For example, a button may have a
      * role of type 'button', or a pane may have a role of type 'alertdialog'. This property is
      * used by assistive software to help visually challenged users navigate rich web applications.
      */
    var ariaRole: String = js.native
    
    // events
    /**
      * Called when the attributes passed into the component have been updated. Called both during the
      * initial render of a container and during a rerender. Can be used in place of an observer; code
      * placed here will be executed every time any attribute updates.
      */
    def didReceiveAttrs(): Unit = js.native
    
    /**
      * Called after a component has been rendered, both on initial render and in subsequent rerenders.
      */
    def didRender(): Unit = js.native
    
    /**
      * Called when the component has updated and rerendered itself. Called only during a rerender,
      * not during an initial render.
      */
    def didUpdate(): Unit = js.native
    
    /**
      * Called when the attributes passed into the component have been changed. Called only during a
      * rerender, not during an initial render.
      */
    def didUpdateAttrs(): Unit = js.native
    
    /**
      * The HTML id of the component's element in the DOM. You can provide this value yourself but
      * it must be unique (just as in HTML):
      *
      * If not manually set a default value will be provided by the framework. Once rendered an
      * element's elementId is considered immutable and you should never change it. If you need
      * to compute a dynamic value for the elementId, you should do this when the component or
      * element is being instantiated:
      */
    var elementId: String = js.native
    
    /**
      * If false, the view will appear hidden in DOM.
      */
    var isVisible: Boolean = js.native
    
    /**
      * A component may contain a layout. A layout is a regular template but supersedes the template
      * property during rendering. It is the responsibility of the layout template to retrieve the
      * template property from the component (or alternatively, call Handlebars.helpers.yield,
      * {{yield}}) to render it in the correct location. This is useful for a component that has a
      * shared wrapper, but which delegates the rendering of the contents of the wrapper to the
      * template property on a subclass.
      */
    var layout: TemplateFactory | String = js.native
    
    // methods
    def readDOMAttr(name: String): String = js.native
    
    /**
      * Called before a component has been rendered, both on initial render and in subsequent rerenders.
      */
    def willRender(): Unit = js.native
    
    /**
      * Called when the component is about to update and rerender itself. Called only during a rerender,
      * not during an initial render.
      */
    def willUpdate(): Unit = js.native
  }
  object Component {
    
    @scala.inline
    def apply(
      ariaRole: String,
      didReceiveAttrs: () => Unit,
      didRender: () => Unit,
      didUpdate: () => Unit,
      didUpdateAttrs: () => Unit,
      elementId: String,
      isVisible: Boolean,
      layout: TemplateFactory | String,
      readDOMAttr: String => String,
      willRender: () => Unit,
      willUpdate: () => Unit
    ): Component = {
      val __obj = js.Dynamic.literal(ariaRole = ariaRole.asInstanceOf[js.Any], didReceiveAttrs = js.Any.fromFunction0(didReceiveAttrs), didRender = js.Any.fromFunction0(didRender), didUpdate = js.Any.fromFunction0(didUpdate), didUpdateAttrs = js.Any.fromFunction0(didUpdateAttrs), elementId = elementId.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], readDOMAttr = js.Any.fromFunction1(readDOMAttr), willRender = js.Any.fromFunction0(willRender), willUpdate = js.Any.fromFunction0(willUpdate))
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaRole(value: String): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidReceiveAttrs(value: () => Unit): Self = StObject.set(x, "didReceiveAttrs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDidRender(value: () => Unit): Self = StObject.set(x, "didRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDidUpdate(value: () => Unit): Self = StObject.set(x, "didUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDidUpdateAttrs(value: () => Unit): Self = StObject.set(x, "didUpdateAttrs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: TemplateFactory | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadDOMAttr(value: String => String): Self = StObject.set(x, "readDOMAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWillRender(value: () => Unit): Self = StObject.set(x, "willRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWillUpdate(value: () => Unit): Self = StObject.set(x, "willUpdate", js.Any.fromFunction0(value))
    }
  }
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  @js.native
  trait TemplateFactory extends StObject {
    
    var __htmlbars_inline_precompile_template_factory: js.Any = js.native
  }
  object TemplateFactory {
    
    @scala.inline
    def apply(__htmlbars_inline_precompile_template_factory: js.Any): TemplateFactory = {
      val __obj = js.Dynamic.literal(__htmlbars_inline_precompile_template_factory = __htmlbars_inline_precompile_template_factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateFactory]
    }
    
    @scala.inline
    implicit class TemplateFactoryMutableBuilder[Self <: TemplateFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__htmlbars_inline_precompile_template_factory(value: js.Any): Self = StObject.set(x, "__htmlbars_inline_precompile_template_factory", value.asInstanceOf[js.Any])
    }
  }
}
