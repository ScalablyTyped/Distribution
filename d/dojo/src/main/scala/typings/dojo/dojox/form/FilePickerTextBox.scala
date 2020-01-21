package typings.dojo.dojox.form

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.form.ValidationTextBox
import typings.dojo.dojoStrings.autoWidth
import typings.dojo.dojoStrings.dropDown
import typings.dojo.dojoStrings.dropDownPosition
import typings.dojo.dojoStrings.forceWidth
import typings.dojo.dojoStrings.maxHeight
import typings.dojo.dojoStrings.numPanes
import typings.dojo.dojoStrings.searchDelay
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.valueItem
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/FilePickerTextBox.html
  *
  * A validating text box tied to a file picker popup
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.FocusMixin because Already inherited
- typings.dojo.dijit.HasDropDown because Inheritance from two classes. Inlined autoWidth, dropDown, dropDownPosition, forceWidth, maxHeight, buildRendering, closeDropDown, destroy, isLoaded, loadAndOpenDropDown, loadDropDown, openDropDown, postCreate, toggleDropDown */ @JSGlobal("dojox.form.FilePickerTextBox")
@js.native
class FilePickerTextBox () extends ValidationTextBox {
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
    * The number of panes to display in our box (if we don't have any
    * minPaneWidth specified by our constraints)
    *
    */
  var numPanes: Double = js.native
  /**
    * Delay in milliseconds between when user types something and we start
    * searching based on that value
    *
    */
  var searchDelay: Double = js.native
  /**
    * The item, in our store, of the directory relating to our value
    *
    */
  var valueItem: js.Object = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  @JSName("value")
  var value_FilePickerTextBox: String = js.native
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
  @JSName("get")
  def get_autoWidth(property: autoWidth): Boolean = js.native
  @JSName("get")
  def get_dropDown(property: dropDown): js.Object = js.native
  @JSName("get")
  def get_dropDownPosition(property: dropDownPosition): js.Object = js.native
  @JSName("get")
  def get_forceWidth(property: forceWidth): Boolean = js.native
  @JSName("get")
  def get_maxHeight(property: maxHeight): Double = js.native
  @JSName("get")
  def get_numPanes(property: numPanes): Double = js.native
  @JSName("get")
  def get_searchDelay(property: searchDelay): Double = js.native
  @JSName("get")
  def get_valueItem(property: valueItem): js.Object = js.native
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    *
    */
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    * 
    */
  def isLoaded(): Boolean = js.native
  /**
    * Tests if value is valid.
    * Can override with your own routine in a subclass.
    *
    * @param isFocused
    */
  @JSName("isValid")
  def isValid_MFilePickerTextBox(isFocused: Boolean): js.Any = js.native
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
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and then calls
    * the given callback.
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
    * Opens the dropdown for this widget.   To be called only when this.dropDown
    * has been created and is ready to display (ie, it's data is loaded).
    * 
    */
  def openDropDown(): js.Any = js.native
  /**
    *
    */
  @JSName("openDropDown")
  def openDropDown_Unit(): Unit = js.native
  @JSName("set")
  def set_autoWidth(property: autoWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dropDown(property: dropDown, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dropDownPosition(property: dropDownPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_forceWidth(property: forceWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxHeight(property: maxHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_numPanes(property: numPanes, value: Double): Unit = js.native
  @JSName("set")
  def set_searchDelay(property: searchDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_valueItem(property: valueItem, value: js.Object): Unit = js.native
  /**
    *
    */
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    * 
    */
  def toggleDropDown(): Unit = js.native
  @JSName("watch")
  def watch_autoWidth(
    property: autoWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDown(
    property: dropDown,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDownPosition(
    property: dropDownPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_forceWidth(
    property: forceWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maxHeight(
    property: maxHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_numPanes(
    property: numPanes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchDelay(
    property: searchDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_valueItem(
    property: valueItem,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

