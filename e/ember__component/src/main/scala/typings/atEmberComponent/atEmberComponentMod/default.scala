package typings.atEmberComponent.atEmberComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/component", JSImport.Default)
@js.native
class default () extends Component {
  // properties
  /**
    * The WAI-ARIA role of the control represented by this view. For example, a button may have a
    * role of type 'button', or a pane may have a role of type 'alertdialog'. This property is
    * used by assistive software to help visually challenged users navigate rich web applications.
    */
  /* CompleteClass */
  override var ariaRole: String = js.native
  /**
    * The HTML id of the component's element in the DOM. You can provide this value yourself but
    * it must be unique (just as in HTML):
    *
    * If not manually set a default value will be provided by the framework. Once rendered an
    * element's elementId is considered immutable and you should never change it. If you need
    * to compute a dynamic value for the elementId, you should do this when the component or
    * element is being instantiated:
    */
  /* CompleteClass */
  override var elementId: String = js.native
  /**
    * If false, the view will appear hidden in DOM.
    */
  /* CompleteClass */
  override var isVisible: Boolean = js.native
  /**
    * A component may contain a layout. A layout is a regular template but supersedes the template
    * property during rendering. It is the responsibility of the layout template to retrieve the
    * template property from the component (or alternatively, call Handlebars.helpers.yield,
    * {{yield}}) to render it in the correct location. This is useful for a component that has a
    * shared wrapper, but which delegates the rendering of the contents of the wrapper to the
    * template property on a subclass.
    */
  /* CompleteClass */
  override var layout: TemplateFactory | String = js.native
  // events
  /**
    * Called when the attributes passed into the component have been updated. Called both during the
    * initial render of a container and during a rerender. Can be used in place of an observer; code
    * placed here will be executed every time any attribute updates.
    */
  /* CompleteClass */
  override def didReceiveAttrs(): Unit = js.native
  /**
    * Called after a component has been rendered, both on initial render and in subsequent rerenders.
    */
  /* CompleteClass */
  override def didRender(): Unit = js.native
  /**
    * Called when the component has updated and rerendered itself. Called only during a rerender,
    * not during an initial render.
    */
  /* CompleteClass */
  override def didUpdate(): Unit = js.native
  /**
    * Called when the attributes passed into the component have been changed. Called only during a
    * rerender, not during an initial render.
    */
  /* CompleteClass */
  override def didUpdateAttrs(): Unit = js.native
  // methods
  /* CompleteClass */
  override def readDOMAttr(name: String): String = js.native
  /**
    * Called before a component has been rendered, both on initial render and in subsequent rerenders.
    */
  /* CompleteClass */
  override def willRender(): Unit = js.native
  /**
    * Called when the component is about to update and rerender itself. Called only during a rerender,
    * not during an initial render.
    */
  /* CompleteClass */
  override def willUpdate(): Unit = js.native
}

/* static members */
@JSImport("@ember/component", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Enables components to take a list of parameters as arguments.
    */
  var positionalParams: js.Array[String] | String = js.native
}

