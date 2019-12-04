package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_HasDropDown.html
  *
  * Mixin for widgets that need drop down ability.
  * 
  */
@JSGlobal("dijit._HasDropDown")
@js.native
class _HasDropDown () extends _FocusMixin {
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
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * Closes the drop down on this widget
    * 
    * @param focus If true, refocuses the button widget             
    */
  def closeDropDown(focus: Boolean): Unit = js.native
  /**
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    * 
    */
  def isLoaded(): Boolean = js.native
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
  def loadDropDown(loadCallback: js.Function): Unit = js.native
  /**
    * Opens the dropdown for this widget.   To be called only when this.dropDown
    * has been created and is ready to display (ie, it's data is loaded).
    * 
    */
  def openDropDown(): js.Any = js.native
  /**
    * set up nodes and connect our mouse and keyboard events
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    * 
    */
  def toggleDropDown(): Unit = js.native
}

