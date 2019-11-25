package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.checked
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/ToggleButton.html
  *
  * A templated button widget that can be in two states (checked or not).
  * Can be base class for things like tabs or checkbox or radio buttons.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ToggleButtonMixin because Inheritance from two classes. Inlined checked, postCreate, reset */ @JSGlobal("dijit.form.ToggleButton")
@js.native
class ToggleButton () extends Button {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * In markup, specified as "checked='checked'" or just "checked".
    * True if the button is depressed, or the checkbox is checked,
    * or the radio button is selected, etc.
    * 
    */
  var checked: Boolean = js.native
  @JSName("get")
  def get_checked(property: checked): Boolean = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  /**
    * Deprecated.  Use set('checked', true/false) instead.
    * 
    * @param checked             
    */
  def setChecked(checked: Boolean): Unit = js.native
  @JSName("set")
  def set_checked(property: checked, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_checked(
    property: checked,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

