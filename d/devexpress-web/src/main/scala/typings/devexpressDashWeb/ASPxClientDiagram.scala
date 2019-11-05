package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxDiagram control.
  */
@JSGlobal("ASPxClientDiagram")
@js.native
class ASPxClientDiagram () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]] = js.native
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientDiagram.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]] = js.native
  /**
    * Fires when the diagram's data is changed.
    */
  var DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]] = js.native
  /**
    * Exports the diagram data in JSON format.
    */
  def Export(): String = js.native
  /**
    * Exports the diagram to an image format.
    * @param format The image format. Acceptable values: svg, png, jpg.
    * @param callback A function to be executed after a diagram image is prepared and allows you to save the image.
    */
  def ExportTo(format: String, callback: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Imports the diagram data.
    * @param data The diagram data in JSON format.
    */
  def Import(data: String): Unit = js.native
  /**
    * Allows you to enable/disable full-screen mode.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  def SetFullscreenMode(fullscreen: Boolean): Unit = js.native
}

