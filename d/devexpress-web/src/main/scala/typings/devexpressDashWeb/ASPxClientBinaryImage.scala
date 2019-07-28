package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxBinaryImage control.
  */
@js.native
trait ASPxClientBinaryImage extends ASPxClientEdit {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientBinaryImage]] = js.native
  /**
    * Fires on the client side if any server error occurs during server-side processing of a callback sent by the ASPxClientBinaryImage.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientBinaryImage]] = js.native
  /**
    * Occurs on the client side after an image is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientBinaryImage]] = js.native
  /**
    * Occurs after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientBinaryImage]] = js.native
  /**
    * Removes an image from the editor content.
    */
  def Clear(): Unit = js.native
  /**
    * Returns a name of the last uploaded file.
    */
  def GetUploadedFileName(): String = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param parameter A string value that contains any information that needs to be sent to the server-side CustomCallback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param parameter A string value that contains any information that needs to be sent to the server-side CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
  /**
    * Sets the size of the image editor.
    * @param width An integer value that specifies the control's width.
    * @param height An integer value that specifies the control's height.
    */
  def SetSize(width: Double, height: Double): Unit = js.native
}

