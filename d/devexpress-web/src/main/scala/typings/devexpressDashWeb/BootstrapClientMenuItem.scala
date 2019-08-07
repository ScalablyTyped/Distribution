package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's BootstrapMenuItem object.
  */
@JSGlobal("BootstrapClientMenuItem")
@js.native
class BootstrapClientMenuItem () extends ASPxClientMenuItem {
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  @JSName("parent")
  var parent_BootstrapClientMenuItem: BootstrapClientMenuItem = js.native
  /**
    * Gets the CSS class of the icon displayed within the menu item badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within the menu item badge.
    */
  def GetBadgeText(): String = js.native
  /**
    * Gets the CSS class of the icon displayed by the menu item.
    */
  def GetIconCssClass(): String = js.native
  /**
    * Sets the CSS class of the icon displayed within the menu item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within the menu item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed by the menu item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit = js.native
}

