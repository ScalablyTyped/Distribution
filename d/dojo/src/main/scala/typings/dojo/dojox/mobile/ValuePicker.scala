package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ValuePicker.html
  *
  * A value picker that has a stepper.
  * ValuePicker is a widget for selecting values. The values
  * can be selected by using the Plus or Minus buttons, or by
  * entering the value directly into the input field.
  * This type of value picker is typically seen on Android devices.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.ValuePicker")
@js.native
class ValuePicker () extends _PickerBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Callback when the slot value is changed.
    *
    * @param slot The slot widget whose value has been changed.
    */
  def onValueChanged(slot: ValuePickerSlot): Unit = js.native
}

