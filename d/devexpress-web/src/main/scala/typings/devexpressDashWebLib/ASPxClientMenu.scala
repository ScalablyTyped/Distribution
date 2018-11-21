package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the ASPxMenu object.
 */

trait ASPxClientMenu extends ASPxClientMenuBase {
  /**
       * Gets a value specifying the menu orientation.
       */
  def GetOrientation(): java.lang.String
  /**
       * Sets the menu orientation.
       * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
       */
  def SetOrientation(orientation: java.lang.String): scala.Unit
  /**
       * Expands or collapses the side menu.
       */
  def ToggleSideMenu(): scala.Unit
}

