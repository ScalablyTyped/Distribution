package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.DropDownMenu
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.autoWidth
import typings.dojo.dojoStrings.dropDown
import typings.dojo.dojoStrings.dropDownPosition
import typings.dojo.dojoStrings.emptyLabel
import typings.dojo.dojoStrings.focusedChild
import typings.dojo.dojoStrings.forceWidth
import typings.dojo.dojoStrings.maxHeight
import typings.dojo.dojoStrings.message
import typings.dojo.dojoStrings.multiCharSearchDuration
import typings.dojo.dojoStrings.required
import typings.dojo.dojoStrings.state
import typings.dojo.dojoStrings.tooltipPosition
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/DropDownSelect.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._FocusMixin because Already inherited
- typings.dojo.dijit._KeyNavMixin because Inheritance from two classes. Inlined childSelector, focusedChild, multiCharSearchDuration, focus, focusChild, focusFirstChild, focusLastChild, onKeyboardSearch
- typings.dojo.dijit._HasDropDown because Inheritance from two classes. Inlined autoWidth, dropDown, dropDownPosition, forceWidth, maxHeight, buildRendering, closeDropDown, destroy, isLoaded, loadAndOpenDropDown, loadDropDown, openDropDown, postCreate, toggleDropDown */ @JSGlobal("dojox.form.DropDownSelect")
@js.native
class DropDownSelect ()
  extends typings.dojo.dijit.form._FormSelectWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Set to true to make the drop down at least as wide as this
    * widget.  Set to false if the drop down should just be its
    * default width.
    *
    */
  var autoWidth: Boolean = js.native
  /**
    * Selector (passed to on.selector()) used to identify what to treat as a child widget.   Used to monitor
    * focus events and set this.focusedChild.   Must be set by implementing class.   If this is a string
    * (ex: "> *") then the implementing class must require dojo/query.
    * 
    */
  var childSelector: js.Any = js.native
  /**
    * The widget to display as a popup.  This widget must be
    * defined before the startup function is called.
    *
    */
  var dropDown: js.Object = js.native
  /**
    * This variable controls the position of the drop down.
    * It's an array of strings with the following values:
    *
    * before: places drop down to the left of the target node/widget, or to the right in
    * the case of RTL scripts like Hebrew and Arabic
    * after: places drop down to the right of the target node/widget, or to the left in
    * the case of RTL scripts like Hebrew and Arabic
    * above: drop down goes above target node
    * below: drop down goes below target node
    * The list is positions is tried, in order, until a position is found where the drop down fits
    * within the viewport.
    *
    */
  var dropDownPosition: js.Object = js.native
  /**
    * What to display in an "empty" dropdown
    *
    */
  var emptyLabel: String = js.native
  /**
    * The currently focused child widget, or null if there isn't one
    *
    */
  var focusedChild: js.Object = js.native
  /**
    * Set to true to make the drop down exactly as wide as this
    * widget.  Overrides autoWidth.
    *
    */
  var forceWidth: Boolean = js.native
  /**
    * The max height for our dropdown.
    * Any dropdown taller than this will have scrollbars.
    * Set to 0 for no max height, or -1 to limit height to available space in viewport
    *
    */
  var maxHeight: Double = js.native
  /**
    * Currently displayed error/prompt message
    *
    */
  var message: String = js.native
  /**
    * If multiple characters are typed where each keystroke happens within
    * multiCharSearchDuration of the previous keystroke,
    * search for nodes matching all the keystrokes.
    *
    * For example, typing "ab" will search for entries starting with
    * "ab" unless the delay between "a" and "b" is greater than multiCharSearchDuration.
    *
    */
  var multiCharSearchDuration: Double = js.native
  /**
    * Can be true or false, default is false.
    *
    */
  var required: Boolean = js.native
  /**
    * "Incomplete" if this select is required but unset (i.e. blank value), "" otherwise
    *
    */
  var state: String = js.native
  /**
    * See description of dijit/Tooltip.defaultPosition for details on this parameter.
    *
    */
  var tooltipPosition: js.Object = js.native
  /**
    *
    * @param node
    */
  def childSelector(node: HTMLElement): js.Any = js.native
  /**
    * Closes the drop down on this widget
    *
    * @param focus If true, refocuses the button widget
    */
  /**
    * Closes the drop down on this widget
    * 
    * @param focus If true, refocuses the button widget             
    */
  def closeDropDown(focus: Boolean): Unit = js.native
  def destroy(preserveDom: js.Any): Unit = js.native
  /**
    * Sets the value to the given option, used during search by letter.
    *
    * @param widget Reference to option's widget
    */
  def focusChild(widget: _WidgetBase): Unit = js.native
  /**
    * Focus specified child widget.
    * 
    * @param widget Reference to container's child widget             
    * @param last If true and if widget has multiple focusable nodes, focus thelast one instead of the first one             
    */
  def focusChild(widget: _WidgetBase, last: Boolean): Unit = js.native
  /**
    * Focus the first focusable child in the container.
    *
    */
  /**
    * Focus the first focusable child in the container.
    * 
    */
  def focusFirstChild(): Unit = js.native
  /**
    * Focus the last focusable child in the container.
    *
    */
  /**
    * Focus the last focusable child in the container.
    * 
    */
  def focusLastChild(): Unit = js.native
  @JSName("get")
  def get_autoWidth(property: autoWidth): Boolean = js.native
  @JSName("get")
  def get_dropDown(property: dropDown): js.Object = js.native
  @JSName("get")
  def get_dropDownPosition(property: dropDownPosition): js.Object = js.native
  @JSName("get")
  def get_emptyLabel(property: emptyLabel): String = js.native
  @JSName("get")
  def get_focusedChild(property: focusedChild): js.Object = js.native
  @JSName("get")
  def get_forceWidth(property: forceWidth): Boolean = js.native
  @JSName("get")
  def get_maxHeight(property: maxHeight): Double = js.native
  @JSName("get")
  def get_message(property: message): String = js.native
  @JSName("get")
  def get_multiCharSearchDuration(property: multiCharSearchDuration): Double = js.native
  @JSName("get")
  def get_required(property: required): Boolean = js.native
  @JSName("get")
  def get_state(property: state): String = js.native
  @JSName("get")
  def get_tooltipPosition(property: tooltipPosition): js.Object = js.native
  /**
    *
    */
  def isLoaded(): js.Any = js.native
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    * 
    */
  @JSName("isLoaded")
  def isLoaded_Boolean(): Boolean = js.native
  /**
    * Whether or not this is a valid value.  The only way a Select
    * can be invalid is when it's required but nothing is selected.
    *
    * @param isFocused
    */
  @JSName("isValid")
  def isValid_MDropDownSelect(isFocused: Boolean): Boolean = js.native
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and
    * then opens the drop down.  This is basically a callback when the
    * user presses the down arrow button to open the drop down.
    *
    */
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and
    * then opens the drop down.  This is basically a callback when the
    * user presses the down arrow button to open the drop down.
    * 
    */
  def loadAndOpenDropDown(): js.Any = js.native
  /**
    * populates the menu
    *
    * @param loadCallback
    */
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and then calls
    * the given callback.
    * 
    * @param loadCallback             
    */
  def loadDropDown(loadCallback: js.Function): Unit = js.native
  /**
    * When a key is pressed that matches a child item,
    * this method is called so that a widget can take appropriate action is necessary.
    *
    * @param item
    * @param evt
    * @param searchString
    * @param numMatches
    */
  /**
    * When a key is pressed that matches a child item,
    * this method is called so that a widget can take appropriate action is necessary.
    * 
    * @param item             
    * @param evt             
    * @param searchString             
    * @param numMatches             
    */
  def onKeyboardSearch(item: _WidgetBase, evt: Event, searchString: String, numMatches: Double): Unit = js.native
  /**
    * Opens the dropdown for this widget.   To be called only when this.dropDown
    * has been created and is ready to display (ie, it's data is loaded).
    *
    */
  /**
    * Opens the dropdown for this widget.   To be called only when this.dropDown
    * has been created and is ready to display (ie, it's data is loaded).
    * 
    */
  def openDropDown(): js.Any = js.native
  @JSName("set")
  def set_autoWidth(property: autoWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dropDown(property: dropDown, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dropDownPosition(property: dropDownPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_emptyLabel(property: emptyLabel, value: String): Unit = js.native
  @JSName("set")
  def set_focusedChild(property: focusedChild, value: js.Object): Unit = js.native
  @JSName("set")
  def set_forceWidth(property: forceWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxHeight(property: maxHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_message(property: message, value: String): Unit = js.native
  @JSName("set")
  def set_multiCharSearchDuration(property: multiCharSearchDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_required(property: required, value: Boolean): Unit = js.native
  @JSName("set")
  def set_state(property: state, value: String): Unit = js.native
  @JSName("set")
  def set_tooltipPosition(property: tooltipPosition, value: js.Object): Unit = js.native
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    *
    */
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    * 
    */
  def toggleDropDown(): Unit = js.native
  /**
    * Called by oninit, onblur, and onkeypress, and whenever required/disabled state changes
    * Show missing or invalid messages if appropriate, and highlight textbox field.
    * Used when a select is initially set to no value and the user is required to
    * set the value.
    *
    * @param isFocused
    */
  def validate(isFocused: Boolean): js.Any = js.native
  @JSName("watch")
  def watch_autoWidth(
    property: autoWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dropDown(
    property: dropDown,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dropDownPosition(
    property: dropDownPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_emptyLabel(
    property: emptyLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_focusedChild(
    property: focusedChild,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_forceWidth(
    property: forceWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxHeight(
    property: maxHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_message(
    property: message,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_multiCharSearchDuration(
    property: multiCharSearchDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_required(
    property: required,
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
  def watch_tooltipPosition(
    property: tooltipPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

@JSGlobal("dojox.form.DropDownSelect")
@js.native
object DropDownSelect extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/DropDownSelect._Menu.html
    *
    * An internally-used menu for dropdown that allows us a vertical scrollbar
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class _Menu () extends DropDownMenu {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  }
  
}

