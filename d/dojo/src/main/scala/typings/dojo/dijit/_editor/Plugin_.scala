package typings.dojo.dijit._editor

import typings.dojo.dijit.Destroyable
import typings.dojo.dijit.Editor
import typings.dojo.dijit.Toolbar
import typings.std.Attr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/_Plugin.html
  *
  * Base class for a "plugin" to the editor, which is usually
  * a single button on the Toolbar and some associated code
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor._Plugin")
@js.native
class Plugin_ () extends Destroyable {
  def this(args: js.Object) = this()
  /**
    * Pointer to dijit/form/Button or other widget (ex: dijit/form/FilteringSelect)
    * that is added to the toolbar to control this plugin.
    * If not specified, will be created on initialization according to buttonClass
    * 
    */
  var button: js.Object = js.native
  /**
    * String like "insertUnorderedList", "outdent", "justifyCenter", etc. that represents an editor command.
    * Passed to editor.execCommand() if useDefaultCommand is true.
    * 
    */
  var command: String = js.native
  /**
    * Flag to indicate if this plugin has been disabled and should do nothing
    * helps control button state, among other things.  Set via the setter api.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * Points to the parent editor
    * 
    */
  var editor: js.Object = js.native
  /**
    * The CSS class name for the button node is formed from iconClassPrefix and command
    * 
    */
  var iconClassPrefix: String = js.native
  /**
    * 
    */
  var registry: js.Object = js.native
  /**
    * If true, this plugin executes by calling Editor.execCommand() with the argument specified in command.
    * 
    */
  var useDefaultCommand: Boolean = js.native
  /**
    * Class of widget (ex: dijit.form.Button or dijit/form/FilteringSelect)
    * that is added to the toolbar to control this plugin.
    * This is used to instantiate the button, unless button itself is specified directly.
    * 
    */
  def buttonClass(): Unit = js.native
  /**
    * Deprecated.  Use this.own() with dojo/on or dojo/aspect.instead.
    * 
    * Make a connect.connect() that is automatically disconnected when this plugin is destroyed.
    * Similar to dijit/_Widget.connect().
    * 
    * @param o             
    * @param f             
    * @param tf             
    */
  def connect(o: js.Any, f: js.Any, tf: js.Any): Unit = js.native
  /**
    * Get a property from a plugin.
    * Get a named property from a plugin. The property may
    * potentially be retrieved via a getter method. If no getter is defined, this
    * just retrieves the object's property.
    * For example, if the plugin has a properties "foo"
    * and "bar" and a method named "_getFooAttr", calling:
    * 
    * plugin.get("foo");
    * would be equivalent to writing:
    * 
    * plugin._getFooAttr();
    * and:
    * 
    * plugin.get("bar");
    * would be equivalent to writing:
    * 
    * plugin.bar;
    * 
    * @param name The property to get.             
    */
  def get(name: js.Any): js.Any = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(): js.Any = js.native
  /**
    * Set a property on a plugin
    * Sets named properties on a plugin which may potentially be handled by a
    * setter in the plugin.
    * For example, if the plugin has a properties "foo"
    * and "bar" and a method named "_setFooAttr", calling:
    * 
    * plugin.set("foo", "Howdy!");
    * would be equivalent to writing:
    * 
    * plugin._setFooAttr("Howdy!");
    * and:
    * 
    * plugin.set("bar", 3);
    * would be equivalent to writing:
    * 
    * plugin.bar = 3;
    * set() may also be called with a hash of name/value pairs, ex:
    * 
    * plugin.set({
    *     foo: "Howdy",
    *     bar: 3
    * })
    * This is equivalent to calling set(foo, "Howdy") and set(bar, 3)
    * 
    * @param name The property to set.             
    * @param value The value to set in the property.             
    */
  def set(name: Attr, value: js.Any): js.Any = js.native
  /**
    * Tell the plugin which Editor it is associated with.
    * 
    * @param editor             
    */
  def setEditor(editor: Editor): Unit = js.native
  /**
    * Tell the plugin to add it's controller widget (often a button)
    * to the toolbar.  Does nothing if there is no controller widget.
    * 
    * @param toolbar             
    */
  def setToolbar(toolbar: Toolbar): Unit = js.native
  /**
    * Change state of the plugin to respond to events in the editor.
    * This is called on meaningful events in the editor, such as change of selection
    * or caret position (but not simple typing of alphanumeric keys).   It gives the
    * plugin a chance to update the CSS of its button.
    * 
    * For example, the "bold" plugin will highlight/unhighlight the bold button depending on whether the
    * characters next to the caret are bold or not.
    * 
    * Only makes sense when useDefaultCommand is true, as it calls Editor.queryCommandEnabled(command).
    * 
    */
  def updateState(): Unit = js.native
}

