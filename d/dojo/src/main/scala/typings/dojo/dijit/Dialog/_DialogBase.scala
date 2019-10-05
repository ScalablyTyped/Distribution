package typings.dojo.dijit.Dialog

import typings.dojo.Fn_Boolean
import typings.dojo.dijit._TemplatedMixin
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogBase.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit._DialogMixin because Inheritance from two classes. Inlined execute, onCancel, onExecute
- typings.dojo.dijit.form._FormMixin because Inheritance from two classes. Inlined state, connectChildren, destroy, disconnectChildren, getValues, isValid, isValid_Original, reset, setValues, startup, validate, onValidStateChange */ @JSGlobal("dijit.Dialog._DialogBase")
@js.native
class _DialogBase () extends _TemplatedMixin {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * A Toggle to modify the default focus behavior of a Dialog, which
    * is to focus on the first dialog element after opening the dialog.
    * False will disable autofocusing. Default: true
    * 
    */
  var autofocus: Boolean = js.native
  /**
    * 
    */
  var baseClass: String = js.native
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
    * Don't change this parameter from the default value.
    * This ContentPane parameter doesn't make sense for Dialog, since Dialog
    * is never a child of a layout container, nor can you specify the size of
    * Dialog in order to control the size of an inner widget.
    * 
    */
  var doLayout: Boolean = js.native
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
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  var isValid_Original: Fn_Boolean = js.native
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
    * Will be "Error" if one or more of the child widgets has an invalid value,
    * "Incomplete" if not all of the required child widgets are filled in.  Otherwise, "",
    * which indicates that the form is ready to be submitted.
    * 
    */
  var state: String = js.native
  /**
    * You can call this function directly, ex. in the event that you
    * programmatically add a widget to the form after the form has been
    * initialized.
    * 
    * @param inStartup             
    */
  def connectChildren(inStartup: Boolean): Unit = js.native
  /**
    * 
    */
  def destroy(): Unit = js.native
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
    * 
    */
  def getValues(): js.Any = js.native
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
  def isValid(): Boolean = js.native
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
    * Called when data has been loaded from an href.
    * Unlike most other callbacks, this function can be connected to (via dojo.connect)
    * but should not be overridden.
    * 
    */
  def onLoad(): Unit = js.native
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
  def postCreate(): Unit = js.native
  /**
    * 
    */
  def postMixInProperties(): Unit = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
  /**
    * 
    * @param val             
    */
  def setValues(`val`: js.Any): js.Any = js.native
  /**
    * Display the dialog
    * 
    */
  def show(): js.Any = js.native
  /**
    * 
    */
  def startup(): Unit = js.native
  /**
    * returns if the form is valid - same as isValid - but
    * provides a few additional (ui-specific) features:
    * 
    * it will highlight any sub-widgets that are not valid
    * it will call focus() on the first invalid sub-widget
    * 
    */
  def validate(): js.Any = js.native
}

