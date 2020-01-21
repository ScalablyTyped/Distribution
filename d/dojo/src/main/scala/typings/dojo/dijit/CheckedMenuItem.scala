package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.checked
import typings.dojo.dojoStrings.checkedChar
import typings.dojo.dojoStrings.role
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/CheckedMenuItem.html
  *
  * A checkbox-like menu item for toggling on and off
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.CheckedMenuItem")
@js.native
class CheckedMenuItem () extends MenuItem {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Our checked state
    * 
    */
  var checked: Boolean = js.native
  /**
    * Character (or string) used in place of checkbox icon when display in high contrast mode
    * 
    */
  var checkedChar: String = js.native
  /**
    * 
    */
  var role: String = js.native
  @JSName("get")
  def get_checked(property: checked): Boolean = js.native
  @JSName("get")
  def get_checkedChar(property: checkedChar): String = js.native
  @JSName("get")
  def get_role(property: role): String = js.native
  /**
    * User defined function to handle check/uncheck events
    * 
    * @param checked             
    */
  def onChange(checked: Boolean): Unit = js.native
  @JSName("set")
  def set_checked(property: checked, value: Boolean): Unit = js.native
  @JSName("set")
  def set_checkedChar(property: checkedChar, value: String): Unit = js.native
  @JSName("set")
  def set_role(property: role, value: String): Unit = js.native
  @JSName("watch")
  def watch_checked(
    property: checked,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_checkedChar(
    property: checkedChar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_role(
    property: role,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

