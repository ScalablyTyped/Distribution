package typings.dojo.dojox.form.manager

import typings.dojo.dijit.Widget
import typings.dojo.dijit.form.FormWidget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_Mixin.html
  *
  * Mixin to orchestrate dynamic forms.
  * This mixin provides a foundation for an enhanced form
  * functionality: unified access to individual form elements,
  * unified "onchange" event processing, general event
  * processing, I/O orchestration, and common form-related
  * functionality. See additional mixins in dojox.form.manager
  * namespace.
  *
  */
@JSGlobal("dojox.form.manager._Mixin")
@js.native
class Mixin () extends js.Object {
  /**
    *
    */
  var watching: Boolean = js.native
  /**
    * Called when the widget is being destroyed
    *
    */
  def destroy(): Unit = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: js.Object, value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: js.Object, value: js.Object): js.Any = js.native
  /**
    * Run an inspector function on controlled elements returning a result object.
    *
    * @param inspector A function to be called on a widget, form element, and an attached node.Takes three arguments: a name, a node (domNode in the case of widget) oran array of such objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all controlled elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspect(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Any = js.native
  /**
    * Run an inspector function on "dojoAttachPoint" nodes returning a result object.
    *
    * @param inspector A function to be called on a node. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all attached point nodes will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectAttachedPoints(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Run an inspector function on controlled widgets returning a result object.
    *
    * @param inspector A function to be called on a widget. Takes three arguments: a name, a widget objector an array of widget objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all widgets will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectFormWidgets(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: String): js.Any = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: FormWidget): js.Any = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: HTMLElement): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: String): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: Widget): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: HTMLElement): js.Any = js.native
  /**
    * Called after all the widgets have been instantiated and their
    * dom nodes have been inserted somewhere under win.doc.body.
    *
    */
  def startup(): Unit = js.native
  /**
    * Removes the widget by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  def unregisterWidget(name: String): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: String): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: Widget): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: HTMLElement): js.Any = js.native
}

