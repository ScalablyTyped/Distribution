package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dojoStrings.optionsTitle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/ComboButton.html
  *
  * A combination button and drop-down button.
  * Users can click one side to "press" the button, or click an arrow
  * icon to display the drop down.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.form.ComboButton")
@js.native
class ComboButton () extends DropDownButton {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Text that describes the options menu (accessibility)
    * 
    */
  var optionsTitle: String = js.native
  def focus(position: String): Unit = js.native
  @JSName("get")
  def get_optionsTitle(property: optionsTitle): String = js.native
  @JSName("set")
  def set_optionsTitle(property: optionsTitle, value: String): Unit = js.native
  @JSName("watch")
  def watch_optionsTitle(property: optionsTitle, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

