package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapPageControl control.
 */
@js.native
trait BootstrapClientPageControl extends ASPxClientPageControl {
  /**
       * Returns the HTML code that represents the contents of the specified page within the page control.
       * @param tab An BootstrapClientTab object that specifies the required page.
       */
  def GetTabContentHTML(tab: BootstrapClientTab): java.lang.String = js.native
  /**
       * Makes the specified tab active within the Page Control on the client side.
       * @param tab A BootstrapClientTab object specifying the tab to select.
       */
  def SetActiveTab(tab: BootstrapClientTab): scala.Unit = js.native
  /**
       * Defines the HTML content for a specific tab page within the page control.
       * @param tab A BootstrapClientTab object that specifies the required tab page.
       * @param html A string value that represents the HTML code defining the content of the specified page.
       */
  def SetTabContentHTML(tab: BootstrapClientTab, html: java.lang.String): scala.Unit = js.native
}

