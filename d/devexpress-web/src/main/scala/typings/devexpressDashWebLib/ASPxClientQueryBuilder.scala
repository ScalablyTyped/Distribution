package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The client-side equivalent of the ASPxQueryBuilder control.
 */
@js.native
trait ASPxClientQueryBuilder extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientQueryBuilder]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by ASPxClientQueryBuilder.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientQueryBuilder]] = js.native
  /**
       * Enables you to customize the Query Builder's localization strings.
       */
  var CustomizeLocalization: ASPxClientEvent[ASPxClientQueryBuilderCustomizeLocalizationEventHandler[ASPxClientQueryBuilder]] = js.native
  /**
       * Enables you to customize the menu actions of a Query Builder.
       */
  var CustomizeToolbarActions: ASPxClientEvent[
    ASPxClientQueryBuilderCustomizeToolbarActionsEventHandler[ASPxClientQueryBuilder]
  ] = js.native
  /**
       * Occurs on the client after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientQueryBuilder]] = js.native
  /**
       * Occurs when executing the Save command on the client.
       */
  var SaveCommandExecute: ASPxClientEvent[ASPxClientQueryBuilderSaveCommandExecuteEventHandler[ASPxClientQueryBuilder]] = js.native
  /**
       * Returns the object model of a Query Builder.
       */
  def GetDesignerModel(): js.Object = js.native
  /**
       * Gets a client-side model of the currently opened query serialized to Json.
       */
  def GetJsonQueryModel(): java.lang.String = js.native
  /**
       * Specifies whether or not the current query is a valid SQL string.
       */
  def IsQueryValid(): scala.Boolean = js.native
  /**
       * Sends a callback to the server with the specified argument.
       * @param arg A String value, specifying the callback argument.
       */
  def PerformCallback(arg: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side event, passing it the specified argument.
       * @param arg A string value that represents any information that needs to be sent to the server-side event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(arg: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Saves the current query.
       */
  def Save(): scala.Unit = js.native
  /**
       * Invokes a Previewing Results for the current query.
       */
  def ShowPreview(): scala.Unit = js.native
  /**
       * Updates the ASPxClientQueryBuilder properties' localization settings.
       * @param localization A dictionary containing the property names, along with their localized equivalents.
       */
  def UpdateLocalization(localization: ScalablyTyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

