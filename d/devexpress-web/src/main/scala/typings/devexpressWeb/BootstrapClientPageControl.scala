package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapPageControl control.
  */
@js.native
trait BootstrapClientPageControl
  extends StObject
     with ASPxClientPageControl {
  
  /**
    * Returns the HTML code that represents the contents of the specified page within the page control. A string that represents the specified page's HTML content.
    * @param tab An BootstrapClientTab object that specifies the required page.
    */
  def GetTabContentHTML(tab: BootstrapClientTab): String = js.native
  
  /**
    * Makes the specified tab active within the Page Control on the client side.
    * @param tab A BootstrapClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: BootstrapClientTab): Unit = js.native
  
  /**
    * Defines the HTML content for a specific tab page within the page control.
    * @param tab A BootstrapClientTab object that specifies the required tab page.
    * @param html A string value that represents the HTML code defining the content of the specified page.
    */
  def SetTabContentHTML(tab: BootstrapClientTab, html: String): Unit = js.native
}
