package typings.dojo.dijit

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/MenuBarItem.html
  *
  * Item in a MenuBar that's clickable, and doesn't spawn a submenu when pressed (or hovered)
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.MenuBarItem")
@js.native
class MenuBarItem () extends MenuItem {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

@JSGlobal("dijit.MenuBarItem")
@js.native
object MenuBarItem extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/MenuBarItem._MenuBarItemMixin.html
    *
    * 
    */
  @js.native
  class _MenuBarItemMixin () extends js.Object {
    /**
      * 
      */
    var templateString: String = js.native
  }
  
}

