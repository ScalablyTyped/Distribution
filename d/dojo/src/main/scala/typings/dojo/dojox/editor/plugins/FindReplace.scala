package typings.dojo.dojox.editor.plugins

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.dijit.Toolbar
import typings.dojo.dijit._Widget
import typings.dojo.dijit._editor._Plugin
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.btnId
import typings.dojo.dojoStrings.checkId
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.textId
import typings.dojo.dojoStrings.toolTip
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace.html
  *
  * This plugin provides a Find/Replace capability for the editor.
  * Note that this plugin is NOT supported on Opera currently, as opera
  * does not implement a window.find or equiv function.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.FindReplace")
@js.native
class FindReplace () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    * This is a callback handler that set a reference to the editor this plugin
    * hosts in
    *
    * @param editor
    */
  def setEditor(editor: js.Any): Unit = js.native
  /**
    * Function to allow programmatic toggling of the find toolbar.
    *
    */
  def toggle(): Unit = js.native
}

@JSGlobal("dojox.editor.plugins.FindReplace")
@js.native
object FindReplace extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace._FindReplaceCheckBox.html
    *
    * Base class for widgets that contains a label (like "Match case: ")
    * and a checkbox to indicate if it is checked or not.
    * Used as Toolbar entry.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _FindReplaceCheckBox () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * The id of the enhanced checkbox
      *
      */
    var checkId: String = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      * The label of the enhanced checkbox
      *
      */
    var label: String = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__FindReplaceCheckBox: String = js.native
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
      *
      */
    var widget: js.Object = js.native
    /**
      *
      */
    var widgetsInTemplate: Boolean = js.native
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
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_checkId(property: checkId): String = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_label(property: label): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widget(property: typings.dojo.dojoStrings.widget): js.Object = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_checkId(property: checkId, value: String): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_label(property: label, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_widget(property: typings.dojo.dojoStrings.widget, value: js.Object): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_checkId(property: checkId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widget(property: typings.dojo.dojoStrings.widget, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace._FindReplaceCloseBox.html
    *
    * Base class for widgets that contains a button labeled X
    * to close the tool bar.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _FindReplaceCloseBox () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      *
      */
    var btnId: String = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__FindReplaceCloseBox: String = js.native
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
      *
      */
    var widget: js.Object = js.native
    /**
      *
      */
    var widgetsInTemplate: Boolean = js.native
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
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_btnId(property: btnId): String = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widget(property: typings.dojo.dojoStrings.widget): js.Object = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      *
      */
    def onClick(): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_btnId(property: btnId, value: String): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_widget(property: typings.dojo.dojoStrings.widget, value: js.Object): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_btnId(property: btnId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widget(property: typings.dojo.dojoStrings.widget, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace._FindReplaceTextBox.html
    *
    * Base class for widgets that contains a label (like "Font:")
    * and a TextBox to pick a value.
    * Used as Toolbar entry.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _FindReplaceTextBox () extends _Widget {
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
    var contextRequire: js.Function = js.native
    /**
      * The label of the enhanced textbox
      *
      */
    var label: String = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__FindReplaceTextBox: String = js.native
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
      * The id of the enhanced textbox
      *
      */
    var textId: String = js.native
    /**
      *
      */
    var toolTip: String = js.native
    /**
      *
      */
    var widget: js.Object = js.native
    /**
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
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
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_label(property: label): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_textId(property: textId): String = js.native
    @JSName("get")
    def get_toolTip(property: toolTip): String = js.native
    @JSName("get")
    def get_widget(property: typings.dojo.dojoStrings.widget): js.Object = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      * Stub function for change events on the box.
      *
      * @param val
      */
    def onChange(`val`: String): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_label(property: label, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_textId(property: textId, value: String): Unit = js.native
    @JSName("set")
    def set_toolTip(property: toolTip, value: String): Unit = js.native
    @JSName("set")
    def set_widget(property: typings.dojo.dojoStrings.widget, value: js.Object): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_textId(property: textId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_toolTip(property: toolTip, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widget(property: typings.dojo.dojoStrings.widget, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace._FindReplaceToolbar.html
    *
    * A toolbar that derived from dijit.Toolbar, which
    * eliminates some unnecessary event response such as LEFT_ARROW pressing
    * and click bubbling.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class _FindReplaceToolbar () extends Toolbar {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Add a child to our _Container and prevent the default
      * arrow key navigation function. This function may bring in
      * side effect
      *
      * @param widget
      * @param insertIndex               Optional
      */
    def addChild(widget: _Widget, insertIndex: Double): Unit = js.native
  }
  
}

