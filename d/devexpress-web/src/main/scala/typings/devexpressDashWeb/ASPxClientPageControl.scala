package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxPageControl object.
  */
@js.native
trait ASPxClientPageControl extends ASPxClientTabControlBase {
  /**
    * Returns the HTML code that represents the contents of the specified page within the page control.
    * @param tab An ASPxClientTab object that specifies the required page.
    */
  def GetTabContentHTML(tab: ASPxClientTab): String = js.native
  /**
    * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
  /**
    * Defines the HTML content for a specific tab page within the page control.
    * @param tab An ASPxClientTab object that specifies the required tab page.
    * @param html A string value that represents the HTML code defining the content of the specified page.
    */
  def SetTabContentHTML(tab: ASPxClientTab, html: String): Unit = js.native
}

