package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as the base class for controls that implement panel functionality.
 */

trait ASPxClientPanelBase extends ASPxClientControl {
  /**
       * Returns the HTML code that is the content of the panel.
       */
  def GetContentHtml(): java.lang.String
  /**
       * Returns a value specifying whether a panel is enabled.
       */
  def GetEnabled(): scala.Boolean
  /**
       * Sets the HTML content for the panel.
       * @param html A string value that is the HTML code defining the content of the panel.
       */
  def SetContentHtml(html: java.lang.String): scala.Unit
  /**
       * Sets a value specifying whether the panel is enabled.
       * @param enabled true to enable the panel; false to disable it.
       */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
}

