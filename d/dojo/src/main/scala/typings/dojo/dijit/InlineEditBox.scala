package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoSave
import typings.dojo.dojoStrings.buttonCancel
import typings.dojo.dojoStrings.buttonSave
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.editing
import typings.dojo.dojoStrings.editorParams
import typings.dojo.dojoStrings.noValueIndicator
import typings.dojo.dojoStrings.renderAsHtml
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.dojo.dojoStrings.width
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/InlineEditBox.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my valuereplace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.InlineEditBox")
@js.native
class InlineEditBox () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Changing the value automatically saves it; don't have to push save button
    * (and save button isn't even displayed)
    * 
    */
  var autoSave: Boolean = js.native
  /**
    * Cancel button label
    * 
    */
  var buttonCancel: String = js.native
  /**
    * Save button label
    * 
    */
  var buttonSave: String = js.native
  /**
    * If true, clicking the InlineEditBox to edit it will have no effect.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * Is the node currently in edit mode?
    * 
    */
  var editing: Boolean = js.native
  /**
    * Set of parameters for editor, like {required: true}
    * 
    */
  var editorParams: js.Object = js.native
  /**
    * The text that gets displayed when there is no value (so that the user has a place to click to edit)
    * 
    */
  var noValueIndicator: String = js.native
  /**
    * Set this to true if the specified Editor's value should be interpreted as HTML
    * rather than plain text (ex: dijit.Editor)
    * 
    */
  var renderAsHtml: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_InlineEditBox: String = js.native
  /**
    * The display value of the widget in read-only mode
    * 
    */
  var value: String = js.native
  /**
    * Width of editor.  By default it's width=100% (ie, block mode).
    * 
    */
  var width: String = js.native
  /**
    * MID (ex: "dijit/form/TextBox") or constructor for editor widget
    * 
    */
  def editor(): Unit = js.native
  /**
    * Class name (or reference to the Class) for widget that wraps the editor widget, displaying save/cancel
    * buttons.
    * 
    */
  def editorWrapper(): Unit = js.native
  /**
    * Deprecated.   Use get('value') instead.
    * 
    */
  def getValue(): js.Any = js.native
  @JSName("get")
  def get_autoSave(property: autoSave): Boolean = js.native
  @JSName("get")
  def get_buttonCancel(property: buttonCancel): String = js.native
  @JSName("get")
  def get_buttonSave(property: buttonSave): String = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_editing(property: editing): Boolean = js.native
  @JSName("get")
  def get_editorParams(property: editorParams): js.Object = js.native
  @JSName("get")
  def get_noValueIndicator(property: noValueIndicator): String = js.native
  @JSName("get")
  def get_renderAsHtml(property: renderAsHtml): Boolean = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_width(property: width): String = js.native
  /**
    * Set this handler to be notified when editing is cancelled.
    * 
    */
  def onCancel(): Unit = js.native
  /**
    * Set this handler to be notified of changes to value.
    * 
    * @param value             
    */
  def onChange(value: js.Any): Unit = js.native
  /**
    * Deprecated.   Use set('disabled', ...) instead.
    * 
    * @param disabled             
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * Deprecated.   Use set('value', ...) instead.
    * 
    * @param val             
    */
  def setValue(`val`: String): js.Any = js.native
  @JSName("set")
  def set_autoSave(property: autoSave, value: Boolean): Unit = js.native
  @JSName("set")
  def set_buttonCancel(property: buttonCancel, value: String): Unit = js.native
  @JSName("set")
  def set_buttonSave(property: buttonSave, value: String): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editing(property: editing, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorParams(property: editorParams, value: js.Object): Unit = js.native
  @JSName("set")
  def set_noValueIndicator(property: noValueIndicator, value: String): Unit = js.native
  @JSName("set")
  def set_renderAsHtml(property: renderAsHtml, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: String): Unit = js.native
  @JSName("watch")
  def watch_autoSave(property: autoSave, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_buttonCancel(property: buttonCancel, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_buttonSave(property: buttonSave, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disabled(property: disabled, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_editing(property: editing, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_editorParams(property: editorParams, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_noValueIndicator(property: noValueIndicator, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_renderAsHtml(property: renderAsHtml, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_width(property: width, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

@JSGlobal("dijit.InlineEditBox")
@js.native
object InlineEditBox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/InlineEditBox._InlineEditor.html
    *
    * Internal widget used by InlineEditBox, displayed when in editing mode
    * to display the editor and maybe save/cancel buttons.  Calling code should
    * connect to save/cancel methods to detect when editing is finished
    * 
    * Has mainly the same parameters as InlineEditBox, plus these values:
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _InlineEditor () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      * 
      */
    var attachScope: js.Object = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      * 
      */
    @JSName("contextRequire")
    var contextRequire_F_InlineEditor: js.Function = js.native
    /**
      * 
      */
    var searchContainerNode: Boolean = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      * 
      */
    var templatePath: String = js.native
    /**
      * 
      */
    var templateString: String = js.native
    /**
      * Value as an HTML string or plain text string, depending on renderAsHTML flag
      * 
      */
    var value: String = js.native
    /**
      * Should we parse the template to find widgets that might be
      * declared in markup inside it?  (Remove for 2.0 and assume true)
      * 
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      * 
      */
    def contextRequire(): Unit = js.native
    /**
      * User overridable function returning a Boolean to indicate
      * if the Save button should be enabled or not - usually due to invalid conditions
      * 
      */
    def enableSave(): Boolean = js.native
    /**
      * Focus the edit widget.
      * 
      */
    def focus(): Unit = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      * 
      * @param templateString The template             
      * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
      * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
      */
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
    /**
      * Return the [display] value of the edit widget
      * 
      */
    def getValue(): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_value(property: value): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_value(property: value, value: String): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
}

