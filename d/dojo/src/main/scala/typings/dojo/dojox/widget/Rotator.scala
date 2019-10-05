package typings.dojo.dojox.widget

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Rotator.html
  *
  * A widget for rotating through child nodes using transitions.
  * A small, fast, extensible, awesome rotator that cycles, with transitions,
  * through panes (child nodes) displaying only one at a time and ties into
  * controllers used to change state.
  *
  * The Rotator does not rely on dijit.  It is designed to be as lightweight
  * as possible.  Controllers and transitions have been externalized
  * so builds can be as optimized with only the components you want to use.
  *
  * For best results, each rotator pane should be the same height and width as
  * the Rotator container node and consider setting overflow to hidden.
  * While the Rotator will accept any DOM node for a rotator pane, a block
  * element or element with display:block is recommended.
  *
  * Note: When the Rotator begins, it does not transition the first pane.
  *
  * subscribed topics:
  *
  * [id]/rotator/control - Controls the Rotator
  * Parameters:
  * - //string// action        - The name of a method of the Rotator to run
  * - //anything?// args       - One or more arguments to pass to the action
  * published topics:
  *
  * [id]/rotator/update - Notifies controllers that a pane or state has changed.
  * Parameters:
  *
  * /string/ type          - the type of notification
  * /dojox.widget.Rotator/ rotator - the rotator instance
  * /object?/ params         - params
  * declarative dojo/method events (per pane):
  *
  * onBeforeIn  - Fired before the transition in starts.
  * onAfterIn   - Fired after the transition in ends.
  * onBeforeOut - Fired before the transition out starts.
  * onAfterOut  - Fired after the transition out ends.
  *
  * @param params
  * @param node
  */
@JSGlobal("dojox.widget.Rotator")
@js.native
class Rotator protected () extends js.Object {
  def this(params: js.Object, node: HTMLElement) = this()
  /**
    * Array of panes to be created in the Rotator. Each array element
    * will be passed as attributes to a html.create() call.
    *
    */
  var panes: js.Object = js.native
  /**
    * The name of a function that is passed two panes nodes and a duration,
    * then returns a dojo.Animation object. The default value is
    * "dojox.widget.rotator.swap".
    *
    */
  var transition: String = js.native
  /**
    * Parameters for the transition. The string is read in and eval'd as an
    * object.  If the duration is absent, the default value will be used.
    *
    */
  var transitionParams: String = js.native
  /**
    * Dispatches an action, first to this engine, then to the Rotator.
    *
    * @param action
    */
  def control(action: String): Unit = js.native
  /**
    * Destroys the Rotator and its DOM node.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Transitions the Rotator to the specified pane index.
    *
    * @param p               Optional
    */
  def go(p: String): js.Any = js.native
  /**
    * Transitions the Rotator to the specified pane index.
    *
    * @param p               Optional
    */
  def go(p: Double): js.Any = js.native
  /**
    * Transitions the Rotator to the next pane.
    *
    */
  def next(): js.Any = js.native
  /**
    * Stub function that can be overriden or connected to.
    *
    */
  def onManualChange(): Unit = js.native
  /**
    * Send a notification to all controllers with the state of the rotator.
    *
    * @param type
    * @param params               Optional
    */
  def onUpdate(`type`: String, params: js.Object): Unit = js.native
  /**
    * Transitions the Rotator to the previous pane.
    *
    */
  def prev(): js.Any = js.native
  /**
    *
    * @param width
    * @param height
    */
  def resize(width: Double, height: Double): Unit = js.native
}

