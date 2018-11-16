package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the ASPxLoadingPanel control.
 */

trait ASPxClientLoadingPanel extends ASPxClientControl {
  /**
       * Gets the text displayed within the ASPxLoadingPanel.
       */
  def GetText(): java.lang.String
  /**
       * Hides the loading panel.
       */
  def Hide(): scala.Unit
  /**
       * Sets the text to be displayed within the ASPxLoadingPanel.
       * @param text A string value specifying the text to be displayed within the ASPxLoadingPanel.
       */
  def SetText(text: java.lang.String): scala.Unit
  /**
       * Invokes the loading panel.
       */
  def Show(): scala.Unit
  /**
       * Invokes the loading panel at the specified position.
       * @param x An integer value specifying the x-coordinate of the loading panel's display position.
       * @param y An integer value specifying the y-coordinate of the loaidng panel's display position.
       */
  def ShowAtPos(x: scala.Double, y: scala.Double): scala.Unit
  /**
       * Invokes the loading panel, displaying it over the specified HTML element.
       * @param htmlElement An object that specifies the required HTML element.
       */
  def ShowInElement(htmlElement: js.Object): scala.Unit
  /**
       * Invokes the loading panel, displaying it over the specified element.
       * @param id A string that specifies the required element's identifier.
       */
  def ShowInElementByID(id: java.lang.String): scala.Unit
}

