package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of a tab control's BootstrapTabPage object.
 */

trait BootstrapClientTab extends ASPxClientTab {
  /**
       * Gets the CSS class of an icon displayed by the tab when it is active.
       */
  def GetActiveIconCssClass(): java.lang.String
  /**
       * Gets the CSS class of the icon displayed within the tab badge.
       */
  def GetBadgeIconCssClass(): java.lang.String
  /**
       * Gets the text displayed within the tab badge.
       */
  def GetBadgeText(): java.lang.String
  /**
       * Gets the CSS class of the icon displayed by the tab.
       */
  def GetIconCssClass(): java.lang.String
  /**
       * Sets the CSS class of an icon displayed by the tab when it is active.
       * @param cssClass A String containing the name of a CSS class.
       */
  def SetActiveIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
       * Sets the CSS class of the icon displayed within the tab badge.
       * @param cssClass A string containing the name of a CSS class.
       */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
       * Sets the text displayed within the tab badge.
       * @param text A String specifying the badge text.
       */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
       * Sets the CSS class of the icon displayed by the tab.
       * @param cssClass A string containing the name of a CSS class.
       */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

