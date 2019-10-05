package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_Boolean
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.`accept-charset`
import typings.dojo.dojoStrings.accept
import typings.dojo.dojoStrings.action
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.doLayout
import typings.dojo.dojoStrings.encType
import typings.dojo.dojoStrings.isLayoutContainer
import typings.dojo.dojoStrings.method
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.state
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.target
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/Form.html
  *
  * Widget corresponding to HTML form tag, for validation and serialization
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.layout._ContentPaneResizeMixin because Inheritance from two classes. Inlined doLayout, isLayoutContainer, resize
- typings.dojo.dijit.form._FormMixin because Inheritance from two classes. Inlined state, connectChildren, destroy, disconnectChildren, getValues, isValid_Original, reset, setValues, startup, validate, onValidStateChange
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.form.Form")
@js.native
class Form () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * List of MIME types for file upload.
    * 
    */
  var accept: js.Object = js.native
  /**
    * 
    */
  var `accept-charset`: String = js.native
  /**
    * Server-side form handler.
    * 
    */
  var action: js.Object = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * 
    * false - don't adjust size of children
    * true - if there is a single visible child widget, set it's size to however big the ContentPane is
    * 
    */
  var doLayout: Boolean = js.native
  /**
    * Encoding type for the form, ex: application/x-www-form-urlencoded.
    * 
    */
  var encType: js.Object = js.native
  /**
    * Indicates that this widget will call resize() on it's child widgets
    * when they become visible.
    * 
    */
  var isLayoutContainer: Boolean = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  var isValid_Original: Fn_Boolean = js.native
  /**
    * HTTP method used to submit the form, either "GET" or "POST".
    * 
    */
  var method: js.Object = js.native
  /**
    * Name of form for scripting.
    * 
    */
  var name: js.Object = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Will be "Error" if one or more of the child widgets has an invalid value,
    * "Incomplete" if not all of the required child widgets are filled in.  Otherwise, "",
    * which indicates that the form is ready to be submitted.
    * 
    */
  var state: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_Form: String = js.native
  /**
    * Target frame for the document to be opened in.
    * 
    */
  var target: js.Object = js.native
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
    * You can call this function directly, ex. in the event that you
    * programmatically add a widget to the form after the form has been
    * initialized.
    * 
    * @param inStartup             
    */
  def connectChildren(inStartup: Boolean): Unit = js.native
  /**
    * Deprecated method.   Applications no longer need to call this.   Remove for 2.0.
    * 
    */
  def disconnectChildren(): Unit = js.native
  /**
    * Deprecated: use submit()
    * 
    * @param formContents             
    */
  def execute(formContents: js.Object): Unit = js.native
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
    * 
    */
  def getValues(): js.Any = js.native
  @JSName("get")
  def get_accept(property: accept): js.Object = js.native
  @JSName("get")
  def get_acceptcharset(property: `accept-charset`): String = js.native
  @JSName("get")
  def get_action(property: action): js.Object = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_doLayout(property: doLayout): Boolean = js.native
  @JSName("get")
  def get_encType(property: encType): js.Object = js.native
  @JSName("get")
  def get_isLayoutContainer(property: isLayoutContainer): Boolean = js.native
  @JSName("get")
  def get_method(property: method): js.Object = js.native
  @JSName("get")
  def get_name(property: name): js.Object = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_state(property: state): String = js.native
  @JSName("get")
  def get_target(property: target): js.Object = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  def isValid_MForm(): Boolean = js.native
  /**
    * Deprecated: use onSubmit()
    * 
    */
  def onExecute(): Unit = js.native
  /**
    * Callback when user resets the form. This method is intended
    * to be over-ridden. When the reset method is called
    * programmatically, the return value from onReset is used
    * to compute whether or not resetting should proceed
    * 
    * @param e               Optional            
    */
  def onReset(e: Event): Boolean = js.native
  /**
    * Callback when user submits the form.
    * This method is intended to be over-ridden, but by default it checks and
    * returns the validity of form elements. When the submit
    * method is called programmatically, the return value from
    * onSubmit is used to compute whether or not submission
    * should proceed
    * 
    * @param e               Optional            
    */
  def onSubmit(e: Event): js.Any = js.native
  /**
    * Stub function to connect to if you want to do something
    * (like disable/enable a submit button) when the valid
    * state changes on the form as a whole.
    * 
    * Deprecated.  Will be removed in 2.0.  Use watch("state", ...) instead.
    * 
    * @param isValid             
    */
  def onValidStateChange(isValid: Boolean): Unit = js.native
  /**
    * restores all widget values back to their init values,
    * calls onReset() which can cancel the reset by returning false
    * 
    * @param e               Optional            
    */
  /**
    * 
    */
  def reset(): Unit = js.native
  def reset(e: Event): Unit = js.native
  /**
    * See dijit/layout/_LayoutWidget.resize() for description.
    * Although ContentPane doesn't extend _LayoutWidget, it does implement
    * the same API.
    * 
    * @param changeSize             
    * @param resultSize             
    */
  def resize(changeSize: js.Any, resultSize: js.Any): Unit = js.native
  /**
    * 
    * @param val             
    */
  def setValues(`val`: js.Any): js.Any = js.native
  @JSName("set")
  def set_accept(property: accept, value: js.Object): Unit = js.native
  @JSName("set")
  def set_acceptcharset(property: `accept-charset`, value: String): Unit = js.native
  @JSName("set")
  def set_action(property: action, value: js.Object): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_doLayout(property: doLayout, value: Boolean): Unit = js.native
  @JSName("set")
  def set_encType(property: encType, value: js.Object): Unit = js.native
  @JSName("set")
  def set_isLayoutContainer(property: isLayoutContainer, value: Boolean): Unit = js.native
  @JSName("set")
  def set_method(property: method, value: js.Object): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: js.Object): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_state(property: state, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_target(property: target, value: js.Object): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * programmatically submit form if and only if the onSubmit returns true
    * 
    */
  def submit(): Unit = js.native
  /**
    * returns if the form is valid - same as isValid - but
    * provides a few additional (ui-specific) features:
    * 
    * it will highlight any sub-widgets that are not valid
    * it will call focus() on the first invalid sub-widget
    * 
    */
  def validate(): js.Any = js.native
  @JSName("watch")
  def watch_accept(property: accept, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_acceptcharset(property: `accept-charset`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_action(property: action, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_doLayout(property: doLayout, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_encType(property: encType, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLayoutContainer(property: isLayoutContainer, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_method(property: method, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_name(property: name, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_state(property: state, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_target(property: target, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

