package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxDiagram control.
  */
trait ASPxClientDiagram extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]]
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientDiagram.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]]
  /**
    * Fires when the diagram's data is changed.
    */
  var DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]]
  /**
    * Exports the diagram data in JSON format.
    */
  def Export(): String
  /**
    * Exports the diagram to an image format.
    * @param format The image format. Acceptable values: svg, png, jpg.
    * @param callback A function to be executed after a diagram image is prepared and allows you to save the image.
    */
  def ExportTo(format: String, callback: js.Function1[/* arg */ String, Unit]): Unit
  /**
    * Imports the diagram data.
    * @param data The diagram data in JSON format.
    */
  def Import(data: String): Unit
  /**
    * Allows you to enable/disable full-screen mode.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  def SetFullscreenMode(fullscreen: Boolean): Unit
}

object ASPxClientDiagram {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]],
    DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]],
    Export: () => String,
    ExportTo: (String, js.Function1[/* arg */ String, Unit]) => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    Import: String => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetFullscreenMode: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientDiagram = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], DiagramChanged = DiagramChanged.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], Export = js.Any.fromFunction0(Export), ExportTo = js.Any.fromFunction2(ExportTo), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), Import = js.Any.fromFunction1(Import), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetFullscreenMode = js.Any.fromFunction1(SetFullscreenMode), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagram]
  }
}

