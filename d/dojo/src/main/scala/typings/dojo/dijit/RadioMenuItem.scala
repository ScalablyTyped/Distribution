package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.group
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/RadioMenuItem.html
  *
  * A radio-button-like menu item for toggling on and off
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.RadioMenuItem")
@js.native
class RadioMenuItem () extends CheckedMenuItem {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Toggling on a RadioMenuItem in a given group toggles off the other RadioMenuItems in that group.
    * 
    */
  var group: String = js.native
  @JSName("get")
  def get_group(property: group): String = js.native
  @JSName("set")
  def set_group(property: group, value: String): Unit = js.native
  @JSName("watch")
  def watch_group(
    property: group,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

