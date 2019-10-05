package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_Boolean
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit.layout.ContentPane
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autofocus
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.state
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/TooltipDialog.html
  *
  * Pops up a dialog that appears like a Tooltip
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._DialogMixin because Inheritance from two classes. Inlined execute, onCancel, onExecute
- typings.dojo.dijit.form._FormMixin because Inheritance from two classes. Inlined state, connectChildren, destroy, disconnectChildren, getValues, isValid_Original, reset, setValues, startup, validate, onValidStateChange
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.TooltipDialog")
@js.native
class TooltipDialog () extends ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * A Toggle to modify the default focus behavior of a Dialog, which
    * is to focus on the first dialog element after opening the dialog.
    * False will disable autofocusing.  Default: true.
    * 
    */
  var autofocus: Boolean = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  var isValid_Original: Fn_Boolean = js.native
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
  /**
    * Deprecated method.   Applications no longer need to call this.   Remove for 2.0.
    * 
    */
  def disconnectChildren(): Unit = js.native
  /**
    * Callback when the user hits the submit button.
    * Override this method to handle Dialog execution.
    * After the user has pressed the submit button, the Dialog
    * first calls onExecute() to notify the container to hide the
    * dialog and restore focus to wherever it used to be.
    * 
    * Then this method is called.
    * 
    * @param formContents             
    */
  def execute(formContents: js.Object): Unit = js.native
  /**
    * Focus on first field
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
    * 
    */
  /**
    * 
    */
  def getValues(): js.Any = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autofocus(property: autofocus): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_state(property: state): String = js.native
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
  def isValid_MTooltipDialog(): Boolean = js.native
  /**
    * Called when user has pressed the Dialog's cancel button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    * 
    */
  def onCancel(): Unit = js.native
  /**
    * Called when user has pressed the dialog's OK button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    * 
    */
  def onExecute(): Unit = js.native
  /**
    * Called when dialog is displayed.
    * This is called from the dijit.popup code, and should not be called directly.
    * 
    * @param pos             
    */
  def onOpen(pos: js.Object): Unit = js.native
  /**
    * Stub function to connect to if you want to do something
    * (like disable/enable a submit button) when the valid
    * state changes on the form as a whole.
    * 
    * Deprecated.  Will be removed in 2.0.  Use watch("state", ...) instead.
    * 
    * @param isValid             
    */
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
    * Configure widget to be displayed in given position relative to the button.
    * This is called from the dijit.popup code, and should not be called
    * directly.
    * 
    * @param node             
    * @param aroundCorner             
    * @param tooltipCorner             
    */
  def orient(node: HTMLElement, aroundCorner: String, tooltipCorner: String): Unit = js.native
  /**
    * 
    */
  /**
    * 
    */
  def reset(): Unit = js.native
  /**
    * 
    * @param val             
    */
  /**
    * 
    * @param val             
    */
  def setValues(`val`: js.Any): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_state(property: state, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * returns if the form is valid - same as isValid - but
    * provides a few additional (ui-specific) features:
    * 
    * it will highlight any sub-widgets that are not valid
    * it will call focus() on the first invalid sub-widget
    * 
    */
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
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autofocus(property: autofocus, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_state(property: state, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

