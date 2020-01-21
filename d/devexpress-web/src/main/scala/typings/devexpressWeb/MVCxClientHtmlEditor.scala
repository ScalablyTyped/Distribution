package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the HtmlEditor extension.
  */
@JSGlobal("MVCxClientHtmlEditor")
@js.native
class MVCxClientHtmlEditor () extends ASPxClientHtmlEditor {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientHtmlEditor: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientHtmlEditor]] = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the HtmlEditor's HtmlEditorSettings.CustomDataActionRouteValues property, and then return the processing result to the ASPxClientHtmlEditor.CustomDataCallback event on the client. This method does not update the HtmlEditor.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the HtmlEditorSettings.CustomDataActionRouteValues property.
    * @param onCallback An ASPxClientDataCallback object that is the JavaScript function which receives the callback data as a parameter.
    */
  def PerformDataCallback(data: js.Any): Unit = js.native
  def PerformDataCallback(data: js.Any, onCallback: ASPxClientDataCallback): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientHtmlEditor")
@js.native
object MVCxClientHtmlEditor extends js.Object {
  /**
    * Converts the specified object to the MVCxClientHtmlEditor type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientHtmlEditor = js.native
}

