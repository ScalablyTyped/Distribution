package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.iconClass
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.showLabel
import typings.dojo.dojoStrings.value
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/Button.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ButtonMixin because Inheritance from two classes. Inlined label, postCreate, onClick */ @JSGlobal("dijit.form.Button")
@js.native
class Button () extends _FormWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Class to apply to DOMNode in button to make it display an icon
    * 
    */
  var iconClass: String = js.native
  /**
    * Content to display in button.
    * 
    */
  var label: String = js.native
  /**
    * Set this to true to hide the label text and display only the icon.
    * (If showLabel=false then iconClass must be specified.)
    * Especially useful for toolbars.
    * If showLabel=true, the label will become the title (a.k.a. tooltip/hint) of the icon.
    * 
    * The exception case is for computers in high-contrast mode, where the label
    * will still be displayed, since the icon doesn't appear.
    * 
    */
  var showLabel: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_Button: String = js.native
  @JSName("get")
  def get_iconClass(property: iconClass): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_showLabel(property: showLabel): Boolean = js.native
  /**
    * Connect to this function to receive notifications of mouse click events.
    * 
    * @param event mouse Event             
    */
  /**
    * Callback for when button is clicked.
    * If type="submit", return true to perform submit, or false to cancel it.
    * 
    * @param e             
    */
  def onClick(event: Event): Boolean = js.native
  /**
    * Deprecated.  Use set('label', ...) instead.
    * 
    * @param content             
    */
  def setLabel(content: String): Unit = js.native
  @JSName("set")
  def set_iconClass(property: iconClass, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_showLabel(property: showLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_iconClass(
    property: iconClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showLabel(
    property: showLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

