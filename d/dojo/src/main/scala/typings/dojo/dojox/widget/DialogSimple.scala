package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autofocus_
import typings.dojo.dojoStrings.closable
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.draggable
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.maxRatio
import typings.dojo.dojoStrings.open
import typings.dojo.dojoStrings.refocus
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.state
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojox.layout.ContentPane
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/DialogSimple.html
  *
  * A Simple Dialog Mixing the dojox.layout.ContentPane functionality over
  * top of a vanilla dijit.Dialog. See dojox.widget.Dialog for a more flexible
  * dialog option allowing animations and different styles/theme support.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit._DialogMixin because Inheritance from two classes. Inlined execute, onCancel, onExecute
- typings.dojo.dijit.form._FormMixin because Inheritance from two classes. Inlined state, connectChildren, destroy, disconnectChildren, getValues, reset, setValues, startup, validate, onValidStateChange
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.DialogSimple")
@js.native
class DialogSimple () extends ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    *
    */
  var active: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * A Toggle to modify the default focus behavior of a Dialog, which
    * is to focus on the first dialog element after opening the dialog.
    * False will disable autofocusing. Default: true
    *
    */
  var autofocus: Boolean = js.native
  /**
    * Dialog show [x] icon to close itself, and ESC key will close the dialog.
    *
    */
  var closable: Boolean = js.native
  /**
    *
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Toggles the movable aspect of the Dialog. If true, Dialog
    * can be dragged by it's title. If false it will remain centered
    * in the viewport.
    *
    */
  var draggable: Boolean = js.native
  /**
    * The time in milliseconds it takes the dialog to fade in and out
    *
    */
  var duration: Double = js.native
  /**
    * True if cursor is over this widget
    *
    */
  var hovering: Boolean = js.native
  /**
    * Maximum size to allow the dialog to expand to, relative to viewport size
    *
    */
  var maxRatio: Double = js.native
  /**
    * True if Dialog is currently displayed on screen.
    *
    */
  var open: Boolean = js.native
  /**
    * A Toggle to modify the default focus behavior of a Dialog, which
    * is to re-focus the element which had focus before being opened.
    * False will disable refocusing. Default: true
    *
    */
  var refocus: Boolean = js.native
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
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autofocus(property: autofocus_): Boolean = js.native
  @JSName("get")
  def get_closable(property: closable): Boolean = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_draggable(property: draggable): Boolean = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_maxRatio(property: maxRatio): Double = js.native
  @JSName("get")
  def get_open(property: open): Boolean = js.native
  @JSName("get")
  def get_refocus(property: refocus): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_state(property: state): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Hide the dialog
    *
    */
  def hide(): js.Any = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    *
    */
  @JSName("isValid")
  def isValid_MDialogSimple(): Boolean = js.native
  /**
    * Called when user has pressed the Dialog's cancel button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    *
    */
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
  /**
    * Called when user has pressed the dialog's OK button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    * 
    */
  def onExecute(): Unit = js.native
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
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autofocus(property: autofocus_, value: Boolean): Unit = js.native
  @JSName("set")
  def set_closable(property: closable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_draggable(property: draggable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxRatio(property: maxRatio, value: Double): Unit = js.native
  @JSName("set")
  def set_open(property: open, value: Boolean): Unit = js.native
  @JSName("set")
  def set_refocus(property: refocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_state(property: state, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * Display the dialog
    *
    */
  def show(): js.Any = js.native
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
  def watch_active(
    property: active,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autofocus(
    property: autofocus_,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_closable(
    property: closable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(
    property: cssStateNodes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_draggable(
    property: draggable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(
    property: hovering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxRatio(
    property: maxRatio,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_open(
    property: open,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_refocus(
    property: refocus,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_state(
    property: state,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

