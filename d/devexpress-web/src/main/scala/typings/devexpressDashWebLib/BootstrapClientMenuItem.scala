package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the menu's BootstrapMenuItem object.
 */

trait BootstrapClientMenuItem extends ASPxClientMenuItem {
  /**
       * Gets the immediate parent item to which the current item belongs.
       * Value: A BootstrapClientMenuItem object representing the item's immediate parent.
       */
  @JSName("parent")
  var parent_BootstrapClientMenuItem: BootstrapClientMenuItem
  /**
       * Gets the CSS class of the icon displayed within the menu item badge.
       */
  def GetBadgeIconCssClass(): java.lang.String
  /**
       * Gets the text displayed within the menu item badge.
       */
  def GetBadgeText(): java.lang.String
  /**
       * Gets the CSS class of the icon displayed by the menu item.
       */
  def GetIconCssClass(): java.lang.String
  /**
       * Sets the CSS class of the icon displayed within the menu item badge.
       * @param cssClass A string containing the name of a CSS class.
       */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
       * Sets the text displayed within the menu item badge.
       * @param text A String specifying the badge text.
       */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
       * Sets the CSS class of the icon displayed by the menu item.
       * @param cssClass A string containing the name of a CSS class.
       */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

