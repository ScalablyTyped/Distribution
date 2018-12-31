package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the HtmlEditor extension.
  */
@js.native
trait MVCxClientHtmlEditor extends ASPxClientHtmlEditor {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientHtmlEditor: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientHtmlEditor]] = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the HtmlEditor's CustomDataCallback event on the client. This method does not update the HtmlEditor.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
    */
  def PerformDataCallback(data: js.Object): scala.Unit = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the HtmlEditor's CustomDataCallback event on the client. This method does not update the HtmlEditor.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
    * @param onCallback An ASPxClientDataCallback object that is the JavaScript function which receives the callback data as a parameter.
    */
  def PerformDataCallback(data: js.Object, onCallback: ASPxClientDataCallback): scala.Unit = js.native
}

