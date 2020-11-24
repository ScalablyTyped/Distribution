package typings.emberComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreView.extend(ViewMixin, ActionSupport, ClassNamesSupport) * / any */ @js.native
trait Component extends js.Object {
  
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
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
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
    def setAriaRole(value: String): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidReceiveAttrs(value: () => Unit): Self = this.set("didReceiveAttrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidRender(value: () => Unit): Self = this.set("didRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidUpdate(value: () => Unit): Self = this.set("didUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidUpdateAttrs(value: () => Unit): Self = this.set("didUpdateAttrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: TemplateFactory | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDOMAttr(value: String => String): Self = this.set("readDOMAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWillRender(value: () => Unit): Self = this.set("willRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWillUpdate(value: () => Unit): Self = this.set("willUpdate", js.Any.fromFunction0(value))
  }
}
