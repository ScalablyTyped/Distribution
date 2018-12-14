package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The JavaScript equivalent of the ASPxChartDesigner class.
 */
@js.native
trait ASPxClientChartDesigner extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientChartDesigner.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientChartDesigner]] = js.native
  /**
       * Enables you to customize the menu actions of a Client Chart Designer.
       */
  var CustomizeMenuActions: ASPxClientEvent[ASPxClientChartDesignerCustomizeMenuActionsEventHandler[ASPxClientChartDesigner]] = js.native
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  /**
       * Occurs when executing the Save command on the client.
       */
  var SaveCommandExecute: ASPxClientEvent[ASPxClientChartDesignerSaveCommandExecuteEventHandler[ASPxClientChartDesigner]] = js.native
  /**
       * Returns the model of the Client Chart Designer.
       */
  def GetDesignerModel(): js.Object = js.native
  /**
       * For internal use.
       */
  def GetJsonChartModel(): java.lang.String = js.native
  /**
       * Sends a callback to the server and generates the server-side event, passing it the specified argument.
       * @param arg A string value that represents any information that needs to be sent to the server-side event.
       */
  def PerformCallback(arg: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side event, passing it the specified argument.
       * @param arg A string value that represents any information that needs to be sent to the server-side event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(arg: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Updates the localization settings of the ASPxClientChartDesigner properties.
       * @param localization A dictionary containing the property names, along with their localized equivalents.
       */
  def UpdateLocalization(localization: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

