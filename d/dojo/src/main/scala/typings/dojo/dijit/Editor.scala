package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._editor.RichText
import typings.dojo.dojoStrings.customUndo
import typings.dojo.dojoStrings.editActionInterval
import typings.dojo.dojoStrings.extraPlugins
import typings.dojo.dojoStrings.plugins
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Editor.html
  *
  * A rich text Editing widget
  * This widget provides basic WYSIWYG editing features, based on the browser's
  * underlying rich text editing capability, accompanied by a toolbar (dijit.Toolbar).
  * A plugin model is available to extend the editor's capabilities as well as the
  * the options available in the toolbar.  Content generation may vary across
  * browsers, and clipboard operations may have different results, to name
  * a few limitations.  Note: this widget should not be used with the HTML
  * <TEXTAREA> tag -- see dijit/_editor/RichText for details.
  * 
  * @param params Initial settings for any of the attributes, except readonly attributes.     
  * @param srcNodeRef The editor replaces the specified DOMNode.     
  */
@JSGlobal("dijit.Editor")
@js.native
class Editor protected () extends RichText {
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Whether we shall use custom undo/redo support instead of the native
    * browser support. By default, we now use custom undo.  It works better
    * than native browser support and provides a consistent behavior across
    * browsers with a minimal performance hit.  We already had the hit on
    * the slowest browser, IE, anyway.
    * 
    */
  var customUndo: Boolean = js.native
  /**
    * When using customUndo, not every keystroke will be saved as a step.
    * Instead typing (including delete) will be grouped together: after
    * a user stops typing for editActionInterval seconds, a step will be
    * saved; if a user resume typing within editActionInterval seconds,
    * the timeout will be restarted. By default, editActionInterval is 3
    * seconds.
    * 
    */
  var editActionInterval: Double = js.native
  /**
    * A list of extra plugin names which will be appended to plugins array
    * 
    */
  var extraPlugins: js.Object = js.native
  /**
    * A list of plugin names (as strings) or instances (as objects)
    * for this widget.
    * 
    * When declared in markup, it might look like:
    * 
    * plugins="['bold',{name:'dijit._editor.plugins.FontChoice', command:'fontName', generic:true}]"
    * 
    */
  var plugins: js.Object = js.native
  /**
    * takes a plugin name as a string or a plugin instance and
    * adds it to the toolbar and associates it with this editor
    * instance. The resulting plugin is added to the Editor's
    * plugins array. If index is passed, it's placed in the plugins
    * array at that index. No big magic, but a nice helper for
    * passing in plugin names via markup.
    * 
    * @param plugin String, args object, plugin instance, or plugin constructor             
    * @param index               OptionalUsed when creating an instance fromsomething already in this.plugins. Ensures that the newinstance is assigned to this.plugins at that index.             
    */
  def addPlugin(plugin: String): Unit = js.native
  def addPlugin(plugin: String, index: Double): Unit = js.native
  /**
    * takes a plugin name as a string or a plugin instance and
    * adds it to the toolbar and associates it with this editor
    * instance. The resulting plugin is added to the Editor's
    * plugins array. If index is passed, it's placed in the plugins
    * array at that index. No big magic, but a nice helper for
    * passing in plugin names via markup.
    * 
    * @param plugin String, args object, plugin instance, or plugin constructor             
    * @param index               OptionalUsed when creating an instance fromsomething already in this.plugins. Ensures that the newinstance is assigned to this.plugins at that index.             
    */
  def addPlugin(plugin: js.Function): Unit = js.native
  def addPlugin(plugin: js.Function, index: Double): Unit = js.native
  /**
    * takes a plugin name as a string or a plugin instance and
    * adds it to the toolbar and associates it with this editor
    * instance. The resulting plugin is added to the Editor's
    * plugins array. If index is passed, it's placed in the plugins
    * array at that index. No big magic, but a nice helper for
    * passing in plugin names via markup.
    * 
    * @param plugin String, args object, plugin instance, or plugin constructor             
    * @param index               OptionalUsed when creating an instance fromsomething already in this.plugins. Ensures that the newinstance is assigned to this.plugins at that index.             
    */
  def addPlugin(plugin: js.Object): Unit = js.native
  def addPlugin(plugin: js.Object, index: Double): Unit = js.native
  /**
    * Main handler for executing any commands to the editor, like paste, bold, etc.
    * Called by plugins, but not meant to be called by end users.
    * 
    * @param cmd             
    */
  def execCommand(cmd: js.Any): js.Any = js.native
  @JSName("get")
  def get_customUndo(property: customUndo): Boolean = js.native
  @JSName("get")
  def get_editActionInterval(property: editActionInterval): Double = js.native
  @JSName("get")
  def get_extraPlugins(property: extraPlugins): js.Object = js.native
  @JSName("get")
  def get_plugins(property: plugins): js.Object = js.native
  /**
    * Called from dijit/layout/_LayoutWidget.resize().  This shouldn't be called directly
    * 
    */
  def layout(): Unit = js.native
  /**
    * 
    */
  def onBeforeActivate(): Unit = js.native
  /**
    * Handler for when editor is clicked
    * 
    */
  def onClick(): Unit = js.native
  /**
    * Returns true if specified editor command is enabled.
    * Used by the plugins to know when to highlight/not highlight buttons.
    * 
    * @param cmd             
    */
  def queryCommandEnabled(cmd: js.Any): js.Any = js.native
  /**
    * Resize the editor to the specified size, see dijit/layout/_LayoutWidget.resize()
    * 
    * @param size             
    */
  def resize(size: js.Any): Unit = js.native
  @JSName("set")
  def set_customUndo(property: customUndo, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editActionInterval(property: editActionInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_extraPlugins(property: extraPlugins, value: js.Object): Unit = js.native
  @JSName("set")
  def set_plugins(property: plugins, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_customUndo(property: customUndo, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_editActionInterval(property: editActionInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_extraPlugins(property: extraPlugins, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_plugins(property: plugins, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

