package typings.dojo.dojox.widget

import typings.dojo.dijit.MenuItem
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/PlaceholderMenuItem.html
  *
  * A menu item that can be used as a placeholder.  Set the label
  * of this item to a unique key and you can then use it to add new
  * items at that location.  This item is not displayed.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.PlaceholderMenuItem")
@js.native
class PlaceholderMenuItem () extends MenuItem {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * replaces this menu item with the given menuItems.  The original
    * menu item is not actually removed from the menu - so if you want
    * it removed, you must do that explicitly.
    *
    * @param menuItems
    */
  def replace(menuItems: js.Array[MenuItem]): js.Any = js.native
  /**
    * Removes menu items added by calling replace().  It returns the
    * array of items that were actually removed (in case you want to
    * clean them up later)
    *
    * @param destroy               OptionalAlso call destroy on any removed items.
    */
  def unReplace(destroy: Boolean): js.Any = js.native
}

