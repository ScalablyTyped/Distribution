package typings.dojo.dojox.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.dropDown
import typings.dojo.dojoStrings.invalidMessage
import typings.dojo.dojoStrings.labelText
import typings.dojo.dojoStrings.required
import typings.dojo.dojoStrings.tooltipPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/CheckedMultiSelect.html
  *
  * Extends the core dijit MultiSelect to provide a "checkbox" selector
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.CheckedMultiSelect")
@js.native
class CheckedMultiSelect ()
  extends typings.dojo.dijit.form.FormSelectWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Drop down version or not
    *
    */
  var dropDown: Boolean = js.native
  /**
    * The message to display if value is invalid.
    *
    */
  var invalidMessage: String = js.native
  /**
    * Label of the drop down button
    *
    */
  var labelText: String = js.native
  /**
    * User is required to check at least one item.
    *
    */
  var required: Boolean = js.native
  /**
    * See description of Tooltip.defaultPosition for details on this parameter.
    *
    */
  var tooltipPosition: js.Object = js.native
  /**
    * Overridable method to display validation errors/hints.
    * By default uses a tooltip.
    *
    * @param message
    */
  def displayMessage(message: String): Unit = js.native
  /**
    * Return an error message to show if appropriate
    *
    * @param isFocused
    */
  def getErrorMessage(isFocused: Boolean): js.Any = js.native
  @JSName("get")
  def get_dropDown(property: dropDown): Boolean = js.native
  @JSName("get")
  def get_invalidMessage(property: invalidMessage): String = js.native
  @JSName("get")
  def get_labelText(property: labelText): String = js.native
  @JSName("get")
  def get_required(property: required): Boolean = js.native
  @JSName("get")
  def get_tooltipPosition(property: tooltipPosition): js.Object = js.native
  /**
    * Invert the selection
    *
    * @param onChange If null, onChange is not fired.
    */
  def invertSelection(onChange: Boolean): Unit = js.native
  /**
    * a function that can be connected to in order to receive a
    * notification that an item as been added to this dijit.
    *
    * @param item
    * @param option
    */
  def onAfterAddOptionItem(item: js.Any, option: js.Any): Unit = js.native
  @JSName("set")
  def set_dropDown(property: dropDown, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidMessage(property: invalidMessage, value: String): Unit = js.native
  @JSName("set")
  def set_labelText(property: labelText, value: String): Unit = js.native
  @JSName("set")
  def set_required(property: required, value: Boolean): Unit = js.native
  @JSName("set")
  def set_tooltipPosition(property: tooltipPosition, value: js.Object): Unit = js.native
  /**
    *
    * @param isFocused
    */
  def validate(isFocused: js.Any): js.Any = js.native
  /**
    * Overridable function used to validate that an item is selected if required =
    * true.
    *
    */
  def validator(): js.Any = js.native
  @JSName("watch")
  def watch_dropDown(
    property: dropDown,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_invalidMessage(
    property: invalidMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelText(
    property: labelText,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_required(
    property: required,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tooltipPosition(
    property: tooltipPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

